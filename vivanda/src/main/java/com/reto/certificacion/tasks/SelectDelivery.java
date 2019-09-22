package com.reto.certificacion.tasks;

import com.reto.certificacion.interactions.SelectHomeDelivery;
import com.reto.certificacion.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static com.reto.certificacion.userinterfaces.PickUpStorePage.CONFIRM;
import static com.reto.certificacion.userinterfaces.PickUpStorePage.CONTINUE;
import static com.reto.certificacion.userinterfaces.SelectDeliveryHomePage.DELIVERY_HOME;

public class SelectDelivery implements Task {


    private  String district;

    private  SelectDelivery (String district)
    {
        this.district =district;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(DELIVERY_HOME),
                SelectHomeDelivery.toThe(district),
                Click.on(CONTINUE),
                Click.on(CONFIRM),
                Wait.thePage());


    }

    public static SelectDelivery toHome(String distict)
    {
        return  new SelectDelivery(distict);
    }
}
