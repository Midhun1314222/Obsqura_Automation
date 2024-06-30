package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	        adminUsersBtn.click();
	    }

	    public void clickOnSearchBtn() {
	        searchBtn.click();
	    }

	    public void enterUserName(String userName) {
	        userNameField.sendKeys(userName);
	    }

	    public void selectUserType(String userType) {
	        Select select = new Select(userTypeDropdown);
	        select.selectByValue(userType);
	    }

	    public void clickOnFindUserBtn() {
	        findUserBtn.click();
	    }

	    public boolean isSearchResultsDisplayed() {
	        return searchResults.isDisplayed();
	    }
}
