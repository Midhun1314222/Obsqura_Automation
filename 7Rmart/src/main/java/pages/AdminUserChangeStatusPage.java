package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WebElementsUtility;

public class AdminUserChangeStatusPage {
	 WebDriver driver;
	 WebElementsUtility webelementsutility=new WebElementsUtility();


	    public AdminUserChangeStatusPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")private WebElement adminUsersBtn;
	    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div[2]/div/div[3]/div[2]/table/tbody/tr[1]/td[5]/a[1]")private WebElement actionBtn;
	    @FindBy(xpath = "//div[contains(@class,'alert-success')]")private WebElement changeStatusSuccess;

	    public void clickOnAdminUsersBtn() {
	        PageUtility.click(adminUsersBtn);
	    }

	    public void clickOnActionBtn() {
	        PageUtility.clickElementByJS(driver, actionBtn);
	    }

	    public boolean isStatusChangedSuccess() {
	    	boolean isAdminUserChangeStatusSuccesssAlertDisplayed=webelementsutility.isElementDisplayed(changeStatusSuccess);
	    	return isAdminUserChangeStatusSuccesssAlertDisplayed;		    }
}
