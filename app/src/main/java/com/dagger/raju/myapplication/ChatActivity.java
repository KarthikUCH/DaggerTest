package com.dagger.raju.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.dagger.raju.myapplication.chat.IChatInteract;
import com.dagger.raju.myapplication.repository.IDataRepository;

import javax.inject.Inject;

public class ChatActivity extends AppCompatActivity {

    @Inject
    IChatInteract iChatInteract;

    @Inject
    IDataRepository iDataRepository;

    TextView tvTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        App.getChatComponent().inject(this);

        tvTitle = findViewById(R.id.tvTitle);

        tvTitle.setText(iChatInteract.getData());

        tvTitle.append("\n");
        tvTitle.append(iDataRepository.getData());
    }
}
