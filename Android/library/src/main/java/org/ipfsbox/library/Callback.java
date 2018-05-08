package org.ipfsbox.library;

import retrofit2.Call;
import retrofit2.Response;

public abstract class Callback implements retrofit2.Callback {
    @Override
    public void onResponse(Call call, Response response) {
//        response.;
//        response.body().
    }

    @Override
    public void onFailure(Call call, Throwable t) {

    }
}
