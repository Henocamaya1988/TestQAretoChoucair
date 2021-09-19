package co.com.choucair.certification.newexperiencie.stepdefinitions;

import co.com.choucair.certification.newexperiencie.model.User;
import co.com.choucair.certification.newexperiencie.questions.VerificarInicioDeSesion;
import co.com.choucair.certification.newexperiencie.tasks.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CrearCuentaUsuarioStepdefinitions {
    @Given("^(.*)esta en la pagina inicial de automationpractice$")
    public void EstaEnLaPaginaInicialDeAutomationpractice(String strNombreActor) throws Exception {
        theActorCalled(strNombreActor).wasAbleTo(AbrirPaginaPrincipal.deAutomationPractice());
    }


    @When("^Da clic en Sing Ing$")
    public void daClicEnSingIng() throws Exception {
        theActorInTheSpotlight().attemptsTo(AbrirModuloregistro.nuevaCuenta());
    }

    @When("^Ingresa el Email$")
    public void ingresaElEmail(List<String>strEmail) throws Exception {
        theActorInTheSpotlight().attemptsTo(IngresarEmail.nuevoUsuario(strEmail.get(0)));

    }

    @When("^Da clic en Create an account$")
    public void daClicEnCreateAnAccount() throws Exception {
        theActorInTheSpotlight().attemptsTo(OpcionCrearCuenta.usuario());

    }

    @When("^Rellena el formulario de registro your personal information$")
    public void rellenaElFormularioDeRegistroYourPersonalInformation(List<User>userList) throws Exception {
      theActorInTheSpotlight().attemptsTo(CrearUsuario.informacion(userList.get(0)));

    }

    @When("^Rellena el formulario  direccion your address$")
    public void rellenaElFormularioDireccionYourAddress(List<User>userList) throws Exception {
        theActorInTheSpotlight().attemptsTo(DiligenciarFormulario.YourAddress(userList.get(0)));

    }

    @When("^Da clic en Register$")
    public void daClicEnRegister() throws Exception {
        theActorInTheSpotlight().attemptsTo(OpcionRegistrar.Informacion());

    }

    @Then("^Es llevado a la pagina (.*)$")
    public void esLlevadoALaPagina(String msjEsperado) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarInicioDeSesion.Usuario(msjEsperado)));

    }

}
