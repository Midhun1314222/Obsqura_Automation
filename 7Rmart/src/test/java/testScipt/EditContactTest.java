package testScipt;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.EditContactPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class EditContactTest extends Base {
	 @Test
	    public void verifyUserIsAbleToEditContact(){
		    String usernameVal = ExcelUtility.getStringData(1, 0, "Login");
	        String passwordVal = ExcelUtility.getStringData(1, 1, "Login");
	        
	        String newPhoneNumber = "6876872173";
	        String newEmail = "midhunnand13@gmail.com";
	        String newAddress="Kottayam";
	        String newDeliveryTime="12";
	        String newDeliveryLimit = "3";

	        LoginPage loginPage = new LoginPage(driver);

	        loginPage.enterUserNameOnUserNameField(usernameVal);
	        loginPage.enterPasswordOnPasswordField(passwordVal);
	        loginPage.clickOnSignInButton();

	        EditContactPage editContactPage = new EditContactPage(driver);

	        editContactPage.clickOnMoreInfoButton();
	        editContactPage.clickOnActionButton();
	        editContactPage.enterPhoneNumber(newPhoneNumber);
	        editContactPage.enterEmail(newEmail);
	        editContactPage.enterAddress(newAddress);
	        editContactPage.enterDeliveryTime(newDeliveryTime);
	        editContactPage.enterDeliveryLimit(newDeliveryLimit);
	        editContactPage.clickOnSubmitButton();

	        boolean isContactEditedSuccess = editContactPage.isContactEdited();
	        assertTrue(isContactEditedSuccess, "Contact was not edited successfully");
	    }
}
