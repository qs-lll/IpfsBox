package org.ipfsbox.library;

import retrofit2.Retrofit;

public class P2p {
    Retrofit retrofit;

    public P2p(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public listener listener() {
        return new listener(retrofit);
    }

    public stream stream() {
        return new stream(retrofit);
    }

    public class listener {
        Retrofit retrofit;

        public listener(Retrofit retrofit) {
            this.retrofit = retrofit;
        }

        public void close() {

        }

        public void ls() {

        }

        public void open() {

        }
    }

    public class stream {
        Retrofit retrofit;

        public stream(Retrofit retrofit) {
            this.retrofit = retrofit;
        }

        public void close() {

        }

        public void dial() {

        }

        public void ls() {

        }
    }
}
