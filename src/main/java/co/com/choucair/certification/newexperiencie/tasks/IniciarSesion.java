package co.com.choucair.certification.newexperiencie.tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.newexperiencie.userinterface.LoginPage.*;

public class IniciarSesion implements Task {
     private String strEmail;
     private String strPassword;
    public IniciarSesion(String strEmail,String strPassword){
        this.strEmail = strEmail;
        this.strPassword = strPassword;
    }
    public static IniciarSesion usuarioRegistrado(String strEmail,String strPassword) {
        return Tasks.instrumented(IniciarSesion.class,strEmail,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strEmail).into(INPUT_EMAIL),
                Enter.theValue(strPassword).into(INPUT_PASSWORD),
                Click.on(BUTTON_SIGNIN)
        );



    }
}
