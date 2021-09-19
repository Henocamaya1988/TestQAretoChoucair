package co.com.choucair.certification.newexperiencie.tasks;

import co.com.choucair.certification.newexperiencie.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.choucair.certification.newexperiencie.userinterface.ModuloUsuarioPage.*;

public class DiligenciarFormulario implements Task {
    private User user;
    public DiligenciarFormulario(User user){
        this.user=user;
    }
    public static DiligenciarFormulario YourAddress(User user) {
        return Tasks.instrumented(DiligenciarFormulario.class,user);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getCompany()).into(INPUT_COMPANY),
                Enter.theValue(user.getAddres()).into(INPUT_ADDRESS),
                Enter.theValue(user.getAddress2()).into(INPUT_ADDRESS2),
                Enter.theValue(user.getCity()).into(INPUT_CITY),
                SelectFromOptions.byValue("5").from(INPUT_STATE),
                Enter.theValue(user.getPostalCode()).into(INPUT_POSTCODE),
                SelectFromOptions.byVisibleText(user.getCountry()).from(INPUT_COUNTRY),
                Enter.theValue(user.getAditionalInformation()).into(INPUT_ADITIONAL_INFORMATION),
                Enter.theValue(user.getHomephone()).into(INPUT_HOME_PHONE),
                Enter.theValue(user.getMobilephone()).into(INPUT_MOBILE_PHONE),
                Enter.theValue(user.getAddressalias()).into(INPUT_ALIAS)





        );
    }
}
