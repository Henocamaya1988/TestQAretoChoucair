package co.com.choucair.certification.newexperiencie.tasks;
import co.com.choucair.certification.newexperiencie.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.choucair.certification.newexperiencie.userinterface.ModuloUsuarioPage.*;

public class CrearUsuario implements Task {
    private User user;
    private String male = "Mr.";
    private String female = "Mrs.";


    public CrearUsuario(User user){ this.user = user;}

    public static CrearUsuario informacion(User user) {return Tasks.instrumented(CrearUsuario.class,user);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Check.whether(user.getTitle().toString().equals(male)).andIfSo(Click.on(SELECT_TITLE_MALE)).otherwise(Click.on(SELECT_TITLE_FEMALE)),
                Enter.theValue(user.getFirstname()).into(INPUT_FIRSTNAME_CUSTOMER),
                Enter.theValue(user.getLastname()).into(INPUT_LASTNAME_CUSTOMER),
                Enter.theValue(user.getPassword()).into(INPUT_PASSWORD),
                SelectFromOptions.byValue("18").from(INPUT_DAY),
                SelectFromOptions.byValue("4").from(INPUT_MONTH),
                SelectFromOptions.byValue("1988").from(INPUT_YEAR)  );

    }
}
