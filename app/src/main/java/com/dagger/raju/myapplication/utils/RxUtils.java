package com.dagger.raju.myapplication.utils;

import android.content.Context;

/**
 * Created by raju on 7/4/19.
 */
public class RxUtils {

    private final Context context;

    public RxUtils(Context context) {
        this.context = context;
    }

    public void performRxOperation() {
        System.out.println("Performing Rx Operation");
    }

    public String getData() {
        return "RxUtils";
    }
}
