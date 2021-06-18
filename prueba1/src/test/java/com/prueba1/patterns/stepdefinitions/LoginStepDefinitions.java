package com.prueba1.patterns.stepdefinitions;

public class LoginStepDefinitions {
	LinioHomePage LinioHome;
	LinioLogin LinioLogin;
	
	@Given("")
	public void navegarAPagina(String url) {
		LinioHome.navegateTo(url);
	}
	
	@When("")
	public void IngresarLogin(String user, String password) {
		LinioLogin.login(user,password);
	}
	
	
}
