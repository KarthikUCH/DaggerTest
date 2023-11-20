package com.kvr.navigation.core;

import android.app.Application;


/**
 * Created by raju on 7/4/19.
 */
public class App extends Application {

    //private static AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        //appComponent = buildComponent();
    }


    /*private AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .receiversModule(new ReceiversModule())
                .utilsModule(new UtilsModule())
                .build();
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }*/

}
