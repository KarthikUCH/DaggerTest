package com.dagger.raju.myapplication.utils;

import android.content.Context;

import com.dagger.raju.myapplication.network.NetworkChannel;

/**
 * Created by raju on 7/4/19.
 */
public class NetworkUtil {

    private final Context context;
    private final NetworkChannel networkChannel;

    public NetworkUtil(Context context, NetworkChannel networkChannel) {
        this.context = context;
        this.networkChannel = networkChannel;
    }

    public String getData(){
        return "NetworkUtil";
    }
}
