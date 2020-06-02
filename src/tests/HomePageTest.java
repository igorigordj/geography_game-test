package tests;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTest extends TestTemplateClass{
	
	@Test
	public void homePageUrlTest() {
		this.driver.navigate().to(this.locators.getProperty("url"));
		String pageUrl = this.driver.findElement(By.xpath(this.selectors.getProperty("url"))).getText();
		
		verifyURLStatus("pageUrl");
		
		Assert.assertTrue(pageUrl.contains("bootcamp-osnazivanje"));
	}
	
	@Test
	public void homePageTest() {

		this.driver.navigate().to(this.locators.getProperty("url"));
		
		HomePage homePage = new HomePage(driver, selectors, locators, waiter);
		
		homePage.enterUser();
		homePage.chooseCategory();
		homePage.enterTerm();
	}
	
	//verifying url status of a page
		public static int verifyURLStatus(String urlString) {
			int status = 404;
			try {                         
				URL link = new URL(urlString);
				HttpURLConnection hConn = null;
				hConn = (HttpURLConnection) link.openConnection();
				hConn.setRequestMethod("GET");
				hConn.connect();
				status = hConn.getResponseCode();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return status;
		}

}
