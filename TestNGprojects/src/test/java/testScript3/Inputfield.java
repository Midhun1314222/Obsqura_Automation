package testScript3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Inputfield extends Base {
	@Test
	public void messageShow() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       WebElement messageTextbox = driver.findElement(By.cssSelector("input.form-control[placeholder='Message']"));
	        messageTextbox.sendKeys("Hello");
	        WebElement showMessageButton = driver.findElement(By.cssSelector("button[id='button-one']"));
			js.executeScript("arguments[0].click();",showMessageButton);
	}
	@Test
	public void valueTotal() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 WebElement valueA= driver.findElement(By.xpath("//input[@id='value-a']"));
	        valueA.sendKeys("10");
	        WebElement valueB=driver.findElement(By.xpath("//input[@id='value-b']"));
	        valueB.sendKeys("20");
	        WebElement buttonClick=driver.findElement(By.xpath("//button[@id='button-two']"));
			js.executeScript("arguments[0].click();",buttonClick);
	}
	@Test
	public void javascriptSampel() {
		driver.navigate().to("https://www.amazon.in/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,150)","");
		//js.executeScript("window.scrollBy(0,-100)", "");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
	}


}
