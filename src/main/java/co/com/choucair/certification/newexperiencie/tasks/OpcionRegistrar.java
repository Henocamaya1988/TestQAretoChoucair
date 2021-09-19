package co.com.choucair.certification.newexperiencie.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.newexperiencie.userinterface.ModuloUsuarioPage.*;

public class OpcionRegistrar implements Task {
    public static OpcionRegistrar Informacion() {
        return Tasks.instrumented(OpcionRegistrar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_REGISTER)
        );
    }
}
