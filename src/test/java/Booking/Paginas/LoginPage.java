package Booking.Paginas;

import Booking.Steps.ButtonPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 //llamar la clase
    private ButtonPages buttonPages;

    //buscando un elemento en el html de tipo XPATH
    @FindBy(how = How.NAME, using = "username")
    //esto es una variable de tipo WebElement
    private WebElement inputUserName;

    @FindBy(how = How.NAME, using = "password")
    private WebElement inputpassword;

    //Constructor
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
    }

    //esto es un metodo
    public void diligencieLogin(String user, String pass) {
        inputUserName.sendKeys(user);
        inputpassword.sendKeys(pass);
        buttonPages.btnLogin();
    }
}
