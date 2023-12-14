package tek.framework.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.framework.pages.CreateAccountPage;
import tek.framework.utility.SeleniumUtilities;

public class CreateAccountSteps extends SeleniumUtilities {

    @When("Fill Create Account form {string} {string} {string}")
    public void fillUpCreateAccountForm(String name, String email, String password) {
        String emailAddress;
        if (email.contains("random")) {
            String[] splitEmail = email.split("@");
            int randomNumber = (int) (Math.random() * 1000);
            emailAddress = splitEmail[0] + randomNumber + "@" + splitEmail[1];
        } else {
            emailAddress = email;
        }

        sendText(CreateAccountPage.NAME_INPUT, name);
        sendText(CreateAccountPage.EMAIL_INPUT, emailAddress);
        sendText(CreateAccountPage.PASSWORD_INPUT, password);
        sendText(CreateAccountPage.CONFIRM_PASS_INPUT, password);
    }

    @When("Click on sign up button")
    public void clickOnSignUpButton() {
        clickOnElement(CreateAccountPage.SIGN_UP_BUTTON);
    }
}
