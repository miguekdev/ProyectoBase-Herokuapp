package HerokuApp.Definitions;

import HerokuApp.Pages.LoginPage;
import HerokuApp.Pages.UploadPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import HerokuApp.Steps.Conexion;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertTrue;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginPage = new LoginPage(null);    // Mantiene la sesión abierta
	private UploadPage uploadPage = new UploadPage(driver);



	@Given("^abrir el navegador para login$")
	public void abrirNavegadorLogin() {
		//this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador("https://the-internet.herokuapp.com/login");
		this.loginPage = new LoginPage(driver);
	}

	@Given("^abrir el navegador para carga de archivos$")
	public void abrirNavegadorCarga() {
		//this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador("https://the-internet.herokuapp.com/upload");
		this.uploadPage = new UploadPage(driver);
	}

	@When("^el usuario diligencia el campo username (.*) password (.*)$")
	public void fillOutLogin(String userName, String password){
		this.loginPage = new LoginPage(driver);
		this.loginPage.fillOutLogin(userName, password);
	}

	@When("^el usuario sube el archivo \"([^\"]*)\"$")
	public void elUsuarioSubeElArchivo(String filePath) {
		uploadPage.uploadFile(filePath);  // Llama al método para subir el archivo
	}

	@Then("^el usuario ve el mensaje de confirmación de carga$")
	public void elUsuarioVeElMensajeDeConfirmacion() {
		String message = uploadPage.getUploadMessage();
		assertTrue(message.contains("Metasploit Framework - hack android.txt")); //  Nombre del archivo esperado
	}

	@Then("^el usuario hace clic en el botón de login$")
	public void clickLoginButton(){
		this.loginPage.clickLoginButton();
	}

	@Then("^el usuario ve el mensaje de login exitoso \"([^\"]*)\"$")
	public void verificarMensajeExitoso(String expectedMessage) {
		String actualMessage = driver.findElement(By.id("flash")).getText(); // Localiza el mensaje de login exitoso
		assertTrue(actualMessage.contains(expectedMessage));
	}

	@Then("^el usuario ve el mensaje de error \"([^\"]*)\"$")
	public void verificarMensajeDeError(String expectedMessage) {
		String actualMessage = driver.findElement(By.id("flash")).getText(); // Localiza el mensaje de error
		assertTrue(actualMessage.contains(expectedMessage));
	}


}