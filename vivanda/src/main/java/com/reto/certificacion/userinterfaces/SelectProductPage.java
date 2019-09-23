package com.reto.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SelectProductPage {
    public static final Target SEARCH=Target.the("button search").locatedBy("//button[@type='submit']");
    public static  final Target ADD_CART=Target.the("button add to cart").locatedBy("//li['{0}']/div/div/div[@class='product-options']/div/div[@class='buy-button-normal' ]");
    public static  final Target PRODUCTS = Target.the("list products").locatedBy("//span[@class='font-bold product-name']");
}
