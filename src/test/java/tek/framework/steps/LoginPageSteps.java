package tek.framework.steps;

import io.cucumber.java.en.And;
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

}
