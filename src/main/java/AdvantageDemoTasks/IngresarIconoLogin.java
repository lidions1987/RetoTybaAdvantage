package AdvantageDemoTasks;

import AdvantageDemoInteractions.Espera;
import AdvantageDemoUserinterface.FormularioRegistro;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarIconoLogin implements Task {
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		Espera.onMoment(3000);
		actor.attemptsTo(Click.on(FormularioRegistro.ICONUSER));	
		Espera.onMoment(3000);
	}
public static IngresarIconoLogin ingreso() {
	return new IngresarIconoLogin();
}
}
