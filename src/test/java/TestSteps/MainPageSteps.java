package TestSteps;

import Elements.MainPageElements;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;

public class MainPageSteps extends MainPageElements {

    @Step
    @DisplayName("Step 1")
    MainPageSteps step1 ()
    {

        return this;
    }
}
