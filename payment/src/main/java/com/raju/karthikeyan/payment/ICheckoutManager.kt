package com.raju.karthikeyan.payment

interface ICheckoutManager {

    fun initCheckout(onSuccess: Boolean)

    fun setUniqueIdAndGuid(shoppingCartCheckout: ShopppingCartCheckout)

    fun buildUploadCheckoutV3(shoppingCart: ShoppingCart)

    fun insertCheckout()

    fun prepareReport()

    fun prepareUploadCheckoutAndReport()

}