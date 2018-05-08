package org.ipfsbox.library;

import retrofit2.Retrofit;

public class Bootstrap {
    Retrofit retrofit;

    public Bootstrap(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public add add() {
        return new add(retrofit);
    }

    public rm rm() {

        return new rm(retrofit);
    }

    public void list() {

    }

    public class add {
        Retrofit retrofit;

        public add(Retrofit retrofit) {
            this.retrofit = retrofit;
        }

        public void Default() {

        }
    }

    public class rm {
        Retrofit retrofit;

        public rm(Retrofit retrofit) {
            this.retrofit = retrofit;
        }

        public void all() {

        }
    }
}
