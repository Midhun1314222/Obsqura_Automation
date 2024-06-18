package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class InteractionScript extends Base {
	public void performActions() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	
	       WebElement messageTextbox = driver.findElement(By.cssSelector("input.form-control[placeholder='Message']"));
	        //messageTextbox.click();
	        messageTextbox.sendKeys("Hello");
	        
	        WebElement showMessageButton = driver.findElement(By.cssSelector("button[id='button-one']"));
	        showMessageButton.click();
	        
	}
	
	 public void totalValue() {
	        WebElement valueA= driver.findElement(By.xpath("//input[@id='value-a']"));
	        valueA.sendKeys("10");
	        WebElement valueB=driver.findElement(By.xpath("//input[@id='value-b']"));
	        valueB.sendKeys("20");
	        WebElement buttonClick=driver.findElement(By.xpath("//button[@id='button-two']"));
	        buttonClick.click();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InteractionScript interactionScript = new InteractionScript();
		interactionScript.initializeBrowser();
		interactionScript.performActions();
		interactionScript.totalValue();

		//interactionScript.driverQuitAndClose();

	}

}
