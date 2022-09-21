package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\MuskanSharma\\IdeaProjects\\NopCucumber\\src\\test\\java\\FeatureFiles\\Login.feature"},
        glue = {"StepDefinition"},
        dryRun = true
)

public class Runner{

}