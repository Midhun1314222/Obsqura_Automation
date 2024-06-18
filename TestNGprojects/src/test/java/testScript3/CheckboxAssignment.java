package testScript3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CheckboxAssignment extends Base {
	@Test
	public void checkBox() {
		driver.navigate().to("https://total-qa.com/checkbox-example/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement clickCheckbox=driver.findElement(By.xpath("//*[@id=\"post-3261\"]/div/p/input[1]"));
		js.executeScript("arguments[0].click();",clickCheckbox);

	}
	@Test
	public void deselectCheckbox() {
		driver.navigate().to("https://total-qa.com/checkbox-example/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement clickCheckbox=driver.findElement(By.xpath("//*[@id=\"post-3261\"]/div/p/input[1]"));
		if (!clickCheckbox.isSelected()) {
	        js.executeScript("arguments[0].click();", clickCheckbox);
	        System.out.println("Checkbox was not selected");
	    } else {
	        System.out.println("Checkbox was selected");
	    }

	}

}
