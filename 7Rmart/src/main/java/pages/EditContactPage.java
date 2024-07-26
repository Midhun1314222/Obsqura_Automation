package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class EditContactPage {
	  WebDriver driver;

	    public EditContactPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']")private WebElement moreInfoBtn;
	    @FindBy(xpath = "//a[@role='button']")private WebElement actionBtn;
	    @FindBy(xpath = "//input[@id='phone']")private WebElement editPhone;
	    @FindBy(xpath = "//input[@id='email']")private WebElement editEmail;
	    @FindBy(xpath = "//textarea[@name='address']")private WebElement editAddress;
	    @FindBy(xpath = "//textarea[@name='del_time']")private WebElement editDeliveryTime;
	    @FindBy(xpath = "//input[@id='del_limit']")private WebElement editLimit;
	    @FindBy(xpath = "//button[@name='Update']")private WebElement submitButton;
	    @FindBy(xpath = "//div[contains(@class,'alert-success')]")private WebElement editContactSuccess;

	    public void clickOnMoreInfoButton() {
	        PageUtility.click(moreInfoBtn);
	    }

	    public void clickOnActionButton() {
	        PageUtility.click(actionBtn);
	    }

	    public void enterPhoneNumber(String phoneNumber) {
	        PageUtility.clearAndSendKeys(editPhone, phoneNumber);

	    }

	    public void enterEmail(String email) {
	        PageUtility.clearAndSendKeys(editEmail, email);

	    }
	    
	    public void enterAddress(String address) {
	        PageUtility.clearAndSendKeys(editAddress, address);

	    }
	    
	    public void enterDeliveryTime(String deliveryTime) {
	        PageUtility.clearAndSendKeys(editDeliveryTime, deliveryTime);

	    }

	    public void enterDeliveryLimit(String deliveryLimit) {
	        PageUtility.clearAndSendKeys(editLimit, deliveryLimit);

	    }

	    public void clickOnSubmitButton() {
	        PageUtility.clickElementByJS(driver, submitButton);
	    }

	    public boolean isContactEdited() {
	        return editContactSuccess.isDisplayed();
	    }
}
