package testScipt;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import constants.Constants;

public class Base {
    public WebDriver driver;
    public Properties prop;
    public FileInputStream file;

    @BeforeMethod(alwaysRun=true)
    @Parameters("browser")
    public void initializeBrowser(@Optional("chrome") String browser) throws Exception {
    	prop=new Properties();
    	file=new FileInputStream(Constants.CONFIGFILE);
    	prop.load(file);
    	
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) { 
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else {
            throw new Exception("Browser is not correct");
        }
        driver.get(prop.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.get("https://groceryapp.uniqassosiates.com/admin/login"); // Launch the URL
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void driverQuitAndClose(ITestResult result) throws IOException {
        if(result.getStatus() == ITestResult.FAILURE) {
            takesScreenshot(result);
        }
        driver.close();
    }

    public void takesScreenshot(ITestResult result) throws IOException {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("./Screenshot/" + result.getName() + ".png"));
    }
}