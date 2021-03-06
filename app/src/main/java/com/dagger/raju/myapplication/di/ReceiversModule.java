package com.dagger.raju.myapplication.di;

import android.support.annotation.NonNull;

import com.dagger.raju.myapplication.network.NetworkChannel;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by raju on 7/4/19.
 */

@Module
public class ReceiversModule {

    @Provides
    @NonNull
    @Singleton
    NetworkChannel providesNetworkChannel(){
        return new NetworkChannel();
    }
}
