package tek.bdd.steps;

import io.cucumber.java.en.And;
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

    @Given("saving some money")
    public void savingMoney() {
        System.out.println("Saving Money");
    }

    @Given("dress up for apple store")
    public void dressUp(){
        System.out.println("Dress up for ");
    }

    @And("start my car")
    public void startTheCar() {
        //Implementation here
    }

    @Given("my car running")
    public void myCarRunning() {
    }

    @When("driving to apple store")
    public void driving_to_apple_store() {

    }
    @When("listening to musing")
    public void listening_to_musing() {

    }
    @Then("arrive to shopping mall")
    public void arrive_to_shopping_mall() {

    }
    @Then("parking my car")
    public void parking_my_car() {

    }
    @When("order iPhone15 ProMax")
    public void order_i_phone15_pro_max() {

    }
    @Then("get my iphone")
    public void get_my_iphone() {

    }

    @When("driver to Gient")
    public void driver_to_gient() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("Arriving to Gient")
    public void arriving_to_gient() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("buying groceries")
    public void buying_groceries() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
