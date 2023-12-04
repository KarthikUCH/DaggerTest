package com.raju.karthikeyan.payment

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.raju.karthikeyan.payment.databinding.ActivityPaymentBinding
import com.raju.karthikeyan.payment.di.PaymentUiScopeProvider
import org.koin.android.ext.android.inject

class PaymentActivity : AppCompatActivity() {


    private val paymentUseCase: PaymentUseCase by inject()

    private val paymentRepository: PaymentRepository by inject()

    lateinit var paymentUiScopeProvider: PaymentUiScopeProvider
    lateinit var paymentManager: PaymentManager

    private lateinit var binding: ActivityPaymentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        paymentUiScopeProvider = (applicationContext as PaymentUiScopeProvider)
        paymentManager = paymentUiScopeProvider.providePaymentUiScope().get()

        binding.tvPayment.text = paymentUseCase.getData()
        binding.tvPayment.apply {
            text = paymentUseCase.getData()
            append("\n")
            append("\n")
            append(paymentRepository.getData())
        }

        Toast.makeText(this, "Check log message for Checkout Manager status", Toast.LENGTH_LONG)
            .show()
        paymentManager.initCheckout()

    }

    override fun onDestroy() {
        super.onDestroy()
        paymentUiScopeProvider.closePaymentUiScope()
    }
}
