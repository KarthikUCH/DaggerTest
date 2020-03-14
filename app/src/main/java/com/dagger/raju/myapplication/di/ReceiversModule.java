package com.dagger.raju.myapplication.di;

import androidx.annotation.NonNull;

import com.dagger.raju.myapplication.network.NetworkChannel;
import com.dagger.raju.myapplication.di.scope.AppScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by raju on 7/4/19.
 */

@Module
public class ReceiversModule {

    @Provides
    @NonNull
    @AppScope
    NetworkChannel providesNetworkChannel(){
        return new NetworkChannel();
    }
}
