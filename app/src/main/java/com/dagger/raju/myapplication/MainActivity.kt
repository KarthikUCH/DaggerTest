package com.dagger.raju.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.dagger.raju.myapplication.network.NetworkChannel
import com.dagger.raju.myapplication.utils.NetworkUtil
import com.dagger.raju.myapplication.utils.RxUtils
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.raju.karthikeyan.payment.PaymentActivity
import com.raju.karthikeyan.payment.PaymentRepository
import com.raju.karthikeyan.payment.PaymentUseCase
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val networkUtil: NetworkUtil by inject()

    private val networkChannel: NetworkChannel by inject()

    private val rxUtils: RxUtils by inject()

    private val paymentUseCase: PaymentUseCase by inject()

    private val paymentRepository: PaymentRepository by inject()

    private var tvMain: TextView? = null
    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        rxUtils.performRxOperation()
        tvMain = findViewById<TextView>(R.id.tvMain)
        tvMain?.apply {
            text = networkUtil.getData()
            append("\n")
            append("\n")
            append(networkChannel!!.data)
            append("\n")
            append("\n")
            append(paymentUseCase.getData())
            append("\n")
            append("\n")
            append(paymentRepository.getData())
        }

        val fab: FloatingActionButton = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener(View.OnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId
        if (id == R.id.action_payment) {
            startActivity(Intent(this, PaymentActivity::class.java))
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}