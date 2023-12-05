package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class IntroductionSteps {

    @Given("Prepare for school")
    public void prepareToSchool() {
        System.out.println("This Is Given Prepare for school");
    }

    @When("Walking school direction")
    public void walkingToSchool() {
        System.out.println("This is When walking school direction");
    }

    @Then("arriving to school")
    public void arrivingToSchool() {
        System.out.println("This is Then Arriving to school");
    }
}
