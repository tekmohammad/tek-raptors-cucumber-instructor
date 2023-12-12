package tek.framework.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import tek.framework.utility.SeleniumUtilities;

public class Hooks extends SeleniumUtilities {

    @Before
    public void beforeScenarios() {
        //We need to open browser and navigate
        setupBrowser();
    }

    @After
    public void afterScenarios() {
        //quit driver
        quitBrowser();
    }
}
