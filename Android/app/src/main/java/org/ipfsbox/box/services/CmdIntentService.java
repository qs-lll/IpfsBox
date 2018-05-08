package org.ipfsbox.box.services;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

import org.ipfsbox.box.event.CmdIntentServiceAddEvent;
import org.ipfsbox.box.event.CmdIntentServiceDaemonEvent;
import org.ipfsbox.box.utils.IpfsExec;
import org.ipfsbox.box.utils.LogUtils;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;

/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * helper methods.
 */
public class CmdIntentService extends IntentService {

    private static final String EXTRA_FILEPATH = "EXTRA_FILEPATH";
    public static final String EXTRA_EXEC = "EXTRA_EXEC";

    Thread thread;
    EXEC_TYPE exec_type;
    String absPath;//Files absPath(@Add())

    Handler handler = new Handler();

    enum EXEC_TYPE {
        daemon, shutdown, add
    }

    public CmdIntentService() {
        super("CmdIntentService");
    }

    public static void startActionAdd(Context context, String path) {
        Intent intent = new Intent(context, CmdIntentService.class);
        intent.putExtra(EXTRA_EXEC, EXEC_TYPE.add);
        intent.putExtra(EXTRA_FILEPATH, path);
        context.startService(intent);
    }

    public static void startActionDaemon(Context context) {
        Intent intent = new Intent(context, CmdIntentService.class);
        intent.putExtra(EXTRA_EXEC, EXEC_TYPE.daemon);
        context.startService(intent);
    }

    public static void startActionShutdown(Context context) {
        Intent intent = new Intent(context, CmdIntentService.class);
        intent.putExtra(EXTRA_EXEC, EXEC_TYPE.shutdown);
        context.startService(intent);
    }


    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            try {
                exec_type = (EXEC_TYPE) intent.getSerializableExtra(EXTRA_EXEC);
                switch (exec_type) {
                    case daemon:
                        daemon();
                        break;
                    case shutdown:
                        shutdown();
                        break;
                    case add:
                        absPath = intent.getStringExtra(EXTRA_FILEPATH);
                        add(absPath);
                        break;
                }
            } catch (Exception e) {
                LogUtils.e(e.getMessage() + "");
                e.printStackTrace();
            }
        }
    }

    private void daemon() throws IOException {
        IpfsExec.getInstance(getBaseContext()).init();
        if (IpfsExec.getInstance(getBaseContext()).daemon()) {
            EventBus.getDefault().post(new CmdIntentServiceDaemonEvent());
        }
        startService(new Intent(this,BwService.class));
    }

    private void shutdown() throws IOException {
        IpfsExec.getInstance(getBaseContext()).shutDown();
    }

    private void add(String absPath) throws IOException, InterruptedException {
        final String addedHash = IpfsExec.getInstance(getBaseContext()).add(absPath);
        if (addedHash != null) {
            EventBus.getDefault().post(new CmdIntentServiceAddEvent(addedHash));
        }
    }



}
