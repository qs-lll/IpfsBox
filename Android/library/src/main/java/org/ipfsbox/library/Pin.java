package org.ipfsbox.library;

import org.ipfsbox.library.service.CommandService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

class Pin {
    Retrofit retrofit;

    enum LsType {
        direct, indirect, recursive, all
    }

    public Pin(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public void add() {
    }

    public void rm() {
    }

    public void update() {
    }

    public void verify() {
    }

    public void ls(Callback<String> callback, LsType type) {
        CommandService.pin pin = retrofit.create(CommandService.pin.class);
        Call<String> ls = pin.ls(type.name());
        ls.enqueue(callback);
    }
}
