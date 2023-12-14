package tek.framework.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.framework.pages.AccountProfilePage;
import tek.framework.pages.CreateAccountPage;
import tek.framework.utility.SeleniumUtilities;

import java.util.List;
import java.util.Map;

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

    @When("Fill up account form with DataTable")
    public void fill_up_account_form_with_data_table(DataTable dataTable) {
        //Change Data Table to Map<String, String>
        Map<String, String> data = dataTable.asMap();

        sendText(CreateAccountPage.NAME_INPUT, data.get("name"));
        sendText(CreateAccountPage.EMAIL_INPUT, data.get("email"));
        sendText(CreateAccountPage.PASSWORD_INPUT, data.get("password"));
        sendText(CreateAccountPage.CONFIRM_PASS_INPUT, data.get("password"));
    }

    @When("Fill up account form with list data table")
    public void fill_up_account_form_with_list_data_table(DataTable dataTable) {
       List<String> data= dataTable.asList();
       sendText(CreateAccountPage.NAME_INPUT, data.get(0));
       sendText(CreateAccountPage.EMAIL_INPUT, data.get(1));
       sendText(CreateAccountPage.PASSWORD_INPUT, data.get(2));
       sendText(CreateAccountPage.CONFIRM_PASS_INPUT, data.get(2));
    }
}
