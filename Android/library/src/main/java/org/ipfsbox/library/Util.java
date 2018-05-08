package org.ipfsbox.library;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Util {
    public void enqueue(Call call, Callback callback) {
        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {

            }

            @Override
            public void onFailure(Call call, Throwable t) {

            }
        });
    }
}
