package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AngularSandwhich {
WebDriver driver;

// paths and selectors are not optimized, use as examples of ways to use xpath and selectors
By orderName = By.xpath("//form/div//input[@type=\"text\"]");
By whiteBread = By.id("White");
By chicken = By.xpath("//label[@for=\"Chicken\"]//..//input");
By cheddar = By.xpath("//div[@formarrayname='cheeses']//child::div[1]//input");
By tomato = By.xpath("//form//ancestor::div//input[@id='Tomato']");
By salt = By.id("Salt");
By submit = By.xpath("//button[@type='submit']");
By reset = By.xpath("//button[@type='reset']");


public void selectBread(String bread) {
	
}

public void enterOrderName(WebDriver driver, String name) throws InterruptedException {
	driver.findElement(orderName).sendKeys(name);
	Thread.sleep(5000);
}



}
