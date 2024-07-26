package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public static void selectByValue(WebElement element,String value) {
		Select select =new Select(element);
		select.selectByValue(value);
		
	}
	 public static void sendKeys(WebElement element, String value) {
	        element.sendKeys(value);
	    }
	
	 public static void clickElementByJS(WebDriver driver, WebElement element) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", element);
	    }
	 public static void click(WebElement element) {
	        element.click();
	    }
	 public static void acceptAlert(WebDriver driver) {
	        driver.switchTo().alert().accept();
	    }
	 public static void clearAndSendKeys(WebElement element, String value) {
	        element.clear();
	        element.sendKeys(value);
	    }
}
