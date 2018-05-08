package org.ipfsbox.library;

import retrofit2.Retrofit;

public class Diag {
    Retrofit retrofit;

    public Diag(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public void sys() {

    }

    public class cmds {
        Retrofit retrofit;

        public cmds(Retrofit retrofit) {
            this.retrofit = retrofit;
        }

        public void clear() {

        }

        public void set_time() {

        }
    }
}
