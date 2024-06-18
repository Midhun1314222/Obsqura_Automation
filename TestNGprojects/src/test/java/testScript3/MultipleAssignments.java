package testScript3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleAssignments extends Base {
	@Test
	public void textBox() {
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		WebElement textbox=driver.findElement(By.xpath("//input[@type='text']"));
		textbox.sendKeys("Hello");
	}
	@Test
	public void clickButton() {
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement button=driver.findElement(By.xpath("//button[@id='idOfButton']"));
        js.executeScript("arguments[0].click();", button);

	}
	@Test
	public void doubleClickAlert() {
		 driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
	        WebElement doubleClkButton = driver.findElement(By.xpath("//button[@id='dblClkBtn']"));
	        Actions actions = new Actions(driver);
	        actions.doubleClick(doubleClkButton).perform();
	        driver.switchTo().alert().accept();	
	        }
	@Test
	public void radioButton() {
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		WebElement radioBtn=driver.findElement(By.xpath("//input[@id='input']"));
		if(radioBtn.isEnabled()) {
			System.out.println("is enabled");
		}else {
			System.out.println("not enabled");
		}

	}
	@Test
	public void handlingDropdowns() {
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		WebElement fields=driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		Select select =new Select(fields);
		//select.selectByVisibleText("Automation Testing");
		//select.selectByIndex(3);
		select.selectByValue("Performance");
	}
	@Test
	public void alertConfirm() {
		driver.navigate().to("https://artoftesting.com/samplesiteforselenium");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement alertBox1= driver.findElement(By.xpath("//button[@onclick='generateConfirmBox()']"));
        js.executeScript("arguments[0].click();", alertBox1);
		driver.switchTo().alert().dismiss();		
	}
}
