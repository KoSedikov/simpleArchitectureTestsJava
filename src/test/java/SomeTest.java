import App.GeneralMethods;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SomeTest extends GeneralMethods {

    @BeforeEach
    void authorize()
    {
        authorization()
                .fillUsername()
                .fillPass()
                .submitData();
    }

    @Test
    @DisplayName("Test #1")
    void test1()
    {
        mainPage()
                .step1()
                .step2()
                .step3();
    }
}
