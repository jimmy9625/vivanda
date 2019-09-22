package com.reto.certificacion.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static com.reto.certificacion.userinterfaces.AddCartPage.ADD_CART;
import static com.reto.certificacion.userinterfaces.AddCartPage.LIST_PRODUCTS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchAndAddToCart implements Interaction {

    private String product;
    private int row;
    private  boolean rowFound;


    public SearchAndAddToCart(String product) {

        this.product = product;
        this.row=0;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {



        for (WebElementFacade products : LIST_PRODUCTS.resolveAllFor(actor)) {
            if (product.equals(products.getText())) {
                row++;
                rowFound=true;
                break;
            }
            row++;
        }

        if(rowFound)
            actor.attemptsTo(Click.on(ADD_CART.of(Integer.toString(row))));

    }




    public static SearchAndAddToCart the(String product) {
        return instrumented(SearchAndAddToCart.class, product);
    }
}
