package testScipt;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.LoginPage;
import pages.ManagePage;
import utilities.ExcelUtility;

public class AddNewPageTest extends Base {
	 @Test
	    public void verifyUserIsAbleToCreateNewPage(){
		    String usernameVal = ExcelUtility.getStringData(1, 0, Constants.LOGINPAGE);
	        String passwordVal = ExcelUtility.getStringData(1, 1, Constants.LOGINPAGE);
	        
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.enterUserNameOnUserNameField(usernameVal);
	        loginPage.enterPasswordOnPasswordField(passwordVal);
	        loginPage.clickOnSignInButton();

	        ManagePage managePage = new ManagePage(driver);
	        managePage.clickOnManagePageBtn();
	        managePage.clickOnCreateNewBtn();
	        managePage.enterTitle("Cars");
	        managePage.enterDescription("uygweudgud");
	        managePage.enterPage("caarsss");
	        managePage.clickOnSubmitBtn();
	        
	        boolean isManagePageAvailable = managePage.isManagePageLoaded();
	        assertTrue(isManagePageAvailable, "New page was ot created successfully");

	    }
}
