package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/java/features" ,
		glue= {"stepDefinitions"}, 
		monochrome= true,
		tags= "@RegTest",
		plugin= {"pretty", "json:target/cucumber", "junit: target/cukes.xml"}
		)
public class TestRunner {

}
