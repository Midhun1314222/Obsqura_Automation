package testScipt;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constants.Constants;
import constants.Messages;
import pages.EditContactPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class EditContactTest extends Base {
	@Test(groups={"smoke","regression"})
	public void verifyUserIsAbleToEditContact(){
		    String usernameVal = ExcelUtility.getStringData(1, 0, "Login");
	        String passwordVal = ExcelUtility.getStringData(1, 1, "Login");
	       
	        LoginPage loginPage = new LoginPage(driver);

	        loginPage.enterUserNameOnUserNameField(usernameVal);
	        loginPage.enterPasswordOnPasswordField(passwordVal);
	        loginPage.clickOnSignInButton();

	        EditContactPage editContactPage = new EditContactPage(driver);

	        editContactPage.clickOnMoreInfoButton();
			boolean is_contact_us_header_available=editContactPage.isContactUsHeaderDisplayed();
			
	        editContactPage.clickOnActionButton();
			boolean is_header_contact_us_informations_loaded=editContactPage.isContactUsInformationTextDisplayed();
	        
			 
	        String newPhoneNumber = ExcelUtility.getIntegerData(1, 0,Constants.EDIT_CONTACT_TEST_DATA);
	        String newEmail = ExcelUtility.getStringData(1, 1,Constants.EDIT_CONTACT_TEST_DATA);
	        String newAddress= ExcelUtility.getStringData(1, 2,Constants.EDIT_CONTACT_TEST_DATA);
	        String newDeliveryTime= ExcelUtility.getIntegerData(1, 3,Constants.EDIT_CONTACT_TEST_DATA);
	        String newDeliveryLimit = ExcelUtility.getIntegerData(1, 4,Constants.EDIT_CONTACT_TEST_DATA);
			
	        editContactPage.enterPhoneNumber(newPhoneNumber);
	        editContactPage.enterEmail(newEmail);
	        editContactPage.enterAddress(newAddress);
	        editContactPage.enterDeliveryTime(newDeliveryTime);
	        editContactPage.enterDeliveryLimit(newDeliveryLimit);
	        
	        editContactPage.clickOnSubmitButton();
	        boolean isContactEditedSuccess = editContactPage.isContactEdited();
	        
			Assert.assertTrue(is_contact_us_header_available,Messages.CONTACT_US_HEADER_NOT_FOUND);
			Assert.assertTrue(is_header_contact_us_informations_loaded,Messages.CONTACT_US_INFORMATIONS_TEXT_NOT_FOUND);
			Assert.assertTrue(isContactEditedSuccess, Messages.SUCCESS_ALERT_NOT_FOUND);
	    }
}
