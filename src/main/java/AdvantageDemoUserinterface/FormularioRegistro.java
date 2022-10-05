package AdvantageDemoUserinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioRegistro {

	public static final Target USERNAME = Target.the("Campo de texto Ingreso nombre de usuario").located(By.xpath("//Input[@name='usernameRegisterPage']"));
	public static final Target LBLCAMPOVACIONCAMPOVACIO = Target.the("Alerta que indica que el campo  esta vació").located(By.xpath("(//label[@class='invalid'])[1]"));
	public static final Target LBLCAMPOVALIDACIONCARACTER = Target.the("Alerta que indica que el campo  a sobrepasado maximo O minimo de caracteres").located(By.xpath("//label[@class='animated invalid']"));
	public static final Target EMAIL = Target.the("Campo de texto Ingreso email de usuario").located(By.xpath("//Input[@name='emailRegisterPage']"));
	public static final Target PASSWORD = Target.the("Campo de texto Ingreso password del usuario").located(By.xpath("//Input[@name='passwordRegisterPage']"));
	public static final Target CONFIRMPASSWORD = Target.the("Campo de texto Ingreso confirmación password del usuario").located(By.xpath("//Input[@name='confirm_passwordRegisterPage']"));
	public static final Target FIRSTNAME = Target.the("Campo de texto Ingreso nombre  del usuario").located(By.xpath("//Input[@name='first_nameRegisterPage']"));
	public static final Target lASTNAME = Target.the("Campo de texto Ingreso apellido del usuario").located(By.xpath("//Input[@name='last_nameRegisterPage']"));
	public static final Target PHONENUMBER = Target.the("Campo de texto Ingreso número teléfonico del usuario").located(By.xpath("//Input[@name='phone_numberRegisterPage']"));
	public static final Target COUNTRY = Target.the("Campo de texto seleccionar el pais del usuario").located(By.xpath("//select[@name='countryListboxRegisterPage']']"));
	public static final Target CITY = Target.the("Campo de texto seleccionar el estado del usuario").located(By.xpath("//input[@name='cityRegisterPage']"));
	public static final Target ADDRESS = Target.the("Campo de texto ingresar la dirección del usuario").located(By.xpath("//input[@name='addressRegisterPage']"));
	public static final Target STATE = Target.the("Campo de texto ingresar el estado del usuario").located(By.xpath("//input[@name='state_/_province_/_regionRegisterPage']"));
	public static final Target POSTALCODE = Target.the("Campo de texto ingresar el codigo postal del usuario").located(By.xpath("//input[@name='postal_codeRegisterPage']"));
	public static final Target CHECKPROMOTION = Target.the("Check para marcar si el usuario desea recibir promociones").located(By.xpath("//input[@name='allowOffersPromotion']"));
	public static final Target CHEKCAGREE = Target.the("Check para marcar si el usuario esta de acuerdo con los terminos y condiciones").located(By.xpath("//input[@name='i_agree']"));
	public static final Target BTNREGISTER = Target.the("Boton para registrar la cuenta").located(By.xpath("//button[@id='register_btnundefined']"));
	
}



