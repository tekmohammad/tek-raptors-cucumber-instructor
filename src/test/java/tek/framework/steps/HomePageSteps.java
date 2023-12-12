package tek.framework.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tek.framework.pages.HomePage;
import tek.framework.utility.SeleniumUtilities;

public class HomePageSteps extends SeleniumUtilities {

    @Given("open browser and navigate to retail app")
    public void openBrowserAndNavigate() {
        setupBrowser();
    }

    @Then("Validate Title on top left corner")
    public void validateLeftCornerTitle() {
        String actualTitle = getElementText(HomePage.HOME_PAGE_TITLE);

        //Assertion in Cucumber using JUnit Assertion.
        //Assertions used to Validate and fail / pass tests.
        Assert.assertEquals("TEKSCHOOL" , actualTitle);
    }

    @Then("quit browser")
    public void closeBrowserAtEnd() {
        getDriver().quit();
    }

    @Then("Validate sign in button is enabled")
    public void validateSignInEnabled() {
        boolean isSignInEnabled =   isElementEnabled(HomePage.SING_IN_BUTTON);
        //Assert true check result of boolean or condition is true
        Assert.assertTrue(isSignInEnabled);
    }

}
