package org.ipfsbox.library;

import org.ipfsbox.library.service.CommandService;

import retrofit2.Callback;
import retrofit2.Retrofit;

public class Swarm {
    Retrofit retrofit;

    public Swarm(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public void connect(Callback<org.ipfsbox.library.entity.Swarm.connect> callback, String path) {
        CommandService.swarm swarm = retrofit.create(CommandService.swarm.class);
        swarm.connect(path).enqueue(callback);
    }

    public void disconnect() {
    }

    public void peers() {
    }

    public addrs addrs() {
        return new addrs(retrofit);
    }

    public filters filters() {
        return new filters(retrofit);
    }

    public class addrs {
        Retrofit retrofit;

        public addrs(Retrofit retrofit) {
            this.retrofit = retrofit;
        }

        public void listen() {
        }

        public void local() {
        }
    }

    public class filters {
        Retrofit retrofit;

        public filters(Retrofit retrofit) {
            this.retrofit = retrofit;
        }

        public void add() {
        }

        public void rm() {
        }
    }
}
