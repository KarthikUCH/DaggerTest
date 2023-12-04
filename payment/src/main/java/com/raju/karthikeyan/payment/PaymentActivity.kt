package com.raju.karthikeyan.payment

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.raju.karthikeyan.payment.databinding.ActivityPaymentBinding
import org.koin.android.ext.android.inject

class PaymentActivity : AppCompatActivity() {

    val paymentUseCase: PaymentUseCase by inject()

    val paymentRepository: PaymentRepository by inject()

    val paymentManager: PaymentManager by inject()

    private lateinit var binding: ActivityPaymentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvPayment.text = paymentUseCase.getData()
        binding.tvPayment.apply {
            text = paymentUseCase.getData()
            append("\n")
            append("\n")
            append(paymentRepository.getData())
        }

        Toast.makeText(this, "Check log message for Checkout Manager status", Toast.LENGTH_LONG).show()
        paymentManager.initCheckout()

    }
}
