package testScipt;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AdminUserSearchPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserSearchTest extends Base{
	@Test
    public void verifyAdminUserSearch(){
		String usernameVal = ExcelUtility.getStringData(1, 0, Constants.LOGINPAGE);
	    String passwordVal = ExcelUtility.getStringData(1, 1, Constants.LOGINPAGE);
	    
        String searchUserName = "MIDHUN";
        String searchUserType = "staff";

        LoginPage loginPage = new LoginPage(driver);

        loginPage.enterUserNameOnUserNameField(usernameVal);
        loginPage.enterPasswordOnPasswordField(passwordVal);
        loginPage.clickOnSignInButton();

        AdminUserSearchPage adminUserSearchPage = new AdminUserSearchPage(driver);

        adminUserSearchPage.clickOnAdminUsersBtn();
        adminUserSearchPage.clickOnSearchBtn();
        adminUserSearchPage.enterUserName(searchUserName);
        adminUserSearchPage.selectUserType(searchUserType);
        adminUserSearchPage.clickOnFindUserBtn();

        boolean isSearchResultsDisplayed = adminUserSearchPage.isSearchResultsDisplayed();
        assertTrue(isSearchResultsDisplayed, "Admin user search results not displayed");
    }
}
