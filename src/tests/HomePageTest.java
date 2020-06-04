package tests;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTest extends TestTemplateClass{
	
	
	
	@Test
	public void homePageTest() throws InterruptedException {

		this.driver.navigate().to(this.locators.getProperty("url"));
		Alert alert = this.driver.switchTo().alert();
		alert.accept();
		
		HomePage homePage = new HomePage(driver, selectors, locators, waiter);
		
		homePage.getUserField().click();
		homePage.enterUser();
		
		String pageUrl = this.driver.getCurrentUrl();
		
		boolean isLogedIn = false;
		
		if(pageUrl.contains("username=")) {
			isLogedIn = true;
		}
		
		Assert.assertTrue(isLogedIn);
	}
}
	
	
	
