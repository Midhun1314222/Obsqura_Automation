package testScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	public void initializeBrowser() {
		driver=new ChromeDriver();//loading the driver
		//driver.get("https://www.amazon.in/");//launch the URL
		driver.get("https://selenium.qabible.in/");//launch the URL
		driver.manage().window().maximize();
	}
	public void driverQuitAndClose() {
		driver.close();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base=new Base();
		base.initializeBrowser();
		//base.driverQuitAndClose();

	}

}
