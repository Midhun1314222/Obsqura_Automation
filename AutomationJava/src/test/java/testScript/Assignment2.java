package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment2 extends Base{
	public void actions() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessage= driver.findElement(By.xpath("//input[@type='text']"));
		showMessage.sendKeys("Hii");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 assignment2=new Assignment2();
		assignment2.initializeBrowser();
		assignment2.actions();

	}

}
