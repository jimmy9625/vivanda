package com.reto.certificacion.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class AddCartPage {

    public static final Target SEARCH_BAR = Target.the("search bar").locatedBy("//form/input[@type='search']");
    public static final Target ADD_CART = Target.the("button add cart").locatedBy("//li['{0}']/div[@class='item']/div[@class='buy']/div/div/a");
    public static final Target LIST_PRODUCTS = Target.the("list products ").locatedBy("//li/div[@class='item']/div/a[@class='name']");
    public static final Target CART = Target.the("button cart ").locatedBy("//span[@class='minicart__btn__total-items']");
    public static final Target PRODUCTS_CART=Target.the("products in to cart").locatedBy("//div/h4[@class='cartSkuName']");

}
