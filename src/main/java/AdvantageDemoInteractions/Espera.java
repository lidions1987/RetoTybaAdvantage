package AdvantageDemoInteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.core.time.InternalSystemClock;

public class Espera implements Interaction {
	
	 private int tiempo;

	 public Espera(int tiempo) {
	        super();
	        this.tiempo = tiempo;
	    }


	    public static Espera onMoment(int tiempo) {
	        return instrumented(Espera.class, tiempo);
	    }
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		new InternalSystemClock().pauseFor(tiempo);
		
	}

}
