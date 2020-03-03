package com.dagger.raju.myapplication;

import android.app.Application;

import com.dagger.raju.myapplication.di.AppComponent;
import com.dagger.raju.myapplication.di.AppModule;
import com.dagger.raju.myapplication.di.DaggerAppComponent;
import com.dagger.raju.myapplication.di.ReceiversModule;
import com.dagger.raju.myapplication.di.UtilsModule;

/**
 * Created by raju on 7/4/19.
 */
public class App extends Application {

    private static AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = buildComponent();
    }


    private AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .receiversModule(new ReceiversModule())
                .utilsModule(new UtilsModule())
                .build();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }

}
