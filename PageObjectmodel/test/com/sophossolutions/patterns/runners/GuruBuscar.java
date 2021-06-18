package com.sophossolutions.patterns.runners;

import org.junit.runner.RunWith;

public class GuruBuscar {

	@RunWith(CucumberWithSerenity.class)
	@CucumberOptions(glue = {"com.sophossolutions.patterns.stepdefinitions"}, features =
{"resources/guru_buscar.feature"});

}
