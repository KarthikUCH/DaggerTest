package com.raju.karthikeyan.payment

import com.raju.karthikeyan.common.ShoppingCart
import com.raju.karthikeyan.common.ShopppingCartCheckout

interface ICheckoutManager {

    fun initCheckout(onSuccess: Boolean)

    fun setUniqueIdAndGuid(shoppingCartCheckout: ShopppingCartCheckout)

    fun buildUploadCheckoutV3(shoppingCart: ShoppingCart)

    fun insertCheckout()

    fun prepareReport()

    fun prepareUploadCheckoutAndReport()

}