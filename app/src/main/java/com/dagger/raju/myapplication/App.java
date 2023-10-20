package com.dagger.raju.myapplication;

import android.app.Application;

import com.dagger.raju.myapplication.di.AppComponent;
import com.dagger.raju.myapplication.di.AppModule;
import com.dagger.raju.myapplication.di.DaggerAppComponent;
import com.dagger.raju.myapplication.di.ReceiversModule;
import com.dagger.raju.myapplication.di.UtilsModule;
import com.dagger.raju.myapplication.di.chat.ChatComponent;
import com.dagger.raju.myapplication.di.chat.ChatModule;

/**
 * Created by raju on 7/4/19.
 */
public class App extends Application {

    private static AppComponent appComponent;
    private static ChatComponent chatComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = buildComponent();
        chatComponent = buildChatComponent();
    }


    private AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .receiversModule(new ReceiversModule()) // Not Mandatory to include, as it will be automatically handled
                .utilsModule(new UtilsModule()) // Not Mandatory to include, as it will be automatically handled
                .build();
    }

    private ChatComponent buildChatComponent() {
        if(chatComponent ==null){
            chatComponent = appComponent.plusChatComponent(new ChatModule());
        }
        return chatComponent;
    }

    public void clearChatComponent() {
        // end lifecycle of chatComponent
        chatComponent = null;
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }

    public static ChatComponent getChatComponent() {
        return chatComponent;
    }
}
