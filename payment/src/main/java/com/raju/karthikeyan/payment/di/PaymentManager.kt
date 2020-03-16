package com.raju.karthikeyan.payment.di

import com.raju.karthikeyan.payment.ICheckoutManager

class PaymentManager(private val checkoutManager: ICheckoutManager) {


    fun initCheckout() {
        checkoutManager.initCheckout(true)

        checkoutManager.insertCheckout()

        checkoutManager.prepareReport()

        checkoutManager.prepareUploadCheckoutAndReport()
    }
}