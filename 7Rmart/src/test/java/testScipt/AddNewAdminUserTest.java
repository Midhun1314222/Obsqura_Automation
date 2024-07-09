package testScipt;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AddNewAdminUserPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AddNewAdminUserTest extends Base {
	 @Test
	    public void verifyUserIsAbleToAddNewAdminUser() throws IOException {
		    String usernameVal = ExcelUtility.getStringData(1, 0, "Login");
	        String passwordVal = ExcelUtility.getStringData(1, 1, "Login");
	        
	        String newUserName = "midhunnand";
	        String newPassword = "midhunnand451";
	        String newUserType = "admin";

	        LoginPage loginPage = new LoginPage(driver);

	        // Perform login actions
	        loginPage.enterUserNameOnUserNameField(usernameVal);
	        loginPage.enterPasswordOnPasswordField(passwordVal);
	        loginPage.clickOnSignInButton();

	        AddNewAdminUserPage addNewAdminUserPage = new AddNewAdminUserPage(driver);

	        addNewAdminUserPage.clickOnAdminUsersBtn();
	        addNewAdminUserPage.clickOnAddNewBtn();
	        addNewAdminUserPage.enterUserName(newUserName);
	        addNewAdminUserPage.enterPassword(newPassword);
	        addNewAdminUserPage.selectUserType(newUserType);
	        addNewAdminUserPage.clickOnSaveBtn();

	        boolean isUserAddedSuccess = addNewAdminUserPage.isUserAddedSuccess();
	        assertTrue(isUserAddedSuccess, "New admin user was not added successfully");
	    }
}
