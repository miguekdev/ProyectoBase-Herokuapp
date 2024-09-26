package HerokuApp.Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.chrome.ChromeOptions;

public class Conexion {

	private WebDriver driver;

	@Before
	@Step
	public WebDriver abrirNavegador(String url) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		// Navegar a la URL proporcionada
		driver.navigate().to(url);
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		return this.driver;

	}
	

}
