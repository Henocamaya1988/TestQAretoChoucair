package co.com.choucair.certification.newexperiencie.tasks;

import co.com.choucair.certification.newexperiencie.userinterface.PaginaPrincipalAutomationPractice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPaginaPrincipal implements Task {
    private PaginaPrincipalAutomationPractice paginaPrincipalAutomationPractice;

    public static AbrirPaginaPrincipal deAutomationPractice(){
        return Tasks.instrumented(AbrirPaginaPrincipal.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaPrincipalAutomationPractice));
    }
}
