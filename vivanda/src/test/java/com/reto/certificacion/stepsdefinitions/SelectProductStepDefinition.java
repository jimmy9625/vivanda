package com.reto.certificacion.stepsdefinitions;

import com.reto.certificacion.exeptions.CartExceptions;
import com.reto.certificacion.questions.GetCart;
import com.reto.certificacion.tasks.AddToCartFromSearchBar;
import com.reto.certificacion.tasks.SelectDelivery;
import com.reto.certificacion.tasks.SelectPickUp;
import com.reto.certificacion.utils.drivers.OwnWebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class SelectProductStepDefinition {


    @Before
    public void init() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that the (.*) enters the page vivanda$")
    public void thatTheUserEntersThePageVivanda(String name) {

        theActorCalled(name).
                can(BrowseTheWeb.with(OwnWebDriver.
                        newDriver().
                        chrome("https://www.vivanda.com.pe/")));

    }


    @When("^he adds the product:(.*)$")
    public void selectAProduct(String product) {

        theActorInTheSpotlight().attemptsTo(AddToCartFromSearchBar.the(product));

    }

    @Then("^the product in the shopping cart$")
    public void theUserSeesInTheShoppingCart(List<String> expectedProducts) {

        theActorInTheSpotlight().should(GivenWhenThen.seeThat(GetCart.products(),
                containsInAnyOrder(expectedProducts.toArray())).orComplainWith(CartExceptions.class,
                "product not found"));

    }

    @When("^Select the store:(.*)$")
    public void selectTheStoreVivandaPezet(String store) {

        theActorInTheSpotlight().attemptsTo(SelectPickUp.inThe(store));

    }


    @When("^Select the District :(.*)")
    public void selectTheDistrictMiraflores(String district) {

        theActorInTheSpotlight().attemptsTo(SelectDelivery.toHome(district));

    }
}
