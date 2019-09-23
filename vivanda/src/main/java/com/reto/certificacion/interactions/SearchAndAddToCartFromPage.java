package com.reto.certificacion.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static com.reto.certificacion.userinterfaces.SelectProductPage.ADD_CART;
import static com.reto.certificacion.userinterfaces.SelectProductPage.PRODUCTS;

public class SearchAndAddToCartFromPage implements Interaction {

    private String product;
    private int row;
    private boolean rowFound;

    private SearchAndAddToCartFromPage(String product) {
        this.product=product;

    }


    @Override
    public <T extends Actor> void performAs(T actor) {


        for (WebElementFacade products : PRODUCTS.resolveAllFor(actor)) {
            actor.attemptsTo(Scroll.to(products));
            if (product.equals(products.getText())) {
                row++;
                rowFound = true;
                break;
            }
            row++;
        }

        if (rowFound)
            actor.attemptsTo(Click.on(ADD_CART.of(Integer.toString(row))));

    }

    public  static  SearchAndAddToCartFromPage the(String product)
    {
        return new SearchAndAddToCartFromPage(product);
    }

}
