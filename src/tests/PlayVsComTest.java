package tests;

import org.testng.annotations.Test;

import pages.PlayVsComPage;

public class PlayVsComTest extends TestTemplateClass{

	@Test
	public void playVsComTest() {
		
		this.driver.navigate().to(this.locators.getProperty("url"));
		
		PlayVsComPage pvc = new PlayVsComPage(driver, selectors, locators, waiter);
		
		pvc.playVsComLink().click();
		pvc.getStartBtn().click();
	}
}
