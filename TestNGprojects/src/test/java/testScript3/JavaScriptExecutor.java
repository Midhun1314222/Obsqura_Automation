package testScript3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavaScriptExecutor extends Base {
	@Test
	public void javaScriptExecutor() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement checkBox=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		js.executeScript("arguments[0].click();",checkBox);		
	}
	
}
