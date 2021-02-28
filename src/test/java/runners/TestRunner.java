package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;
//99999
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/resources/features"},

        glue = {"step_Definitions"},
        monochrome = true,
        tags = "@Regression",
        plugin = {
                "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber/cucumber-report.json",
                "junit:target/cucumber.xml"
        }, snippets = CAMELCASE
)
public class TestRunner {

}
