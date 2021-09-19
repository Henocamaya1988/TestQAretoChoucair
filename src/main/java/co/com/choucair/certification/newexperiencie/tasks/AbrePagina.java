package co.com.choucair.certification.newexperiencie.tasks;

import co.com.choucair.certification.newexperiencie.userinterface.PaginaPrincipalAutomationPractice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.choucair.certification.newexperiencie.userinterface.ModuloUsuarioPage.BUTTON_SIGNIN;


public class AbrePagina implements Task {
    private PaginaPrincipalAutomationPractice abrepagina;

    public static AbrePagina automationPractice() {
        return Tasks.instrumented(AbrePagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrepagina),
                Click.on(BUTTON_SIGNIN)
        );

    }
}
