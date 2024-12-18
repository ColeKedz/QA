package testngWithSelenium;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Google {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	 @AfterMethod
	    public void tearDown()
	    {
	        driver.quit();
	    }

	@Test
	public void search() throws InterruptedException {
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("cole kedzierski", Keys.ENTER);
		Thread.sleep(3000);
	
		
		List<WebElement> searchResults =  driver.findElements(By.className("yuRUbf"));
		Reporter.log("the first web element collected was: " + searchResults.getFirst().getText());
		searchResults.getFirst().click();
		Thread.sleep(3000);
		
		
		String expectedPage = "https://www.linkedin.com/in/cole-kedzierski";
		String currentPage = driver.getCurrentUrl();
		Reporter.log("The page that the test ended up on was: " + currentPage);
		
		
		Assert.assertEquals(currentPage, expectedPage);
	
		
	}
	
	
	
}
