package com.reto.certificacion.tasks;

import com.reto.certificacion.interactions.SearchAndSelect;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.reto.certificacion.interactions.Wait.thePage;
import static com.reto.certificacion.userinterfaces.PickUpStorePage.*;

public class SelectPickUp implements Task {

    private String store;

    private SelectPickUp(String store) {
        this.store = store;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PICKUP_STORE),
                SearchAndSelect.the(store),
                Click.on(CONTINUE),
                Click.on(CONFIRM), thePage());




    }


    public static SelectPickUp inThe(String store) {
        return new SelectPickUp(store);
    }


}
