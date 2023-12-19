package tek.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class BaseSetup {

    //Making driver instance static to share value with all the objects.
    //Using Encapsulation we are limiting direct access to the WebDriver
    //Variable so no other object can change it directly.
    private static WebDriver driver;

    public void setupBrowser() {
        //Cross Browser Testing
        String browserType = "chrome";
        switch (browserType.toLowerCase()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox" :
                driver = new FirefoxDriver();
                break;
            case "edge" :
                driver = new EdgeDriver();
                break;
            default:
                throw new RuntimeException("Wrong browser type failing test");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://retail.tekschool-students.com/");
    }

    //Having only Getter for Encapsulated variable we only give other objects.
    //a read-only access.
    public WebDriver getDriver() {
        return driver;
    }

    public void quitBrowser() {
        //Null Check to avoid Null Pointer Exception
        //If for any reason driver did not instantiate
        if (driver != null)
            driver.quit();
    }
}
