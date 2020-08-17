package org.ipfsbox.box.utils;

import android.app.Dialog;
import android.content.Context;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import org.ipfsbox.box.R;


/**
 * 弹窗管理
 * Created by qs on 2018/1/3.
 */

public class DialogUtil {
    private static Dialog dialog;
    private static Context context;


    private static Dialog getInstance(Context context) {

        if (dialog == null || context == null || DialogUtil.context != context) {
            DialogUtil.context = context;
//            dialog = new Dialog(context);
            dialog = new Dialog(context);
        }
        return dialog;
    }

    public static Dialog create(Context context, @LayoutRes int layoutResID) {
        Dialog instance = getInstance(context);
//        ImmersionBar.with((Activity) context, instance,"instance").statusBarDarkFont(true, 0.3f).init();
        instance.setContentView(layoutResID);
        return instance;
    }

    public static Dialog create(Context context, View view) {
        Dialog instance = getInstance(context);
//        ImmersionBar.with((Activity) context, instance,"instance").statusBarDarkFont(true, 0.3f).init();
        instance.setContentView(view);
        return instance;
    }

    /**
     * 基本弹窗
     *
     * @param message
     */
    public static Dialog createGeneral(Context context, String message) {
        Dialog instance = create(context, R.layout.dialog_general);
//        ImmersionBar.with((Activity) context, instance,"instance").statusBarDarkFont(true, 0.3f).init();
        ((TextView) instance.findViewById(R.id.message)).setText("" + message);
        return instance;
    }

    /**
     * 基本弹窗，修改文按，按钮
     *
     * @param message
     */
    public static Dialog createGeneral(Context context, String message,String ok,String cancel) {
        Dialog instance = create(context, R.layout.dialog_general);
//        ImmersionBar.with((Activity) context, instance,"instance").statusBarDarkFont(true, 0.3f).init();
        if (!TextUtils.isEmpty(message)){
            ((TextView) instance.findViewById(R.id.message)).setText("" + message);
        }
        if (!TextUtils.isEmpty(ok)){
            ((TextView) instance.findViewById(R.id.Positive)).setText("" + ok);
        }
        if (!TextUtils.isEmpty(cancel)){
            ((TextView) instance.findViewById(R.id.Negative)).setText("" + cancel);
        }
        return instance;
    }

//    /**
//     * 创建progress 进度条提示
//     * @param context
//     * @param message
//     * @return
//     */
//    public static Dialog createProgress(Context context,String title, String message) {
//        Dialog instance = create(context, R.layout.dialog_progress);
//        ((TextView) instance.findViewById(R.id.message)).setMovementMethod(new ScrollingMovementMethod());
//        instance.setCancelable(false);
//        instance.setCanceledOnTouchOutside(false);
//        if (!TextUtils.isEmpty(message)){
//            ((TextView) instance.findViewById(R.id.message)).setText("" + message);
//        }
//        if (!TextUtils.isEmpty(title)){
//            ((TextView) instance.findViewById(R.id.title)).setText("" + title);
//        }
//        return instance;
//    }





    /**
     * 根据id设置点击事件
     *
     * @param dialog
     * @param id
     * @param onClickListener
     */
    public static void addOnClickListener(Dialog dialog, @IdRes int id, View.OnClickListener onClickListener) {
        dialog.findViewById(id).setOnClickListener(onClickListener);
    }
}
