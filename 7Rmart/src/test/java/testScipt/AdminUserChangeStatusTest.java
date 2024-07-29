package testScipt;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseConfiguration.Base;
import constants.Constants;
import constants.Messages;
import pages.AdminUserChangeStatusPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserChangeStatusTest extends Base {
	  @Test
	    public void verifyAdminUserStatusChange(){
		    String usernameVal = ExcelUtility.getStringData(1, 0, Constants.LOGINPAGE);
	        String passwordVal = ExcelUtility.getStringData(1, 1, Constants.LOGINPAGE);

	        LoginPage loginPage = new LoginPage(driver);

	        // Perform login actions
	        loginPage.enterUserNameOnUserNameField(usernameVal);
	        loginPage.enterPasswordOnPasswordField(passwordVal);
	        loginPage.clickOnSignInButton();

	        AdminUserChangeStatusPage adminUserChangeStatusPage = new AdminUserChangeStatusPage(driver);

	        adminUserChangeStatusPage.clickOnAdminUsersBtn();
	        adminUserChangeStatusPage.clickOnActionBtn();

	        boolean isStatusChangedSuccess = adminUserChangeStatusPage.isStatusChangedSuccess();
			Assert.assertTrue(isStatusChangedSuccess, Messages.SUCCESS_ALERT_NOT_FOUND);
	    }
}
