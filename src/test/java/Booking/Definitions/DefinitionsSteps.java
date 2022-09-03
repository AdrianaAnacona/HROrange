package Booking.Definitions;

import Booking.Paginas.LoginPage;
import Booking.Paginas.PimPage;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import Booking.Steps.Conexion;
import io.cucumber.java.en.Given;



public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private LoginPage loginpage = new LoginPage(driver);
	private PimPage pimPage = new PimPage(driver);

	@Given("^abrir el navegador$")
	public void abrir_navegador() {
		this.conexion = new Conexion();
		this.driver = this.conexion.abrirNavegador();

	}

	@When("^diligencie el campo user (.*) y contraseña (.*)$")
	public void ingresarLogin (String user, String pass) {
		this.loginpage = new LoginPage(driver);
		this.loginpage.diligencieLogin(user, pass);

	}
	@When("^diligencie el nuevo empleado en los campos firstname (.*),  middleName (.*) and lastName (.*)$")
	public void agregarempleado(String firstName, String middleName, String lastName ) {
		this.pimPage = new PimPage(driver);
		this.pimPage.AddEmployee(firstName, middleName, lastName);
	}
}