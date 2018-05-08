package org.ipfsbox.library;

import android.util.Log;

import org.ipfsbox.library.entity.Commands;
import org.ipfsbox.library.entity.Id;
import org.ipfsbox.library.entity.Version;
import org.ipfsbox.library.service.CommandService;

import java.io.File;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class IpfsBox {
    Retrofit retrofit;

    /**
     * use default url
     */
    public IpfsBox() {
        this("http://127.0.0.1:5001");
    }

    public IpfsBox(String baseUrl) {
        retrofit = new Retrofit.Builder().baseUrl(baseUrl + "/api/v0/").addConverterFactory(GsonConverterFactory.create()).build();
//        ApiService apiService = retrofit.create(ApiService.class);
    }


    public void add(retrofit2.Callback callback, String path) {
        CommandService commandService = retrofit.create(CommandService.class);
        File file = new File(path);
        Log.e("log", file.length() + "");
        RequestBody requestBody = RequestBody.create(MediaType.parse("video/mp4"), file);
        MultipartBody.Part data = MultipartBody.Part.createFormData("data", file.getName(), requestBody);
        Call add = commandService.add(data);
        add.enqueue(callback);
    }

    public void version(retrofit2.Callback<Version> callback) {
        CommandService commandService = retrofit.create(CommandService.class);
        Call<Version> version = commandService.version();
        version.enqueue(callback);
    }

    /**
     * need download FILE?
     *
     * @param callback
     */
    public void cat(retrofit2.Callback<String> callback) {

    }

    public void commands(retrofit2.Callback<Commands> callback) {
        CommandService commandService = retrofit.create(CommandService.class);
        commandService.commands().enqueue(callback);

    }

    public void dns(retrofit2.Callback<String> callback) {

    }

    public void get(retrofit2.Callback<String> callback) {

    }

    public void id(retrofit2.Callback<Id> callback) {
        CommandService commandService = retrofit.create(CommandService.class);
        Call<Id> id = commandService.id();
        id.enqueue(callback);
    }

    public void ls(retrofit2.Callback<String> callback) {

    }

    public void mount(retrofit2.Callback<String> callback) {

    }

    public void ping(retrofit2.Callback<String> callback) {

    }

    public void resolve(retrofit2.Callback<String> callback) {

    }

    public void shutdown(retrofit2.Callback<String> callback) {

    }

    public void update(retrofit2.Callback<String> callback) {

    }

    public Stats stats() {
        return new Stats(retrofit);
    }

    public Pin pin() {
        return new Pin(retrofit);
    }

    public Bootstrap bootstrap() {
        return new Bootstrap(retrofit);
    }

    public Swarm swarm() {
        return new Swarm(retrofit);
    }

    public Config config() {
        return new Config();
    }

    public Dag dag() {
        return new Dag(retrofit);
    }
}
