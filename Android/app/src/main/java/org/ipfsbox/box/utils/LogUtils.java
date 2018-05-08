package org.ipfsbox.box.utils;

import android.util.Log;

public class LogUtils {
    public LogUtils() {
    }

    public static void e(String message) {
        Log.e(""+getLineInfo(), message);
    }
    public static String getLineInfo()
    {
        StackTraceElement ste = new Throwable().getStackTrace()[1];
        return ste.getFileName() + ": Line " + ste.getLineNumber();
    }
}
