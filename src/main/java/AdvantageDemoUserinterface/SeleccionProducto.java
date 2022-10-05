package AdvantageDemoUserinterface;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;
public class SeleccionProducto {

	public static final Target LBLPRODUCTTABLE = Target.the("Producto table").located(By.xpath("(//P[@class='center productName roboto-medium ng-binding'])[1]"));
	public static final Target LBLPRODUCTFOLIO = Target.the("Prodcuto de portatiles").located(By.xpath("(//P[@class='center productName roboto-medium ng-binding'])[2]"));
	public static final Target LBLPRODUCTSPEAKER = Target.the("Producto de speakers").located(By.xpath("(//P[@class='center productName roboto-medium ng-binding'])[3]"));
	
	public static final Target LBLDETAILTABLE = Target.the("Ver detalle de table").located(By.id("details_16"));
	public static final Target LBLDETAILFOLIO = Target.the("Ver detalle de portatiles").located(By.id("details_10"));
	public static final Target LBLDETAILSPEAKER = Target.the("Ver detalle de speakers").located(By.id("details_21"));
	
	public static final Target LBLDETAILPRECIO = Target.the("Detalle del precio del producto seleccionado").located(By.xpath("(//h2[@class='roboto-thin screen768 ng-binding'])[1]"));
	public static final Target LBLCOLORBLACK = Target.the("Selección del color negro del producto").located(By.xpath("//span[@title='BLUE']"));
	public static final Target LBLCOLORGRAY = Target.the("Selección del color girs del producto").located(By.xpath("//span[@title='GRAY']"));
	public static final Target LBLQUATITYMINUS = Target.the("Disminuir cantidad").located(By.xpath("//div[@class='minus']"));
	public static final Target LBLQUATITYPLUS = Target.the("Maximizar candtidad").located(By.xpath("//div[@class='plus']"));
	

}
