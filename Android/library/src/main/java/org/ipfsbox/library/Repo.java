package org.ipfsbox.library;

import retrofit2.Retrofit;

public class Repo {
    Retrofit retrofit;

    public Repo(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public void fsck() {
    }

    public void gc() {
    }

    public void stat() {
    }

    public void verify() {
    }

    public void version() {
    }
}
