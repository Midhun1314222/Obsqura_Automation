package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript.Base;

public class Assignment1 extends Base {
	public void radioButton() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radioBtn= driver.findElement(By.xpath("//input[@id='inlineRadio11']"));
		radioBtn.click();
		if(radioBtn.isSelected()) {
			System.out.println("Male is Selected");			
		}else {
			WebElement radioBtn1= driver.findElement(By.xpath("//input[@id='inlineRadio21']"));
			radioBtn1.click();
			System.out.println("Female is selected");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 radiobutton= new Assignment1();
		radiobutton.initializeBrowser();
		radiobutton.radioButton();

	}

}
