package org.ipfsbox.box.utils;

import android.content.Context;
import android.os.Environment;

/**
 * Constants
 */
public class Constants {
    /**
     * ipfs nodes
     */
    public static class IpfsNode {
        public static String[] node = {
                "http://gateway.ipfs.guide:8080/ipfs/@",
                "http://gateway.ipfs.so/ipfs/@",
                "http://p1.cdn.img9.top/ipfs/@",
                "http://45.77.178.121/ipfs/@",
                "https://xmine128.tk/ipfs/@",
                "https://ipfs.leiyun.org/ipfs/@"};
    }

    public static class API {
        private static String api = "/api/v0/";

        public static class stats {
            private static String api = API.api + "stats/";
            public static final String bw = api + "bw";
            public static final String bitswap = api + "bitswap";
            public static final String repo = api + "repo";
        }
    }

    public static class Dir {
        public static String getLocalDir(Context context) {
            return context.getFilesDir().getAbsolutePath();
        }

        public static String getSDdir(Context context) {
            return context.getExternalFilesDir(Environment.DIRECTORY_DOCUMENTS).getAbsolutePath();
        }
    }
}
