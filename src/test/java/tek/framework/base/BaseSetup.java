package tek.framework.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseSetup {

    //Making driver instance static to share value with all the objects.
    //Using Encapsulation we are limiting direct access to the WebDriver
    //Variable so no other object can change it directly.
    private static WebDriver driver;

    public void setupBrowser() {
       Properties configs = readProperties();

        //Cross Browser Testing
        String browserType = configs.getProperty("browser");
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
        String url = configs.getProperty("retail.url");
        driver.get(url);
    }

    private Properties readProperties(){
        //Full file path to the configuration file.
        //System.getProprty("user.dir") return directory up to project level.
        String propertyFilePath = System.getProperty("user.dir")
                + "/src/test/resources/configs/qa-env.properties";
        //Create and Object of Properties Class in java.util package.
        Properties properties = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream(propertyFilePath);
            properties.load(inputStream);
        }catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Can not read property file");
        }
        return properties;
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
