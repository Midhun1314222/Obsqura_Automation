package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUserSearchPage {
	  WebDriver driver;

	    public AdminUserSearchPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")private WebElement adminUsersBtn;
	    @FindBy(xpath = "//a[@onclick='click_button(2)']")private WebElement searchBtn;
	    @FindBy(xpath = "//input[@id='un']")private WebElement userNameField;
	    @FindBy(xpath = "//select[@id='ut']")private WebElement userTypeDropdown;
	    @FindBy(xpath = "//button[@value='sr']")private WebElement findUserBtn;
	    @FindBy(xpath = "//div[contains(@class,'table-responsive')]")private WebElement searchResults;

	    public void clickOnAdminUsersBtn() {
	        PageUtility.click(adminUsersBtn);
	    }

	    public void clickOnSearchBtn() {
	        PageUtility.click(searchBtn);
	    }

	    public void enterUserName(String userName) {
	        PageUtility.clearAndSendKeys(userNameField, userName);
	    }

	    public void selectUserType(String userType) {
	        PageUtility.selectByValue(userTypeDropdown, userType);

	    }

	    public void clickOnFindUserBtn() {
	        PageUtility.click(findUserBtn);
	    }

	    public boolean isSearchResultsDisplayed() {
	        return searchResults.isDisplayed();
	    }
}
