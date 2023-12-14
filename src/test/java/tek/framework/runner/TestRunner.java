package tek.framework.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:features", //Location for Feature Files
        glue = "tek.framework.steps", //Location for Packages contains steps for cucumber to scan
        tags = "@Create_Account", //with tags in TestRunner we can run Feature or Scenario in group
        dryRun = false, //if set to TRUE scan for unimplemented steps without executing all the steps.
        plugin = {
                "html:target/cucumber_report/report.html"
        }
)
public class TestRunner {
}
