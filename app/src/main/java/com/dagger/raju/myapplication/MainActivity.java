package com.dagger.raju.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.dagger.raju.myapplication.network.NetworkChannel;
import com.dagger.raju.myapplication.utils.NetworkUtil;
import com.dagger.raju.myapplication.utils.RxUtils;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.raju.karthikeyan.payment.PaymentActivity;
import com.raju.karthikeyan.payment.PaymentRepository;
import com.raju.karthikeyan.payment.PaymentUseCase;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkUtil networkUtil;

    @Inject
    NetworkChannel networkChannel;

    @Inject
    RxUtils rxUtils;

    @Inject
    PaymentUseCase paymentUseCase;

    @Inject
    PaymentRepository paymentRepository;

    TextView tvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        App.getAppComponent().inject(this);
        rxUtils.performRxOperation();

        tvMain = findViewById(R.id.tvMain);

        tvMain.setText(networkUtil.getData());
        tvMain.append("\n");
        tvMain.append("\n");
        tvMain.append(networkChannel.getData());
        tvMain.append("\n");
        tvMain.append("\n");
        tvMain.append(paymentUseCase.getData());
        tvMain.append("\n");
        tvMain.append("\n");
        tvMain.append(paymentRepository.getData());

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_payment) {
            startActivity(new Intent(this, PaymentActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
