package App;

import TestSteps.AuthorizationSteps;
import TestSteps.MainPageSteps;

public class PageBuilder {

    // page builders
    public MainPageSteps mainPage() {return new MainPageSteps();}
    public AuthorizationSteps authorization() {return new AuthorizationSteps();}
}
