package co.com.choucair.certification.newexperiencie.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target INPUT_EMAIL = Target.the("Campo escribir email").located(By.id("email"));
    public static final Target INPUT_PASSWORD = Target.the("Campo escribir password").located(By.id("passwd"));
    public static final Target BUTTON_SIGNIN = Target.the("Boton iniciar sesion").located(By.id("SubmitLogin"));
    public static final Target MSJ_EXPECTED = Target.the("Campo escribir alias_direccion your address").located(By.xpath("//*[@id='center_column']//h1[contains (text (),'My account')]"));

}
