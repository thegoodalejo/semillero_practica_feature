package com.sophossolutions.patterns.stepdefinitions;


import com.sophossolutions.patterns.pages.GuruHome;
import com.sophossolutions.patterns.pages.GuruResultados;

public class GuruBuscarStepDefinitions {
	GuruHome guruhome;
	GuruResultados gururesultado;
	
	@Given("^Deseo navegar a la pagina \"([^\"]*)\"S")
	public void navegarAPagina(String url) {
		guruhome.navegateto(url);
	}
	
	@When("^Ingreso \"([^\"]*)\"S")
	public void ingresarABuscar(String buscar) {
		guruhome.ingresarBuscar(buscar);
	}
	
	@Then("^Valido que busque \"([^\"]*)\"S")
	public void validarBusqueda(String buscar) {
		gururesultado.validar(buscar);
	}
}
