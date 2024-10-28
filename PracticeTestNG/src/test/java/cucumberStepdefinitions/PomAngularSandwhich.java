package cucumberStepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pageObjects.AngularSandwhich;
import cucumberStepdefinitions.CommonStepDefinitions;

public class PomAngularSandwhich {
	
	// CommonStepDefinitions holds the before and after hooks to start and close the driver. use it to get the driver started at the beginning of a test.
	static CommonStepDefinitions commonMethods = new CommonStepDefinitions();
	static WebDriver driver = commonMethods.getDriver();
	
	AngularSandwhich main = new AngularSandwhich();
	
	@Given("User is on AngularSandwhich")
	public void user_is_on_angular_sandwhich() {
		driver.get("https://colekedz.github.io/Angular-Sandbox/");
		
	}
	
	@When("User enters a name for an order as {string}")
	public void user_enters_order_name(String name) throws InterruptedException {
		main.enterOrderName(driver, name);
	
		
		
	}
	

}
