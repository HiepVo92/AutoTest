package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/main/java/feature",
            glue = "stepDefinition",
            monochrome = true,
            plugin = {
                    "html:Report/reportHomepage","json:Report/cucumber.json"}
    )

    public class AllRunner {
    }


