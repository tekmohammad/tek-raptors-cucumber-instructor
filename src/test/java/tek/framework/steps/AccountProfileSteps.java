package tek.framework.steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import tek.framework.pages.AccountProfilePage;
import tek.framework.utility.SeleniumUtilities;

public class AccountProfileSteps extends SeleniumUtilities {
    @Then("Validate account create with {string}")
    public void validateAccountCreated(String expectedEmailAddress) {
       String actualProfileEmail = getElementText(AccountProfilePage.PROFILE_USERNAME);
        Assert.assertEquals("Profile email should be equal as created one",
                expectedEmailAddress,
                actualProfileEmail);
    }
}
