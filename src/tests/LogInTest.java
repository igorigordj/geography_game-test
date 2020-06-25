package tests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LogInPage;

public class LogInTest extends TestTemplateClass{
	
	
	
	@Test
	public void logInTest() throws InterruptedException {

		this.driver.navigate().to(this.locators.getProperty("url"));
		
		LogInPage logInPage = new LogInPage(driver, selectors, locators, waiter);
		
		logInPage.getHomePageLink().click();
		logInPage.getUserField().click();
		logInPage.enterUser();
		
		WebElement helloMsg = this.driver.findElement(By.xpath(selectors.getProperty("helloMsg")));
		
		boolean isLogedIn = false;
		
		if(helloMsg.isDisplayed()) {
			isLogedIn = true;
		}
		
		Assert.assertTrue(isLogedIn);
	}
}
	
	
	
