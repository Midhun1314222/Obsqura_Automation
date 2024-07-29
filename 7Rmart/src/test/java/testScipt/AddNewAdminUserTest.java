package testScipt;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseConfiguration.Base;
import constants.Constants;
import constants.Messages;
import pages.AddNewAdminUserPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class AddNewAdminUserTest extends Base {
	    @Test(groups={"smoke","regression"})
	    public void verifyUserIsAbleToAddNewAdminUser(){
		    String usernameVal = ExcelUtility.getStringData(1, 0, Constants.LOGINPAGE);
	        String passwordVal = ExcelUtility.getStringData(1, 1, Constants.LOGINPAGE);
	        	      
	        LoginPage loginPage = new LoginPage(driver);

	        // Perform login actions
	        loginPage.enterUserNameOnUserNameField(usernameVal);
	        loginPage.enterPasswordOnPasswordField(passwordVal);
	        loginPage.clickOnSignInButton();

	        AddNewAdminUserPage addNewAdminUserPage = new AddNewAdminUserPage(driver);
	        addNewAdminUserPage.clickOnAdminUsersBtn();
	        
	        addNewAdminUserPage.clickOnAddNewBtn();
			boolean is_adminuser_informations_header_availabe=addNewAdminUserPage.isAdminUserInformationsHeaderDisplayed();			
			
	        String firstname=RandomDataUtility.getFirstName();
	        String lastname=RandomDataUtility.getLastName();
	        String newUserName=firstname;
	        String newPassword=firstname+"."+lastname;
	        String newUserType = ExcelUtility.getStringData(1, 2,Constants.ADD_ADMIN_USER_DATA);


	        addNewAdminUserPage.enterUserName(newUserName);
	        addNewAdminUserPage.enterPassword(newPassword);
	        addNewAdminUserPage.selectUserType(newUserType);

	        addNewAdminUserPage.clickOnSaveBtn();
	        boolean isUserAddedSuccess = addNewAdminUserPage.isUserAddedSuccess();
	        
			Assert.assertTrue(is_adminuser_informations_header_availabe,Messages.ADMINUSER_INFORMATION_HEADER_NOT_FOUND);
			Assert.assertTrue(isUserAddedSuccess, Messages.USER_IS_NOT_CREATED);
	    }
}
