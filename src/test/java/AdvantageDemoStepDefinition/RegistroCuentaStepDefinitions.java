package AdvantageDemoStepDefinition;

import org.openqa.selenium.WebDriver;

import AdvantageDemoTasks.IngresarIconoLogin;
import AdvantageDemoTasks.IngresrCreacionCuenta;
import AdvantageDemoTasks.OpenTheBrowser;
import AdvantageDemoUtils.Constantes;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class RegistroCuentaStepDefinitions {
	
	private WebDriver herBrowser;
	private Actor usuario = Actor.named("usuario");
	private Constantes url;
	@Before
	public void setup(){
		usuario.can(BrowseTheWeb.with(herBrowser));
		
	}
	@Given("que me encuentro en el sitio web advantageonlineshopping.com\\/")
	public void que_me_encuentro_en_el_sitio_web_advantageonlineshopping_com() {
	    usuario.wasAbleTo(OpenTheBrowser.at(url));
	    
	}

	@When("le doy click al incono de user")
	public void le_doy_click_al_incono_de_user() {
	   usuario.attemptsTo(IngresarIconoLogin.ingreso());

	}

	@When("luego click en la opcion de create new account")
	public void luego_click_en_la_opcion_de_create_new_account() {
	    usuario.attemptsTo(IngresrCreacionCuenta.crear());
	    
	}

	@When("ingreso en el campo Username (.*)$")
	public void ingreso_en_el_campo_username(String username) {
	    

	}

	@Then("yo puedo validar un mensaje de texto (.*)$")
	public void yo_puedo_validar_un_mensaje_de_texto(String mensaje) {
	   
	
	}

	@When("luego click en la opci?n de create new account")
	public void luego_click_en_la_opci_n_de_create_new_account() {
	    
	   
	}

	@When("click en el campo Username")
	public void click_en_el_campo_username() {
	    
	   
	}

	@When("ingreso en el campo Password (.*)$")
	public void ingreso_en_el_campo_password(String password) {
	   
	   
	}

	@When("click en el campo Password")
	public void click_en_el_campo_password() {
	   
	 
	}

	@When("Igreso en el campo Confirm Password (.*)$")
	public void igreso_en_el_campo_confirm_password(String confirm) {
	    
	
	}

	@When("click en el campo Confirm Password")
	public void click_en_el_campo_confirm_password() {
	    
	   
	}

	@When("ingreso en el campo First name (.*)$")
	public void ingreso_en_el_campo_first_name(String firstname) {
	   
	   
	}

	@When("ingreso en el campo last name (.*)$")
	public void ingreso_en_el_campo_last_name(String lastname) {
	    
	    
	}

	@When("ingreso en el campo Phone Number (.*)$")
	public void ingreso_en_el_campo_phone_number(String phonenumber) {
	   
	   
	}

	@When("ingreso en el campo City (.*)$")
	public void ingreso_en_el_campo_city(String city) {
	   
	 
	}

	@When("ingreso en el campo Address (.*)$")
	public void ingreso_en_el_campo_address(String address) {
	 
	   
	}

	@When("ingreso en el campo State\\/Province\\/Region (.*)$")
	public void ingreso_en_el_campo_state_province_region(String state) {
	    
	
	}

	@When("ingreso en el campo Postal Code (.*)$")
	public void ingreso_en_el_campo_postal_code(String postalcode) {
	    
	   
	}
	
	@When("ingreso en el campo Email(.*)$")
	public void ingreso_en_el_campo_email(String email) {
	   
	}

	@When("click en el campo Email")
	public void click_en_el_campo_email() {
	    
	}

	
	@When("ingreso los datos obligatorios para crear la cuenta (.*),(.*),(.*),(.*)$")
	public void ingreso_los_datos_obligatorios_para_crear_la_cuenta(String username,String email,String password, String confirmpassword) {
	
	}

	@When("le doy click a el checkbox de confirmacion de politicas de privacidad")
	public void le_doy_click_a_el_checkbox_de_confirmacion_de_politicas_de_privacidad() {
	    
	}

	@Then("yo puedo validar que el boton de REGISTRO no se habilita.")
	public void yo_puedo_validar_que_el_boton_de_registro_no_se_habilita() {
	    
	}

		
	@When("ingreso los datos  para crear la cuenta (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$ ")
	public void ingreso_los_datos_para_crear_la_cuenta(String username,String email,String password, String confirmpassword, String firstname,String lastname,String phonenumber,String city,String address,String state,String postalcode) {
	   
	}
	

	@When("no marco el check de condicion y privacidad")
	public void no_marco_el_check_de_condicion_y_privacidad() {
	    
	}

	

	@When("click en el boton de registro de cuenta")
	public void click_en_el_boton_de_registro_de_cuenta() {
	   
	}

	@Then("yo puedo validar que se ha creado la cuenta nueva.")
	public void yo_puedo_validar_que_se_ha_creado_la_cuenta_nueva() {
	   
	}


	@When("ingreso todos los datos  para crear la cuenta (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*)$ ")
	public void ingreso_todos_los_datos_para_crear_la_cuenta(String username,String email,String password, String confirmpassword, String firstname,String lastname,String phonenumber,String country,String city,String address,String state,String postalcode) {
	    
	}
	
	

}
