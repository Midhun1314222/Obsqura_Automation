package testScipt;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManagePage;

public class AddNewPageTest extends Base {
	 @Test
	    public void verifyUserIsAbleToCreateNewPage() {
	        String usernameVal = "admin";
	        String passwordVal = "admin";
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.enterUserNameOnUserNameField(usernameVal);
	        loginPage.enterPasswordOnPasswordField(passwordVal);
	        loginPage.clickOnSignInButton();

	        ManagePage managePage = new ManagePage(driver);
	        managePage.clickOnManagePageBtn();
	        managePage.clickOnCreateNewBtn();
	        managePage.enterTitle("Cars");
	        //managePage.enterDescription("uygweudgud");
	        managePage.enterPage("caarsss");
	        managePage.clickOnSubmitBtn();
	        
	        boolean isManagePageAvailable = managePage.isManagePageLoaded();
	        assertTrue(isManagePageAvailable, "Manage page not loaded when user clicks on Manage Page button");

	    }
}
