package org.ipfsbox.box.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.umeng.analytics.MobclickAgent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.ipfsbox.box.MainActivity;
import org.ipfsbox.box.R;
import org.ipfsbox.box.event.CmdIntentServiceDaemonEvent;
import org.ipfsbox.box.event.ExecLog;
import org.ipfsbox.box.services.CmdIntentService;

import butterknife.BindView;
import butterknife.ButterKnife;

public class IndexActivity extends BaseActivity {
    @BindView(R.id.tvLog)
    TextView tvLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
        ButterKnife.bind(this);
        getSupportActionBar().hide();

        CmdIntentService.startActionDaemon(this);

    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void MessageEvent(CmdIntentServiceDaemonEvent event) {
        MobclickAgent.onEvent(this,"IndexActivity_successDaemon");
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void MessageEvent(ExecLog event) {
        tvLog.append(event.log + "\n");
        if (event.log.contains("shutdown")) {
            CmdIntentService.startActionDaemon(this);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }
}
