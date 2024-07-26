package testScipt;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import constants.Messages;
import pages.AddNewAdminUserPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class AddNewAdminUserTest extends Base {
	 @Test
	    public void verifyUserIsAbleToAddNewAdminUser(){
		    String usernameVal = ExcelUtility.getStringData(1, 0, Constants.LOGINPAGE);
	        String passwordVal = ExcelUtility.getStringData(1, 1, Constants.LOGINPAGE);
	        
	        //String newUserName = "midhunnand";
	        //String newPassword = "midhunnand451";
	        String firstname=RandomDataUtility.getFirstName();
	        String lastname=RandomDataUtility.getLastName();
	        String newUserName=firstname;
	        String newPassword=firstname+"."+lastname;
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
	        assertTrue(isUserAddedSuccess, Messages.USER_IS_NOT_CREATED);
	    }
}
