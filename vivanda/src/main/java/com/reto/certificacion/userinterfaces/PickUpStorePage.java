package com.reto.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PickUpStorePage {

    public static final Target PICKUP_STORE = Target.the("button pick up store").locatedBy("//button/span[text()='Recojo en Tienda ']");
    public static final Target SHOPS = Target.the("list to shops").locatedBy("//li/label[@class='containerBtn']/p[@class='titulo']");
    public static final Target CHECK_STORE = Target.the("check button store").locatedBy("//ul/child::li[{0}]/label/span");
    public static final Target CONTINUE=Target.the("button continue").locatedBy("//div/div[@class='SalesChannel__buttonWrapper']/button[text()='CONTINUAR' and not (@disabled='disabled')]");
    public static final Target CONFIRM=Target.the("burron confirm").locatedBy("//div/div[@class='SalesChannel__buttonWrapper']/button[@class='SalesChannel__confirmButton SalesChannel__confirmButton--ubigeo SalesChannel_confirmButton--active']");
}
