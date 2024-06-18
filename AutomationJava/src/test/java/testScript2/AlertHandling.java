package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript.Base;

public class AlertHandling extends Base {
	public void alertHandling() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alertBox= driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		alertBox.click();
		String alerttext=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();	
		System.out.println(alerttext);
	}
	public void confirmationAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alertBox1= driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		alertBox1.click();
		String alerttext1=driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();	
		System.out.println(alerttext1);
	
	}
	public void promptAlert() {
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		WebElement alertBox2= driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		alertBox2.click();
		 driver.switchTo().alert().sendKeys("Hallo");
		 driver.switchTo().alert().accept();	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alerthandling = new AlertHandling();
		alerthandling.initializeBrowser();
		//alerthandling.alertHandling();
		//alerthandling.confirmationAlert();
		alerthandling.promptAlert();

	}

}
