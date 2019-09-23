package com.reto.certificacion.tasks;

import com.reto.certificacion.interactions.SearchAndAddToCartFromPage;
import com.reto.certificacion.interactions.Wait;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.reto.certificacion.userinterfaces.AddCartPage.SEARCH_BAR;
import static com.reto.certificacion.userinterfaces.SelectProductPage.SEARCH;

public class AddToCartFromPage implements Task {

    private String product;

    private AddToCartFromPage(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(product).into(SEARCH_BAR),
                Click.on(SEARCH),
                SearchAndAddToCartFromPage.the(product),
                Wait.thePage());

    }

    public static AddToCartFromPage the(String product) {
        return new AddToCartFromPage(product);
    }
}
