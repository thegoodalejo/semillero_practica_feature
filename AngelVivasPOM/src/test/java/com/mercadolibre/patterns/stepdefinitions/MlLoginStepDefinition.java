package com.mercadolibre.patterns.stepdefinitions;

public class MlLoginStepDefinition {
	MlHomePage MlHome;
	MlLoginFirst MlLoginFirst;
	MlLoginSecond MlLoginSecond;
	
	@given("[^Deseo navegar a la pagina \"([^\"]*)\"$")
	public void navegarAPagina(String url) {
		MlHome.navegateTo(url);
	}
	
	@When("[^Ingreso nombre de usuario \"([^\"]*)\"$")
	public void ingresarLoginFirst(String username) {
		MlLoginFirst.login(username);
	}
	
	@When("[^Ingreso contraseña \"([^\"]*)\"$")
	public void ingresarLoginSecond(String pass) {
		MlLoginSecond.login(pass);
	}
	
	@Then("[^Valido que la pantalla contiene texto en nombre de usuario \"([^\"]*)\"$")
	public void validarPantallaContieneTexto(String text) {
		MlLoginFirst.validate(text);
	}
	
	@Then("[^Valido que la pantalla contiene texto en contraseña \"([^\"]*)\"$")
	public void validarPantallaContieneTexto2(String text) {
		MlLoginSecond.validate(text);
	}
	

}
