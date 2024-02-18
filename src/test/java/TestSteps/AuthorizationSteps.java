package TestSteps;

import Elements.AuthorizationElements;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.Keys;

import javax.sound.sampled.Control;

import java.util.logging.Logger;

import static java.lang.Character.CONTROL;
import static java.lang.Character.isISOControl;

public class AuthorizationSteps extends AuthorizationElements {

    private String userName = "123";
    private String userPass = "123";
    @Step
    @DisplayName("Authorize on stage: filling username")
    public AuthorizationSteps fillUsername()
    {
        // fill username
        System.out.println("In user name input: ");
        INPUT_USER_NAME_FIELD.click();
        INPUT_USER_NAME_FIELD.sendKeys(Keys.CONTROL + "a");
        INPUT_USER_NAME_FIELD.sendKeys(Keys.BACK_SPACE);
        System.out.println("All deleted from field");
        INPUT_USER_NAME_FIELD.setValue(userName);
        System.out.println("Set value: "+userName);
        return this;
    }

    @Step
    @DisplayName("Authorize on stage: filling pass")
    public AuthorizationSteps fillPass()
    {
        // fill username
        System.out.println("In password input: ");
        INPUT_USER_PASSWORD_FIELD.click();
        INPUT_USER_PASSWORD_FIELD.sendKeys(Keys.CONTROL + "a");
        INPUT_USER_PASSWORD_FIELD.sendKeys(Keys.BACK_SPACE);
        System.out.println("All deleted from the field");
        INPUT_USER_PASSWORD_FIELD.setValue(userPass);
        System.out.println("Set value: "+userPass);
        return this;
    }
    @Step
    @DisplayName("Authorize on stage: submit data")
    public AuthorizationSteps submitData()
    {
        // fill username
        SUBMIT_DATA_BUTTON.click();
        System.out.println("Data submitted!");
        return this;
    }
}
