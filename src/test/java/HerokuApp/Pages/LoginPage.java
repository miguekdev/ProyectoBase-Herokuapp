package HerokuApp.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    //Encontrar el elemento de la página
    @FindBy(how = How.NAME, using = "username")
    private WebElement txtUser;

    @FindBy(how = How.NAME, using = "password")
    private WebElement txtPass;

    @FindBy(how = How.CLASS_NAME, using = "radius")
    private WebElement btnLogin;


    //Constructor
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this); //para estandarizar los llamados
    }

    //Método diligenciar login
    public void fillOutLogin(String userName, String password){
        this.txtUser.sendKeys(userName);
        this.txtPass.sendKeys(password);
    }

    // Método para hacer clic en el botón de login
    public void clickLoginButton(){
        this.btnLogin.click();
    }


}

