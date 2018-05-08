package org.ipfsbox.box.utils;

import android.widget.Toast;

import org.ipfsbox.box.application.MyApplication;

public class ToastUtils {
    private static ToastUtils toastUtils;
    public Toast toast;

    public static ToastUtils getInstance() {
        if (toastUtils==null) {
            toastUtils = new ToastUtils();
        }
        return toastUtils;
    }

    public Toast getToast() {
        if (toast==null) {
            toast = Toast.makeText(MyApplication.context,"",Toast.LENGTH_SHORT);
        }
        return toast;
    }

    public static void show(String str) {
        Toast t = getInstance().getToast();
        t.setText(str);
        t.show();
    }
}
