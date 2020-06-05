package pages;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChooseCategoryPage extends AttributesClass{

	public ChooseCategoryPage(WebDriver driver, Properties selectors, Properties locators, WebDriverWait waiter) {
		super(driver, selectors, locators, waiter);
	
	}
	
	public List<WebElement> getCategoryField() {
		return this.driver.findElements(By.xpath(selectors.getProperty("chooseCategoryField")));
	}
	
	public void chooseCategory() {
		for(int i=0; i< getCategoryField().size(); i++) {
			WebElement category = this. getCategoryField().get(i);
			category.click();
		}
	}
	
	public WebElement getEnterTermField() {
		return this.driver.findElement(By.xpath(selectors.getProperty("enterTerm")));
	}
	
	public void enterTerm() {
		this.getEnterTermField().sendKeys("Astana");
	}

}
