package com.reto.certificacion.tasks;


import com.reto.certificacion.interactions.SearchAndAddToCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static com.reto.certificacion.userinterfaces.AddCartPage.SEARCH_BAR;

public class AddToCartFromSearchBar implements Task {

    private String product;

    public AddToCartFromSearchBar(String product) {
        this.product = product;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(Enter.theValue(product).into(SEARCH_BAR), SearchAndAddToCart.the(product));

    }


    public static AddToCartFromSearchBar the(String product) {
        return Tasks.instrumented(AddToCartFromSearchBar.class, product);
    }
}
