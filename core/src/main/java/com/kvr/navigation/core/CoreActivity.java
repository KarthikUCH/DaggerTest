package com.kvr.navigation.core;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class CoreActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core);

        Intent intent = new Intent();
        intent.setClassName("com.dagger.raju.myapplication", "com.dagger.raju.myapplication.MainActivity");
        startActivity(intent);

    }
}
