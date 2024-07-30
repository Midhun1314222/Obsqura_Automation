package utilities;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtility {
	public static final long EXPLICIT_WAIT = 10;
	public static final long IMPLICIT_WAIT=10;
    public static final long FLUENT_WAIT_TIMEOUT = 15;
    public static final long FLUENT_WAIT_POLLING = 2;
	    
	public static void waitForElement(WebDriver driver, WebElement target) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		wait.until(ExpectedConditions.visibilityOf(target));
	}
	
	public static void waitForElementToBeClickable(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
	    wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static void waitForAlertToBeVisible(WebDriver driver) {
			    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
			    wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static void waitForElementToBeSelected(WebDriver driver,WebElement element) {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
		 wait.until(ExpectedConditions.elementToBeSelected(element));
	}
	
	public static void fluentWaitForElement(WebDriver driver, WebElement target) {
	    FluentWait<WebDriver> wait = new FluentWait<>(driver)
	            .withTimeout(Duration.ofSeconds(FLUENT_WAIT_TIMEOUT))
	            .pollingEvery(Duration.ofSeconds(FLUENT_WAIT_POLLING))
	            .ignoring(Exception.class);
	
	    wait.until(new Function<WebDriver, Boolean>() {
	        public Boolean apply(WebDriver driver) {
	            return target.isDisplayed();
	        }
	    });
	}
	
	public static void fluentWaitForElementToBeSelected(WebDriver driver, WebElement element) {
	    FluentWait<WebDriver> wait = new FluentWait<>(driver)
	            .withTimeout(Duration.ofSeconds(FLUENT_WAIT_TIMEOUT))
	            .pollingEvery(Duration.ofSeconds(FLUENT_WAIT_POLLING))
	            .ignoring(Exception.class);
	
	    wait.until(new Function<WebDriver, Boolean>() {
	        public Boolean apply(WebDriver driver) {
	            return element.isSelected();
	        }
	    });
	}
	
	}
