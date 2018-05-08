package org.ipfsbox.library;

import retrofit2.Retrofit;

public class Object {
    Retrofit retrofit;

    public Object(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public void data() {

    }

    public void diff() {

    }

    public void get() {
    }

    public void links() {
    }

    public void New() {
    }

    public patch patch() {
        return new patch(retrofit);
    }

    public void put() {
    }

    public void stat() {
    }

    public class patch {
        Retrofit retrofit;

        public patch(Retrofit retrofit) {
            this.retrofit = retrofit;
        }

        public void add_link() {
        }

        public void append_data() {
        }

        public void rm_link() {
        }

        public void set_data() {
        }
    }
}
