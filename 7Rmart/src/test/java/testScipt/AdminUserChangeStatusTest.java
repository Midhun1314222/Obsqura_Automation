package testScipt;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AdminUserChangeStatusPage;
import pages.LoginPage;

public class AdminUserChangeStatusTest extends Base {
	  @Test
	    public void verifyAdminUserStatusChange() {
	        String usernameVal = "admin";
	        String passwordVal = "admin";

	        LoginPage loginPage = new LoginPage(driver);

	        // Perform login actions
	        loginPage.enterUserNameOnUserNameField(usernameVal);
	        loginPage.enterPasswordOnPasswordField(passwordVal);
	        loginPage.clickOnSignInButton();

	        AdminUserChangeStatusPage adminUserChangeStatusPage = new AdminUserChangeStatusPage(driver);

	        adminUserChangeStatusPage.clickOnAdminUsersBtn();
	        adminUserChangeStatusPage.clickOnActionBtn();

	        boolean isStatusChangedSuccess = adminUserChangeStatusPage.isStatusChangedSuccess();
	        assertTrue(isStatusChangedSuccess, "Admin user status was not changed successfully");
	    }
}
