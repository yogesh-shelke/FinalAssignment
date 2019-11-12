package StepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
		(
		features="Resources/features", 		
		format={"pretty", "html:target/cucumber"},
		glue= "StepDefinition", 
		tags = {"@loginflowimplemenataion"}	
		)

public class TestRunner {

}
