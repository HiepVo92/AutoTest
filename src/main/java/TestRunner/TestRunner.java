package TestRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

    @RunWith(Cucumber.class)
    @CucumberOptions(features="src/main/java/feature",glue={"stepDefinition"},plugin = {
            "html:Report/reportHomepage","json:Report/cucumber.json"},tags={"@Test"})
    public class TestRunner {
    }

