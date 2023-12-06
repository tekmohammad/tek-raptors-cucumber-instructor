package tek.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetup {

    //Making driver instance static to share value with all the objects.
    //Using Encapsulation we are limiting direct access to the WebDriver
    //Variable so no other object can change it directly.
    private static WebDriver driver;
    public void setupBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://retail.tekschool-students.com/");
    }

    //Having only Getter for Encapsulated variable we only give other objects.
    //a read-only access.
    public WebDriver getDriver() {
        return driver;
    }
}
