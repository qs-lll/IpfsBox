package org.ipfsbox.library;

import org.ipfsbox.library.service.CommandService;

import retrofit2.Callback;
import retrofit2.Retrofit;

public class Dag {
    Retrofit retrofit;

    public Dag(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public void get(Callback<org.ipfsbox.library.entity.Dag> callback, String hash) {
        CommandService.dag dag = retrofit.create(CommandService.dag.class);
        dag.get(hash).enqueue(callback);
    }

    public void put() {

    }

    public void resolve() {

    }
}
