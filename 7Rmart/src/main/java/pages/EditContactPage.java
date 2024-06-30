package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div[1]/text()")private WebElement editContactSuccess;

	    public void clickOnMoreInfoButton() {
	        moreInfoBtn.click();
	    }

	    public void clickOnActionButton() {
	        actionBtn.click();
	    }

	    public void enterPhoneNumber(String phoneNumber) {
	        editPhone.clear();
	        editPhone.sendKeys(phoneNumber);
	    }

	    public void enterEmail(String email) {
	        editEmail.clear();
	        editEmail.sendKeys(email);
	    }
	    
	    public void enterAddress(String editAddress) {
	        editEmail.clear();
	        editEmail.sendKeys(editAddress);
	    }
	    
	    public void enterDeliveryTime(String editDeliveryTime) {
	        editEmail.clear();
	        editEmail.sendKeys(editDeliveryTime);
	    }

	    public void enterDeliveryLimit(String deliveryLimit) {
	        editLimit.clear();
	        editLimit.sendKeys(deliveryLimit);
	    }

	    public void clickOnSubmitButton() {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitButton);
	    }

	    public boolean isContactEdited() {
	        return editContactSuccess.isDisplayed();
	    }
}
