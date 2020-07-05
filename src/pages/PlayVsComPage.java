package pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PlayVsComPage extends AttributesClass{

	public PlayVsComPage(WebDriver driver, Properties selectors, Properties locators, WebDriverWait waiter) {
		super(driver, selectors, locators, waiter);		
	}
	
	public List<WebElement> playVsComLink() {
		return this.driver.findElements(By.xpath(selectors.getProperty("playVsCom")));
	}
	
	public List<WebElement> getStartBtn() {
		return this.driver.findElements(By.xpath(selectors.getProperty("startBtn")));
	}

}
