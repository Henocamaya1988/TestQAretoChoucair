package co.com.choucair.certification.newexperiencie.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/CrearCuentaUsuario.feature",
        tags = "@ScenarioCrearCuentadeUsuario",
        glue = {"co.com.choucair.certification.newexperiencie.stepdefinitions","co.com.choucair.certification.newexperiencie.util"},
        snippets = SnippetType.CAMELCASE )



public class CrearCuentaUsuarioRunners {
}
