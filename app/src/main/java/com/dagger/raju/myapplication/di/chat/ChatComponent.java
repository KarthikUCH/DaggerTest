package com.dagger.raju.myapplication.di.chat;

import com.dagger.raju.myapplication.ChatActivity;
import com.dagger.raju.myapplication.di.AppComponent;
import com.dagger.raju.myapplication.di.scope.ChatScope;

import dagger.Component;


@Component(dependencies = AppComponent.class, modules = {ChatModule.class})
@ChatScope
public interface ChatComponent {

    void inject(ChatActivity chatActivity);
}
