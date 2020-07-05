package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlayVsComPage extends AttributesClass{

	public PlayVsComPage(WebDriver driver, Properties selectors, Properties locators, WebDriverWait waiter) {
		super(driver, selectors, locators, waiter);		
	}
	
	public WebElement playVsComLink() {
		return this.driver.findElement(By.xpath(selectors.getProperty("playVsCom")));
	}
	
	public WebElement getStartBtn() {
		return this.driver.findElement(By.xpath(selectors.getProperty("startBtn")));
	}

}
