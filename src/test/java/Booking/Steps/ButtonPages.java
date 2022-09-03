package Booking.Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ButtonPages {
    @FindBy(how = How.XPATH, using = "//button[@type = 'submit']")
    private WebElement btnLogin;

    @FindBy(how = How.XPATH, using = "//a[text() = 'Add Employee']")
    private WebElement btnAddEmployee;

    @FindBy(how = How.XPATH, using = "//button[@type = 'submit']")
    private WebElement btnSaveEmployee;

    public ButtonPages (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void btnLogin(){
        btnLogin.click();
    }
    public void btnAddEmployee(){
        btnAddEmployee.click();
    }
    public void btnSaveEmployee(){
        btnSaveEmployee.click();
    }


}
