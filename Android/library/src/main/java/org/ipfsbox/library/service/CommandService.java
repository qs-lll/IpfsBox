package org.ipfsbox.library.service;

import org.ipfsbox.library.entity.Add;
import org.ipfsbox.library.entity.Commands;
import org.ipfsbox.library.entity.Config;
import org.ipfsbox.library.entity.Dag;
import org.ipfsbox.library.entity.Id;
import org.ipfsbox.library.entity.Stats_bw;
import org.ipfsbox.library.entity.Swarm;
import org.ipfsbox.library.entity.Version;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CommandService {
    @POST("add")
    @Multipart
    Call<Add> add(@Part MultipartBody.Part part);

    @GET("version")
    Call<Version> version();

    @GET("id")
    Call<Id> id();

    @GET("commands")
    Call<Commands> commands();

    interface pin {
        @GET("Pin/ls?type={type}")
        Call<String> ls(@Path("type") String type);
    }

    interface stats {
        @POST("stats/bw")
        Call<Stats_bw> bw();
    }

    interface swarm {
        @GET("stats/bw")
        Call<Swarm.connect> connect(@Query("arg") String arg);
    }

    interface config {
        @GET("config/show")
        Call<Config.show> show();
    }

    interface dag {
        @GET("dag/get")
        Call<Dag> get(@Query("arg") String arg);
    }
}
