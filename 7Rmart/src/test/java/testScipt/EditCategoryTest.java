package testScipt;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.EditCategoryPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class EditCategoryTest extends Base {
	   @Test
	    public void verifyUserIsAbleToEditCategory(){
		    String usernameVal = ExcelUtility.getStringData(1, 0, Constants.LOGINPAGE);
	        String passwordVal = ExcelUtility.getStringData(1, 1, Constants.LOGINPAGE);
	        
	        String editedCategoryName = "Cars";
	       //String imagePath = "D:\\cars.jpeg";

	        LoginPage loginPage = new LoginPage(driver);

	        loginPage.enterUserNameOnUserNameField(usernameVal);
	        loginPage.enterPasswordOnPasswordField(passwordVal);
	        loginPage.clickOnSignInButton();

	        EditCategoryPage editCategoryPage = new EditCategoryPage(driver);

	        editCategoryPage.clickOnCategoryBtn();
	        editCategoryPage.clickOnEditBtn();
	        editCategoryPage.enterEditedCategory(editedCategoryName);
	        //editCategoryPage.clickOnDeleteImage();
	        //editCategoryPage.uploadImage(imagePath);
	        editCategoryPage.clickOnShowOnTopRadioBtn();
	        editCategoryPage.clickOnShowOnLeftRadioBtn();
	        editCategoryPage.clickOnSubmitBtn();
	        
	        boolean isCategoryEditedSuccess = editCategoryPage.isCategoryEdited();
	        assertTrue(isCategoryEditedSuccess, "Category was not edited successfully");
	    }
}
