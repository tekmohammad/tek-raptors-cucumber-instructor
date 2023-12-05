package tek.bdd.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OtherSteps {

    @When("student {string} take exam")
    public void studentTakeExam(String name) {
        System.out.println(name + " Take Exam");
    }

    @When("user enter username as {string} and password as {string}")
    public void enterCredentials(String username, String password) {
        System.out.println(username);
        System.out.println(password);
        System.out.println("Entered");
    }

    @When("user have {int} notification")
    public void user_have_notification(int number) {
        System.out.println(number);
    }

    @When("student {string} drive to school")
    public void student_drive_to_school(String student) {
        System.out.println(student + " driving");
    }
    @Then("student {string} arrive to school")
    public void student_arrive_to_school(String student) {
        System.out.println(student + " arrive");
    }
}
