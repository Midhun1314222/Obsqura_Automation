package testScipt;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;
	@BeforeMethod
	public void initializeBrowser() {
		driver=new ChromeDriver();//loading the driver
		//driver.get("https://www.amazon.in/");//launch the URL
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");//launch the URL
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void driverQuitAndClose() {
		//driver.close();
		
	}

}
