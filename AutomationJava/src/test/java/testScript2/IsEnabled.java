package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript.Base;

public class IsEnabled extends Base{
	public void isEnabled() {
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radioButton1= driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		if(radioButton1.isEnabled()) {
			System.out.println("is enabled");
		}else {
			System.out.println("not enabled");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsEnabled isenabled=new IsEnabled();
		isenabled.initializeBrowser();
		isenabled.isEnabled();

	}

}
