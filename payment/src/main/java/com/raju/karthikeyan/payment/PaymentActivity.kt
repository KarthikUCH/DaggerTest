package com.raju.karthikeyan.payment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.raju.karthikeyan.payment.databinding.ActivityPaymentBinding
import com.raju.karthikeyan.payment.di.PaymentComponentProvider
import javax.inject.Inject

class PaymentActivity : AppCompatActivity() {

    @Inject
    lateinit var paymentUseCase: PaymentUseCase

    @Inject
    lateinit var paymentRepository: PaymentRepository

    @Inject
    lateinit var paymentManager: PaymentManager

    private lateinit var binding: ActivityPaymentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val paymentComponent = (applicationContext as PaymentComponentProvider).providePaymentComponent()
        paymentComponent.inject(this)

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
