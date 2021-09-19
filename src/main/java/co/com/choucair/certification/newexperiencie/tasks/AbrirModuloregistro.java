package co.com.choucair.certification.newexperiencie.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static co.com.choucair.certification.newexperiencie.userinterface.ModuloUsuarioPage.*;

public class AbrirModuloregistro implements Task {

    public static AbrirModuloregistro nuevaCuenta() {
        return Tasks.instrumented(AbrirModuloregistro.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_SIGNIN)


        );

    }
}
