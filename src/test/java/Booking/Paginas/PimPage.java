package Booking.Paginas;


import Booking.Steps.ButtonPages;
import Booking.Steps.Questions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PimPage {

    private ButtonPages buttonPages;
    private Questions questions;

    //buscando un elemento en el html de tipo NAME
    @FindBy(how = How.NAME, using = "firstName")
    //esto es una variable de tipo WebElement
    private WebElement inputfirstName;

    //buscando un elemento en el html de tipo NAME
    @FindBy(how = How.NAME, using = "middleName")
    //esto es una variable de tipo WebElement
    private WebElement inputmiddleName;

    //buscando un elemento en el html de tipo NAME
    @FindBy(how = How.NAME, using = "lastName")
    //esto es una variable de tipo WebElement
    private WebElement inputlastName;

    @FindBy(how = How.XPATH, using = "//input[@class='oxd-input oxd-input--focus']")
    private WebElement inputUsername;

    @FindBy(how = How.XPATH, using = "//input[@type='password']")
    private WebElement inputPassword;


    //Crear constructor
    public PimPage (WebDriver driver){
        PageFactory.initElements(driver, this);
        this.buttonPages = new ButtonPages(driver);
        this.questions = new Questions(driver);
    }
    //metodo agregar empleado
    public void AddEmployee(String firstName, String middleName, String lastName){
        buttonPages.btnAddEmployee();
        inputfirstName.sendKeys(firstName);
        inputmiddleName.sendKeys(middleName);
        inputlastName.sendKeys(lastName);
        buttonPages.btnSaveEmployee();
        questions.tiempoSegundos(5);
        questions.screenShot();
        questions.assertValidateEmployee(firstName, lastName);
    }
}
