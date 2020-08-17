package org.ipfsbox.box.utils;

import android.content.Context;
import android.os.Build;

import org.ipfsbox.box.event.ExecLog;

import org.greenrobot.eventbus.EventBus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


/**
 * IpfsExec 操作方法
 */
public class IpfsExec {
    private Context context;
    private static IpfsExec ipfsNode;

    public static IpfsExec getInstance(Context context) {
        if (ipfsNode == null) {
            ipfsNode = new IpfsExec(context);
        }
        return ipfsNode;
    }

    public IpfsExec(Context context) {
        this.context = context;
    }

    // TODO: 2018/5/8  low power
    public void init() throws IOException {
        save();
        LogUtils.e("version?:" + new File(Constants.Dir.getSDdir(context) + "/.ipfsNode/version").exists());
        if (!new File(Constants.Dir.getSDdir(context) + "/.ipfsNode/version").exists()) {
            Process init = command("init");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(init.getInputStream()));
            try {
                String log = null;
                while ((log = bufferedReader.readLine()) != null) {
                    LogUtils.e(log + "\n");
                    EventBus.getDefault().post(new ExecLog(log + ""));
//                if (log.contains("readme")) {
//                    bufferedReader.close();
////                    return;
//                }
                }
                init.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                bufferedReader.close();
            }


        }
        return;

    }

    /**
     * 启动
     *
     * @return true is running
     * @throws IOException
     */
    public boolean daemon() throws IOException {
        Process exec = command("daemon");
        BufferedReader daemon = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        String log = null;
        while ((log = daemon.readLine()) != null) {
            LogUtils.e(log + "\n");
            EventBus.getDefault().post(new ExecLog(log + ""));
            if (log.equals("Daemon is ready")) {
                daemon.close();
                return true;
            }
        }
        return false;
//        return command("daemon");
    }

    /**
     * 关闭
     *
     * @throws IOException
     */
    public void shutDown() throws IOException {
        command("shutdown");
    }

    public String add(String absPath) throws IOException, InterruptedException {
        if (new File(absPath).exists()) {
            Process exec = command("Add " + absPath);
            BufferedReader command = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            String log = null;
            while (true) {
//                Thread.sleep(1);
                if ((log = command.readLine()) != null) {
                    LogUtils.e(log + "\n");
                    if (log.contains("added")) {
                        return log.split(" ")[1];
                    }
                }
            }
        } else {
            throw new FileNotFoundException();
        }
    }

    /**
     * 保存文件到本地存储
     *
     * @throws IOException
     */
    private void save() throws IOException {
        if (!new File(Constants.Dir.getLocalDir(context) + "/ipfsNode").exists()) {
            InputStream open;
//LogUtils.e(context.getAssets().+"");
            if (Build.CPU_ABI.contains("x86")) {
                open = context.getAssets().open("x86");
            } else if (Build.CPU_ABI.contains("arm")) {
                open = context.getAssets().open("arm");
            } else {
//            ToastUtils.show("unknown cpu" + Build.CPU_ABI);
                return;
            }
            LogUtils.e(Constants.Dir.getLocalDir(context) + "");
            FileOutputStream fileOutputStream = new FileOutputStream(Constants.Dir.getLocalDir(context) + "/ipfsNode");
            byte[] bytes = new byte[1024];
            int size = 0;
            while ((size = open.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, size);
            }
            open.close();
            fileOutputStream.close();

            Process exec = Runtime.getRuntime().exec("chmod 777 " + Constants.Dir.getLocalDir(context) + "/ipfsNode");
            try {
                exec.waitFor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * cmd
     *
     * @param cmd
     * @throws IOException
     */
    public Process command(String cmd) throws IOException {
//        ProgressDialog progressDialog = new ProgressDialog(context);
//        progressDialog.show();

        String[] envp = {("IPFS_PATH=" + Constants.Dir.getSDdir(context) + "/.ipfsNode")};
        String command = Constants.Dir.getLocalDir(context) + "/ipfsNode " + cmd;
        Process exec = Runtime.getRuntime().exec(command, envp);
//        BufferedReader inputStreamReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
        return exec;
//        String log = null;
//        while((log = inputStreamReader.readLine()) != null) {
//                LogUtils.e(log + "\n");
//            if (log.equals("Daemon is ready")) {
//                return true;
//            }
//        }
//        return false;
//        progressDialog.dismiss();
    }
}
