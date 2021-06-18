package com.feactures.feactures;

import org.junit.runner.RunWith;

import com.mercadolibre.patterns.runners.CucumberOptions;

import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = { "com.mercadolibre.patterns.stepdefinitions" }, features = {
	"src/test/resources/com/feactures/feactures/features/ml_login.feature"},
	snippets = SnippetType.CAMECASE,
	monochrome = true,
	dryRun = false,
	plugin = {""}
	)

public class login 
{
    /**
     * Rigorous Test :-)
     */
    
}
