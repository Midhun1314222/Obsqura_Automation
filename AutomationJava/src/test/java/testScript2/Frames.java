package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript.Base;

public class Frames extends Base {
	public void frameHandling() {
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		WebElement frames=driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		driver.switchTo().frame(frames);
		WebElement image=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		image.click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frames framehandling=new Frames();
		framehandling.initializeBrowser();
		framehandling.frameHandling();

	}

}
