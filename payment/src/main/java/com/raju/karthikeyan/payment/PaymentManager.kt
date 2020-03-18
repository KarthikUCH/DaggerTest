package com.raju.karthikeyan.payment

class PaymentManager(private val checkoutManager: ICheckoutManager) {

    fun initCheckout() {
        checkoutManager.initCheckout(true)

        checkoutManager.insertCheckout()

        checkoutManager.prepareReport()

        checkoutManager.prepareUploadCheckoutAndReport()
    }
}