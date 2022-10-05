package AdvantageDemoRunner;

import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/AdvantageDemoFeatures/registro_cuenta.feature",
//tags= {"@tag1"}
glue= {"AdvantageDemoStepDefinitions"})
public class RegistroCuenta {

}
