package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.PageUtility;
import utilities.WebElementsUtility;

public class AddNewAdminUserPage {
	  WebDriver driver;

	    public AddNewAdminUserPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")private WebElement adminUsersBtn;
		@FindBy(xpath="//h3[text()='Admin Users Informations']")private WebElement adminUserInformationsHeader ;
	    @FindBy(xpath = "//a[@onclick='click_button(1)']")private WebElement addNewBtn;
	    @FindBy(xpath = "//input[@id='username']")private WebElement userNameField;
	    @FindBy(xpath = "//input[@id='password']")private WebElement passwordField;
	    @FindBy(xpath = "//select[@id='user_type']")private WebElement userTypeDropdown;
	    @FindBy(xpath = "//button[@name='Create']")private WebElement saveBtn;
	    @FindBy(xpath = "//div[contains(@class,'alert-success')]")private WebElement addUserSuccess;

	    public void clickOnAdminUsersBtn() {
	        PageUtility.click(adminUsersBtn);
	    }
	    
	    public boolean isAdminUserInformationsHeaderDisplayed()
		{
			boolean isAdminUserInformationsHeaderAvailabe=WebElementsUtility.isElementDisplayed(adminUserInformationsHeader);
			return isAdminUserInformationsHeaderAvailabe;
		}

	    public void clickOnAddNewBtn() {
	        PageUtility.click(addNewBtn);
	    }

	    public void enterUserName(String userName) {
	        PageUtility.sendKeys(userNameField, userName);
	    }

	    public void enterPassword(String password) {
	        PageUtility.sendKeys(passwordField, password);
	    }

	    public void selectUserType(String userType) {
	        PageUtility.selectByValue(userTypeDropdown, userType);
	    }

	    public void clickOnSaveBtn() {
	        PageUtility.clickElementByJS(saveBtn);
	    }

	    public boolean isUserAddedSuccess() {
	    	boolean isAddNewAdminUserSuccessAlertDisplayed=WebElementsUtility.isElementDisplayed(addUserSuccess);
	    	return isAddNewAdminUserSuccessAlertDisplayed;	
	    }
}
