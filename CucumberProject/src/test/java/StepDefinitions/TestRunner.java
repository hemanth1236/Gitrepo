package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(monochrome = true, plugin = {
		"pretty" }, features = "src/test/java/features", glue = "StepDefinitions", tags = { "@Sanity" })

public class TestRunner {

}
