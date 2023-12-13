package tek.framework.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import tek.framework.pages.HomePage;
import tek.framework.pages.LoginPage;
import tek.framework.utility.SeleniumUtilities;

public class LoginPageSteps extends SeleniumUtilities {

    @And("Enter username {string} and password {string}")
    public void enterCredentials(String username, String password){
        sendText(LoginPage.USERNAME_INPUT, username);
        sendText(LoginPage.PASSWORD_INPUT, password);
    }

    @And("Click on Login button")
    public void clickOnLoginButton() {
        clickOnElement(LoginPage.LOGIN_BUTTON);
    }

    @Then("Validate error message {string}")
    public void validateErrorMessage(String expectedErrorMessage) {
        String actualErrorMessage = getElementText(LoginPage.ERROR_MESSAGE);
        Assert.assertEquals("Validating login error message",
                expectedErrorMessage,
                actualErrorMessage);
    }

    @When("Click on Create New Account button")
    public void clickOnNewAccountLink() {
        clickOnElement(LoginPage.CREATE_NEW_ACCOUNT_LINK);
    }

}
