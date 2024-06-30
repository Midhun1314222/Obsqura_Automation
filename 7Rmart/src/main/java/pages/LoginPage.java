package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")private WebElement username;
	@FindBy(xpath="//input[@name='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement signin;
	@FindBy(xpath="//p[text='Dashboard']")private WebElement dashboard;
	
	public void enterUserNameOnUserNameField(String userNameVal) {
		username.sendKeys(userNameVal);
	}
	public void enterPasswordOnPasswordField(String passwordVal) {
		password.sendKeys(passwordVal);
	}
	public void clickOnSignInButton() {
		signin.click();
	}
    public boolean isHomePageLoaded() {
	return dashboard.isDisplayed();
    }
}
