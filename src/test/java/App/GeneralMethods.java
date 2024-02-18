package App;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;

public class GeneralMethods extends PageBuilder {
    static void prefsInit()
    {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1080x900";
        Configuration.headless = false;
    }

    @BeforeEach
    void init()
    {
        prefsInit();
    }

    @AfterEach
    void tearDown()
    {
        Selenide.closeWebDriver();
    }
}
