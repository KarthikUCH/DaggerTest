package com.raju.karthikeyan.payment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raju.karthikeyan.payment.di.PaymentComponentProvider
import com.raju.karthikeyan.payment.di.PaymentManager
import kotlinx.android.synthetic.main.activity_payment.*
import javax.inject.Inject

class PaymentActivity : AppCompatActivity() {

    @Inject
    lateinit var paymentUseCase: PaymentUseCase

    @Inject
    lateinit var paymentRepository: PaymentRepository

    @Inject
    lateinit var paymentManager: PaymentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val paymentComponent = (applicationContext as PaymentComponentProvider).providePaymentComponent()
        paymentComponent.inject(this)

        tvPayment.text = paymentUseCase.getData()
        tvPayment.apply {
            text = paymentUseCase.getData()
            append("\n")
            append("\n")
            append(paymentRepository.getData())
        }

        paymentManager.initCheckout()

    }
}
