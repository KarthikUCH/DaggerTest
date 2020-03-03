package com.dagger.raju.myapplication.chat;

import com.dagger.raju.myapplication.utils.RxUtils;

public class ChatStateController implements IChatStateController {

    private final RxUtils rxUtils;

    public ChatStateController(RxUtils rxUtils) {
        this.rxUtils = rxUtils;
    }

    @Override
    public String getData() {
        return "ChatStateController";
    }
}
