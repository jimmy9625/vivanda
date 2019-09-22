package com.reto.certificacion.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static com.reto.certificacion.userinterfaces.SelectDeliveryHomePage.DISTRICT;

public class SelectHomeDelivery implements Interaction {


    private String district;

    private SelectHomeDelivery(String district) {
        this.district = district;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        String value = "";
        for (WebElementFacade districts : DISTRICT.resolveAllFor(actor)) {

            if (district.equals(districts.getText())) {
                value = districts.getAttribute("value");
                break;
            }

        }

        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        Select districts = new Select(driver.findElement(By.name("distrito")));
        districts.selectByValue(value);


    }

    public static SelectHomeDelivery toThe(String district) {
        return new SelectHomeDelivery(district);
    }
}
