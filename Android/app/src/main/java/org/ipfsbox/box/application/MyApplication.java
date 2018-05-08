package org.ipfsbox.box.application;

import android.app.Application;
import android.content.Context;

import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;

public class MyApplication extends Application {
    public static Context context ;
    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        UMConfigure.init(this, "5ad7367db27b0a189c000092", "Tele", UMConfigure.DEVICE_TYPE_PHONE, null);
        MobclickAgent.setScenarioType(this, MobclickAgent.EScenarioType.E_UM_NORMAL);

        UMConfigure.setLogEnabled(true);
    }
}
