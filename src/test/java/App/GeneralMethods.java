package App;

import org.junit.jupiter.api.*;

public class GeneralMethods extends PageBuilder {
    // init chrome prefs
    @BeforeAll
    static void chromePrefsInit(){}
    // setup chrome prefs

    // init drivers
    @BeforeEach
    void webDriverInit(){}
}
