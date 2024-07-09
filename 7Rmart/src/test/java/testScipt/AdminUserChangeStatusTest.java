package testScipt;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AdminUserChangeStatusPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserChangeStatusTest extends Base {
	  @Test
	    public void verifyAdminUserStatusChange() throws IOException {
		    String usernameVal = ExcelUtility.getStringData(1, 0, "Login");
	        String passwordVal = ExcelUtility.getStringData(1, 1, "Login");

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
