package tek.framework.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.By;
import tek.framework.pages.HomePage;
import tek.framework.utility.SeleniumUtilities;

public class HomePageSteps extends SeleniumUtilities {

    @Given("open browser and navigate to retail app")
    public void openBrowserAndNavigate() {
        setupBrowser();
    }

    @Then("Validate Title on top left corner")
    public void validateLeftCornerTitle() {
        String actualTitle = getElementText(HomePage.HOME_PAGE_TILE);

        //Assertion in Cucumber using JUnit Assertion.
        //Assertions used to Validate and fail / pass tests.
        Assert.assertEquals("TEKSCHOOL" , actualTitle);
    }

    @Then("quit browser")
    public void closeBrowserAtEnd() {
        getDriver().quit();
    }

}
