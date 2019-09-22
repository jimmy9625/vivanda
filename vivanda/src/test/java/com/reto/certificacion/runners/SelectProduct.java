package com.reto.certificacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/buyproduct.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.reto.certificacion.stepsdefinitions")

public class SelectProduct {
}
