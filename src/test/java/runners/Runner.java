package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/cucumber-html/index.html",
                "junit:target/junit/junit-report"},
        features = "src/test/resources/features",
        glue = "stepDefinitions")
public class Runner {
}
