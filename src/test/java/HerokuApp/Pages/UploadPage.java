package HerokuApp.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class UploadPage {

    private WebDriver driver;

    // Localizar el campo de carga y el botón de envío
    private By uploadField = By.id("file-upload");
    private By submitButton = By.id("file-submit");
    private By uploadMessage = By.id("uploaded-files");

    // Constructor
    public UploadPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Método para cargar un archivo
    public void uploadFile(String filePath) {
        WebElement fileInput = driver.findElement(uploadField);
        fileInput.sendKeys(filePath);  // Ruta del archivo a subir
        driver.findElement(submitButton).click(); // Hacer clic en el botón de carga
    }

    // Método para obtener el mensaje de confirmación
    public String getUploadMessage() {
        return driver.findElement(uploadMessage).getText(); // Obtener el mensaje de carga
    }
}