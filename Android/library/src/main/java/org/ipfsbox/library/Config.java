package org.ipfsbox.library;

import org.ipfsbox.library.service.CommandService;

import retrofit2.Callback;
import retrofit2.Retrofit;

public class Config {
    Retrofit retrofit;

    /**
     * can not used!!!!
     * ENV variable $EDITOR not set
     */
    public void edit() {

    }

    public void replace() {

    }

    /**
     * todo this show config is not complete
     */
    public void show(Callback<org.ipfsbox.library.entity.Config.show> callback) {
        CommandService.config config = retrofit.create(CommandService.config.class);
        config.show().enqueue(callback);
    }
}
