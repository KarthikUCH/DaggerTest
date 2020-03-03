package com.dagger.raju.myapplication.di.chat;

import android.content.Context;

import com.dagger.raju.myapplication.chat.ChatInteract;
import com.dagger.raju.myapplication.chat.ChatStateController;
import com.dagger.raju.myapplication.chat.IChatInteract;
import com.dagger.raju.myapplication.chat.IChatStateController;
import com.dagger.raju.myapplication.di.scope.ChatScope;
import com.dagger.raju.myapplication.repository.IDataRepository;
import com.dagger.raju.myapplication.utils.RxUtils;

import dagger.Module;
import dagger.Provides;

@Module
public class ChatModule {

    @Provides
    @ChatScope
    public IChatStateController provideIChatStateController(RxUtils rxUtils){
        return new ChatStateController(rxUtils);
    }

    @Provides
    @ChatScope
    public IChatInteract provideIChatInteract(Context context, IDataRepository iDataRepository, IChatStateController iChatStateController){
        return new ChatInteract(context, iDataRepository, iChatStateController);
    }
}
