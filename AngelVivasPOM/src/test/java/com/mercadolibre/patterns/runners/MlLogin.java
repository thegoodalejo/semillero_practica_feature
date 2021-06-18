package com.mercadolibre.patterns.runners;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = { "com.mercadolibre.patterns.stepdefinitions" }, features = {
	"src/test/resources/com/mercadolibre/patterns/features/ml_login.feature"},
	snippets = SnippetType.CAMECASE,
	monochrome = true,
	dryRun = false,
	plugin = {""}
	)

public class MlLogin {
	
	

}
