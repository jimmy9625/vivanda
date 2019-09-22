package com.reto.certificacion.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.reto.certificacion.userinterfaces.PickUpStorePage.CHECK_STORE;
import static com.reto.certificacion.userinterfaces.PickUpStorePage.SHOPS;

public class SearchAndSelect implements Interaction {

    private String store;

    private boolean found = false;

    private SearchAndSelect(String store) {
        this.store = store;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        int pos = 0;

        for (WebElementFacade shops : SHOPS.resolveAllFor(actor)) {


            if (store.equals(shops.getText())) {
                found = true;
                System.out.println("Lo encontre");
                pos++;
                break;
            }

            pos++;
        }

        if (found) {
            String posicion = Integer.toString(pos);
            actor.attemptsTo(Click.on(CHECK_STORE.of(posicion)));

        }

    }


    public static SearchAndSelect the(String store) {
        return new SearchAndSelect(store);
    }
}
