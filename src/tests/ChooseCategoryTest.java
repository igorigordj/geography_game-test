package tests;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import pages.ChooseCategoryPage;
import pages.LogInPage;

public class ChooseCategoryTest extends TestTemplateClass{
	
	@Test
	public void chooseCategoryTest() {
		this.driver.navigate().to(this.locators.getProperty("url"));
		Alert alert = this.driver.switchTo().alert();
		alert.accept();
		
		LogInPage logInPage = new LogInPage(driver, selectors, locators, waiter);
		
		logInPage.getUserField().click();
		logInPage.enterUser();
		
		ChooseCategoryPage ccpage = new ChooseCategoryPage(driver, selectors, locators, waiter);
		
		
		ccpage.chooseCategory();
		ccpage.enterTerm();
	}
	

}
