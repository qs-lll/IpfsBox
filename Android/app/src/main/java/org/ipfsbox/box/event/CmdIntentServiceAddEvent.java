package org.ipfsbox.box.event;

/**
 * Add hash
 */
public class CmdIntentServiceAddEvent {
    public String hashCode;
    public int progress = 0;

    public CmdIntentServiceAddEvent(String hashCode) {
        this.hashCode = hashCode;
    }

    public void onHashCode(String hashCode) {

    }

    // TODO: 2018/4/17 下载进度提示
    public void onProgress(int progress) {

    }//0-100
}
