package cucumberStepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pageObjects.AngularSandwhich;

public class PomAngularSandwhich {
	
	static WebDriver driver;
	AngularSandwhich main = new AngularSandwhich();
	
	@Given("User is on AngularSandwhich")
	public void user_is_on_angular_sandwhich() {
		driver = new ChromeDriver();
		driver.get("https://colekedz.github.io/Angular-Sandbox/");
		
	}
	
	@When("User enters a name for an order as {string}")
	public void user_enters_order_name(String name) {
	
		
		
	}
	

}
