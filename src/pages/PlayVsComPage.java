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
	
	public WebElement getState() {
		return this.driver.findElement(By.xpath(selectors.getProperty("state")));
	}
	
	public WebElement getCity() {
		return this.driver.findElement(By.xpath(selectors.getProperty("city")));
	}
	
	public WebElement getRiver() {
		return this.driver.findElement(By.xpath(selectors.getProperty("river")));
	}
	
	public WebElement getMountain() {
		return this.driver.findElement(By.xpath(selectors.getProperty("mountain")));
	}
	
	public WebElement getAnimal() {
		return this.driver.findElement(By.xpath(selectors.getProperty("animal")));
	}
	
	public WebElement getPlant() {
		return this.driver.findElement(By.xpath(selectors.getProperty("plant")));
	}
	
	public WebElement getThing() {
		return this.driver.findElement(By.xpath(selectors.getProperty("thing")));
	}
	
	public WebElement getLetter () {
		return this.driver.findElement(By.xpath(selectors.getProperty("letter")));
	}

}
