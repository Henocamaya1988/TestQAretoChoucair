package co.com.choucair.certification.newexperiencie.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.newexperiencie.userinterface.ModuloUsuarioPage.*;


public class IngresarEmail implements Task {
    private String strEmail;
    public static IngresarEmail nuevoUsuario(String strEmail) {
        return Tasks.instrumented(IngresarEmail.class,strEmail);
    }

    public IngresarEmail(String strEmail){
        this.strEmail = strEmail;

    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strEmail).into(INPUT_EMAIL)

        );
    }
}
