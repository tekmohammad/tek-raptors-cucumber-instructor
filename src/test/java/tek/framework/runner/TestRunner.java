package tek.framework.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features", //Location for Feature Files
        glue = "tek.framework.steps" //Location for Packages contains steps for cucumber to scan
)
public class TestRunner {
}
