package com.dagger.raju.myapplication.di;

import android.content.Context;
import androidx.annotation.NonNull;

import com.dagger.raju.myapplication.network.NetworkChannel;
import com.dagger.raju.myapplication.utils.NetworkUtil;
import com.dagger.raju.myapplication.utils.RxUtils;
import com.raju.karthikeyan.payment.di.scope.AppScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by raju on 7/4/19.
 */

@Module
public class UtilsModule {

    @Provides
    @NonNull
    @AppScope
    NetworkUtil providesNetworkUtil(Context context, NetworkChannel networkChannel) {
        return new NetworkUtil(context, networkChannel);
    }

    @Provides
    @NonNull
    @AppScope
    RxUtils providesRxUtils(Context context) {
        return new RxUtils(context);
    }
}
