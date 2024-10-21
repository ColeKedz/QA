package cucumberTestRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="", features= {"src/test/resources/features"}, 
glue= {"cucumberStepdefinitions"}, 
plugin= {"pretty","html:target/htmlreport.html"} )

public class CucumberTestRunner extends AbstractTestNGCucumberTests {
	
	
	
}
