package testScript3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUploadAssignment extends Base {
	@Test
	public void uploadFile() {
		driver.navigate().to("https://demo.automationtesting.in/FileUpload.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement browse=driver.findElement(By.xpath("//input[@id='input-4']"));
		browse.sendKeys("D:\\challan.pdf");
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		js.executeScript("arguments[0].click();",submit);
		
		
	}
	@Test
	public void uploadFileRobotClass() throws AWTException {
		driver.navigate().to("https://demo.automationtesting.in/FileUpload.html");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement browseFile=driver.findElement(By.xpath("//input[@id='input-4']"));
		js.executeScript("arguments[0].click();",browseFile);
		StringSelection s = new StringSelection("D:\\challan.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		Robot r=new Robot();
		r.delay(250);
		r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);
	        r.keyPress(KeyEvent.VK_CONTROL);
	        r.keyPress(KeyEvent.VK_V);
	        r.keyRelease(KeyEvent.VK_V);
	        r.keyRelease(KeyEvent.VK_CONTROL);
	        r.delay(250);
	        r.keyPress(KeyEvent.VK_ENTER);
	        r.keyRelease(KeyEvent.VK_ENTER);
	}

}
