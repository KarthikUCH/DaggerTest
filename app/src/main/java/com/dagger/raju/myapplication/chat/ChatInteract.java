package com.dagger.raju.myapplication.chat;

import android.content.Context;

import com.dagger.raju.myapplication.repository.IDataRepository;

public class ChatInteract implements IChatInteract {

    private final Context context;
    private final IDataRepository iDataRepository;
    private final IChatStateController iChatStateController;

    public ChatInteract(Context context, IDataRepository iDataRepository, IChatStateController iChatStateController) {
        this.context = context;
        this.iDataRepository = iDataRepository;
        this.iChatStateController = iChatStateController;
    }

    @Override
    public String getData() {
        return "ChatInteract";
    }
}
