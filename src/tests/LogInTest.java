package tests;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import pages.LogInPage;

public class LogInTest extends TestTemplateClass{
	
	
	
	@Test
	public void homePageTest() throws InterruptedException {

		this.driver.navigate().to(this.locators.getProperty("url"));
		Alert alert = this.driver.switchTo().alert();
		alert.accept();
		
		LogInPage logInPage = new LogInPage(driver, selectors, locators, waiter);
		
		logInPage.getUserField().click();
		logInPage.enterUser();
		
		String pageUrl = this.driver.getCurrentUrl();
		
		boolean isLogedIn = false;
		
		if(pageUrl.contains("username=")) {
			isLogedIn = true;
		}
		
		Assert.assertTrue(isLogedIn);
	}
}
	
	
	
