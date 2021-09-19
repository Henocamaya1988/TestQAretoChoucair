package co.com.choucair.certification.newexperiencie.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.choucair.certification.newexperiencie.userinterface.LoginPage.MSJ_EXPECTED;

public class ValidarMensaje implements Question<Boolean> {

private String strMsjEsperado;

    public ValidarMensaje(String strMsjEsperado){this.strMsjEsperado = strMsjEsperado;}

    public static ValidarMensaje esperado(String MsjEsperado) {return new ValidarMensaje(MsjEsperado);}

    @Override
    public Boolean answeredBy(Actor actor) {
        String labelResult = Text.of(MSJ_EXPECTED).viewedBy(actor).asString();
        return strMsjEsperado.equalsIgnoreCase(labelResult);

    }
}
