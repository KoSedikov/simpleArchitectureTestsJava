package Elements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class AuthorizationElements {
    public static final SelenideElement     INPUT_USER_NAME_FIELD = $x("");
    public static final SelenideElement INPUT_USER_PASSWORD_FIELD = $x("");
    public static final SelenideElement        SUBMIT_DATA_BUTTON = $x("");
}
