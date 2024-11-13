package testngWithSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.NetworkInterceptor;
import org.openqa.selenium.remote.http.Contents;
import org.openqa.selenium.remote.http.HttpResponse;
import org.openqa.selenium.remote.http.Route;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.net.MediaType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NetworkInterceptPractice {
	
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
	 public void simpleIntercept() throws InterruptedException {
		 
		 NetworkInterceptor interceptor = new NetworkInterceptor(
				 driver, Route.matching(req -> true).to( () -> req -> new HttpResponse()
						 .setStatus(200)
						 .addHeader("Content-Type", MediaType.HTML_UTF_8.toString())
						 .setContent(Contents.utf8String("Website response has been Intercepted!"))
						 )
				 
				 );
		 
		 driver.get("https://colekedz.github.io/Angular-Sandbox/");
		 
		 Thread.sleep(3000);
		 
	 }

}
