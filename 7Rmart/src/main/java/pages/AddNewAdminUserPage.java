package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddNewAdminUserPage {
	  WebDriver driver;

	    public AddNewAdminUserPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")
	    private WebElement adminUsersBtn;

	    @FindBy(xpath = "//a[@onclick='click_button(1)']")
	    private WebElement addNewBtn;

	    @FindBy(xpath = "//input[@id='username']")
	    private WebElement userNameField;

	    @FindBy(xpath = "//input[@id='password']")
	    private WebElement passwordField;

	    @FindBy(xpath = "//select[@id='user_type']")
	    private WebElement userTypeDropdown;

	    @FindBy(xpath = "//button[@name='Create']")
	    private WebElement saveBtn;

	    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div[2]/div/div[1]")
	    private WebElement addUserSuccess;

	    public void clickOnAdminUsersBtn() {
	        adminUsersBtn.click();
	    }

	    public void clickOnAddNewBtn() {
	        addNewBtn.click();
	    }

	    public void enterUserName(String userName) {
	        userNameField.sendKeys(userName);
	    }

	    public void enterPassword(String password) {
	        passwordField.sendKeys(password);
	    }

	    public void selectUserType(String userType) {
	        Select select = new Select(userTypeDropdown);
	        select.selectByValue(userType);
	    }

	    public void clickOnSaveBtn() {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", saveBtn);
	    }

	    public boolean isUserAddedSuccess() {
	        return addUserSuccess.isDisplayed();
	    }
}
