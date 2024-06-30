package testScipt;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AddNewAdminUserPage;
import pages.LoginPage;

public class AddNewAdminUserTest extends Base {
	 @Test
	    public void verifyUserIsAbleToAddNewAdminUser() {
	        String usernameVal = "admin";
	        String passwordVal = "admin";
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
