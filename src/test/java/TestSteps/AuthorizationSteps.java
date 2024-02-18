package TestSteps;

import Elements.AuthorizationElements;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;

public class AuthorizationSteps extends AuthorizationElements {

    @Step
    @DisplayName("Authorize on stage: filling username")
    public AuthorizationSteps fillUsername()
    {
        // fill username
        return this;
    }

    @Step
    @DisplayName("Authorize on stage: filling pass")
    public AuthorizationSteps fillPass()
    {
        // fill username
        return this;
    }
    @Step
    @DisplayName("Authorize on stage: submit data")
    public AuthorizationSteps submitData()
    {
        // fill username
        return this;
    }
}
