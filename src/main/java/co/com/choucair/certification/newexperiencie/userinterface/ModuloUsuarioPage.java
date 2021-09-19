package co.com.choucair.certification.newexperiencie.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ModuloUsuarioPage{

    public static final Target BUTTON_SIGNIN = Target.the("Boton iniciar sesion").located(By.xpath("//*[@class='login']"));
    public static final Target INPUT_EMAIL = Target.the("Campo escribir email").located(By.id("email_create"));
    public static final Target BUTTON_CREATE_AN_ACCOUNT = Target.the("Boton crear cuenta").located(By.id("SubmitCreate"));
    public static final Target SELECT_TITLE_MALE = Target.the("Selecckonar genero Masculino").located(By.id("id_gender1"));
    public static final Target SELECT_TITLE_FEMALE = Target.the("Selecckonar genero Femenino").located(By.id("id_gender2"));
    public static final Target INPUT_FIRSTNAME_CUSTOMER = Target.the("Campo escribir nombre").located(By.id("customer_firstname"));
    public static final Target INPUT_LASTNAME_CUSTOMER = Target.the("Campo escribir apellido").located(By.id("customer_lastname"));
    public static final Target INPUT_PASSWORD = Target.the("Campo escribir password").located(By.id("passwd"));
    public static final Target INPUT_DAY = Target.the("Campo escribir dia").located(By.id("days"));
    public static final Target INPUT_MONTH = Target.the("Campo escribir mes").located(By.id("months"));
    public static final Target INPUT_YEAR = Target.the("Campo escribir año").located(By.id("years"));
    public static final Target INPUT_COMPANY = Target.the("Campo escribir company your address").located(By.id("company"));
    public static final Target INPUT_ADDRESS = Target.the("Campo escribir direccion your address").located(By.id("address1"));
    public static final Target INPUT_ADDRESS2 = Target.the("Campo escribir direccion2 your address").located(By.id("address2"));
    public static final Target INPUT_CITY = Target.the("Campo escribir city your address").located(By.id("city"));
    public static final Target INPUT_POSTCODE = Target.the("Campo escribir Zip/Postal Code your address").located(By.id("postcode"));
    public static final Target INPUT_STATE = Target.the("Campo escribir state your address").located(By.id("id_state"));
    public static final Target INPUT_COUNTRY = Target.the("Campo escribir direccion your address").located(By.id("id_country"));
    public static final Target INPUT_ADITIONAL_INFORMATION = Target.the("Campo escribir aditional information your address").located(By.id("other"));
    public static final Target INPUT_HOME_PHONE = Target.the("Campo escribir mobile phone your address").located(By.id("phone"));
    public static final Target INPUT_MOBILE_PHONE = Target.the("Campo escribir home phone your address").located(By.id("phone_mobile"));
    public static final Target INPUT_ALIAS = Target.the("Campo escribir alias_direccion your address").located(By.id("alias"));
    public static final Target BUTTON_REGISTER = Target.the("Campo escribir alias_direccion your address").located(By.id("submitAccount"));
    public static final Target MSJ_EXPECTED = Target.the("Campo escribir alias_direccion your address").located(By.xpath("//*[@id='center_column']//h1[contains (text (),'My account')]"));


}
