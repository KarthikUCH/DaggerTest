package com.dagger.raju.myapplication;

import android.util.Log;
import com.raju.karthikeyan.payment.ICheckoutManager;
import com.raju.karthikeyan.payment.ShoppingCart;
import com.raju.karthikeyan.payment.ShopppingCartCheckout;

public class CheckoutManager implements ICheckoutManager {

    public CheckoutManager() {
    }

    @Override public void initCheckout(boolean onSuccess) {
        Log.e("Checkout Manager", "initCheckout");
    }

    @Override public void setUniqueIdAndGuid(ShopppingCartCheckout shoppingCartCheckout) {
        Log.e("Checkout Manager", "setUniqueIdAndGuid");
    }

    @Override public void buildUploadCheckoutV3(ShoppingCart shoppingCart) {
        Log.e("Checkout Manager", "buildUploadCheckoutV3");
    }

    @Override public void insertCheckout() {
        Log.e("Checkout Manager", "insertCheckout");
    }

    @Override public void prepareReport() {
        Log.e("Checkout Manager", "prepareReport");
    }

    @Override public void prepareUploadCheckoutAndReport() {
        Log.e("Checkout Manager", "prepareUploadCheckoutAndReport");
    }


}
