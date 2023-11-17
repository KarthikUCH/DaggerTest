package com.dagger.raju.myapplication.di;

import android.content.Context;
import androidx.annotation.NonNull;

import com.raju.karthikeyan.payment.di.scope.AppScope;
import dagger.Module;
import dagger.Provides;

/**
 * Created by raju on 7/4/19.
 */
@Module
public class AppModule {

    private Context appContext;

    public AppModule(Context appContext) {
        this.appContext = appContext;
    }

    @Provides
    @NonNull
    @AppScope
    Context providesContext() {
        return appContext;
    }
}
