package cucumberStepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CommonStepDefinitions {
	static WebDriver driver;
	
	
	// will run before each test
	@Before
	public void setUp() {
		
		driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		
	}
	
	// will run after each test
	@After
	public void tearDown() throws InterruptedException {
		
		driver.quit();
		Thread.sleep(1000);
		
	}
	
	// use in other step definition files to get a driver instance to operate on 
	public WebDriver getDriver() {
		return driver;
		
	}
	
	
}

