package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base {

	public void locatorsId() {
		//WebElement elementname=driver.findElement(By.Locator("locator value"));
		WebElement showmessage=driver.findElement(By.id("button-one"));
		WebElement entermessage=driver.findElement(By.id("single-input-field"));
		WebElement entervaluea=driver.findElement(By.id("value-a"));
		WebElement gettotal=driver.findElement(By.id("button-two"));
		WebElement entervalueb=driver.findElement(By.id("value-b"));

	}
	public void className() {
		WebElement navbartoggler=driver.findElement(By.className("navbar-toggler"));
		WebElement navbarnav=driver.findElement(By.className("navbar-nav"));
		WebElement clearFix=driver.findElement(By.className("clearfix"));

		
	}
	public void name() {
		WebElement author1=driver.findElement(By.name("author"));
		WebElement viewPort=driver.findElement(By.name("viewport"));
		WebElement keyWords=driver.findElement(By.name("keywords"));

		
	}
	public void linkText() {
		WebElement simpleformdemo=driver.findElement(By.linkText("Simple Form Demo"));
		WebElement checkboxdemo=driver.findElement(By.linkText("Checkbox Demo"));
		WebElement radiobuttonsdemo=driver.findElement(By.linkText("Radio Buttons Demo"));
		WebElement formsubmit=driver.findElement(By.linkText("Form Submit"));
		
	}
	public void partialLinkText() {
		
		WebElement simplefor=driver.findElement(By.partialLinkText("Simple Form"));
		WebElement checkbox=driver.findElement(By.partialLinkText("Checkbox"));
		WebElement radiobuttons=driver.findElement(By.partialLinkText("Radio Buttons"));
		WebElement form=driver.findElement(By.partialLinkText("Form"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locatorId=new Locators();
		locatorId.initializeBrowser();
		locatorId.locatorsId();
		locatorId.className();
		locatorId.name();
		locatorId.linkText();
		locatorId.partialLinkText();
		locatorId.driverQuitAndClose();

	}

}
