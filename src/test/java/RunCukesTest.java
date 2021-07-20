import org.junit.runner.RunWith;
import cucumber.api.*;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources"},
		plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber-report.json"},
		tags= "@smokeTest"
)
public class RunCukesTest {}
