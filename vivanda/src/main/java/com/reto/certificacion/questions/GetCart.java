package com.reto.certificacion.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static com.reto.certificacion.userinterfaces.AddCartPage.CART;
import static com.reto.certificacion.userinterfaces.AddCartPage.PRODUCTS_CART;

public class GetCart implements Question<List<String>> {


    List<String>products = new ArrayList<>();

    @Override
    public List<String> answeredBy(Actor actor) {


        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(Click.on(CART));

        for(WebElementFacade product : PRODUCTS_CART.resolveAllFor(actor))
        {
            products.add(product.getText());
        }

        return products;
    }

    public static GetCart products()
    {
        return  new GetCart();
    }
}
