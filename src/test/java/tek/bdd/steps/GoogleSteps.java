package tek.bdd.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GoogleSteps {
    //Instance Variable that hold value of driver;
    private WebDriver driver;

    @Given("Open chrome browser")
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Given("navigate to google")
    public void navigateToGoogle(){
        driver.get("https://google.com");
    }

    @When("type {string} in search box and click search")
    public void typeAndSearch(String searchText){
        driver.findElement(By.name("q")).sendKeys(searchText);
        //Selenium will press Enter on Keyboard
        driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
    }

    @Then("Google shows the result")
    public void resultDisplayOnScreen() {
       WebElement element = driver.findElement(By.id("appbar"));
       boolean isDisplayed = element.isDisplayed();
        System.out.println(isDisplayed);
    }

    @Then("close browser")
    public void closeBrowser() {
        driver.quit();
    }
}
