package com.reto.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class SelectDeliveryHomePage {

    public static final Target DELIVERY_HOME = Target.the("button Delivery home").locatedBy("//button/span[text()='Despacho a domicilio']");
    public static final  Target DISTRICT = Target.the("Disctric").locatedBy("//select[@name='distrito']/option");

}
