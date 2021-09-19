package co.com.choucair.certification.newexperiencie.stepdefinitions;

import co.com.choucair.certification.newexperiencie.questions.ValidarMensaje;
import co.com.choucair.certification.newexperiencie.tasks.AbrePagina;
import co.com.choucair.certification.newexperiencie.tasks.IniciarSesion;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginUsuarioStepdefinitions {

    @Given("^(.*)tiene una cuenta válida$")
    public void usuarioTieneUnaCuentaVálida(String strNombreActor) throws Exception {
        theActorCalled(strNombreActor).wasAbleTo(AbrePagina.automationPractice());


    }


    @When("^ingresa  correo y  contraseña$")
    public void ingresaCorreoYContraseña(List<String>cuentaList) throws Exception {
               theActorInTheSpotlight().attemptsTo(IniciarSesion.usuarioRegistrado(cuentaList.get(0),cuentaList.get(1)));

    }

    @Then("^El usuario inica sesio correctamente en (.*)$")
    public void elUsuarioInicaSesioCorrectamenteEn(String strMsjEsperado) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMensaje.esperado(strMsjEsperado)));

    }
}
