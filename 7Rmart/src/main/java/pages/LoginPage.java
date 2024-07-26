package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")private WebElement username;
	@FindBy(xpath="//input[@name='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement signin;
	@FindBy(xpath="//li[@class='breadcrumb-item active']")private WebElement dashboard;
	
	public void enterUserNameOnUserNameField(String userNameVal) {
        PageUtility.sendKeys(username, userNameVal);
	}
	public void enterPasswordOnPasswordField(String passwordVal) {
        PageUtility.sendKeys(password, passwordVal);
	}
	public void clickOnSignInButton() {
        PageUtility.click(signin);
	}
    public boolean isHomePageLoaded() {
	return dashboard.isDisplayed();
    }
}
