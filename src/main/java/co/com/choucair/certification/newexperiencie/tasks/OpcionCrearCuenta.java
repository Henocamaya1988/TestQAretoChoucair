package co.com.choucair.certification.newexperiencie.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.certification.newexperiencie.userinterface.ModuloUsuarioPage.*;

public class OpcionCrearCuenta implements Task {

    public static OpcionCrearCuenta usuario(){
        return Tasks.instrumented(OpcionCrearCuenta.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BUTTON_CREATE_AN_ACCOUNT)





        );
    }
}
