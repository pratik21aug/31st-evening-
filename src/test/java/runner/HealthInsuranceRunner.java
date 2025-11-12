package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"D:\\31st-evening-\\src\\test\\resources\\coverFoxFeatures\\coverfox.feature"},
		glue = {"stepDefinitions","hooks"}, //tags = ""
		plugin = {"pretty", "html:target/cucumber-reports/reports.html"},
		publish = true,
		dryRun = false
		
)

public class HealthInsuranceRunner extends AbstractTestNGCucumberTests {

}
