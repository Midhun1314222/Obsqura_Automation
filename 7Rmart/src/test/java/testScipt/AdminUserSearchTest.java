package testScipt;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AdminUserSearchPage;
import pages.LoginPage;

public class AdminUserSearchTest extends Base{
	@Test
    public void verifyAdminUserSearch() {
        String usernameVal = "admin";
        String passwordVal = "admin";
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
