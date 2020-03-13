package com.dagger.raju.myapplication.di;

import android.content.Context;
import androidx.annotation.NonNull;

import com.dagger.raju.myapplication.network.NetworkChannel;
import com.dagger.raju.myapplication.utils.NetworkUtil;
import com.dagger.raju.myapplication.utils.RxUtils;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by raju on 7/4/19.
 */

@Module
public class UtilsModule {

    @Provides
    @NonNull
    @Singleton
    NetworkUtil providesNetworkUtil(Context context, NetworkChannel networkChannel) {
        return new NetworkUtil(context, networkChannel);
    }

    @Provides
    @NonNull
    @Singleton
    RxUtils providesRxUtils(Context context) {
        return new RxUtils(context);
    }
}
