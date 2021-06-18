package stepdefinition;

public class GoogleStepDefinition {
	GooglePage page;
	@Given
	public void navegarPagina(String url) {
	
	}
	@When
	public void ingresarPalabra(String palabra) {
		page.escribirPalabra(String palabra, page.lbBuscador);
	}
	@Then
	public void validarPantalla( pantalla) {
		page.validarPantalla( pantalla);
	}
}
