package com.reto.certificacion.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Wait implements Interaction {


    public static Wait thePage() {
        return new Wait();
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
