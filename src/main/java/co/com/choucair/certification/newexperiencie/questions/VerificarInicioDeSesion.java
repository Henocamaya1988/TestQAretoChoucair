package co.com.choucair.certification.newexperiencie.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import static co.com.choucair.certification.newexperiencie.userinterface.ModuloUsuarioPage.MSJ_EXPECTED;

public class VerificarInicioDeSesion implements Question<Boolean> {

    private String strEsperado;

    public VerificarInicioDeSesion(String strEsperado){
        this.strEsperado = strEsperado;
    }

    public static VerificarInicioDeSesion Usuario(String msjEsperado) {return new VerificarInicioDeSesion(msjEsperado);}

    @Override
    public Boolean answeredBy(Actor actor) {
        String labelResult = Text.of(MSJ_EXPECTED).viewedBy(actor).asString();
        return strEsperado.equalsIgnoreCase(labelResult);


    }
}
