package com.feactures.stepDefinition;

public class logindefinition
{
	PInicio pInicio;
	PLogin pLogin;
	SLogin sLogin;
	
	@given("[^Quiero navegar a la pagina \"([^\"]*)\"$")
	public void navegarPagina(String url) {
		pInicio.navegateTo(url);
	}
	
	@When("[^Ingresar nombre de usuario \"([^\"]*)\"$")
	public void ingresaPLogin(String user) {
		pLogin.login(user);
	}
	
	@When("[^Ingresar contraseña \"([^\"]*)\"$")
	public void ingresaSLogin(String pass) {
		sLogin.login(pass);
	}
	
	@Then("[^Valido que la pantalla tiene nombre de usuario \"([^\"]*)\"$")
	public void validarTextoPantallaUsuario(String text) {
		pLogin.validate(text);
	}
	
	@Then("[^Valido que la pantalla tiene contraseña \"([^\"]*)\"$")
	public void validarPantallaContrasena(String text) {
		sLogin.validate(text);
	}
}
