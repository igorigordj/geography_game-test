package pages;

import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage extends AttributesClass{

	public LogInPage(WebDriver driver, Properties selectors, Properties locators, WebDriverWait waiter) {
		super(driver, selectors, locators, waiter);
	}
	
	public WebElement getUserField() {
		return this.driver.findElement(By.xpath(selectors.getProperty("enterUserField")));
	}
		
	public void enterUser() {
		this.getUserField().sendKeys("igi");
		this.getUserField().sendKeys(Keys.ENTER);
	}
	
}
