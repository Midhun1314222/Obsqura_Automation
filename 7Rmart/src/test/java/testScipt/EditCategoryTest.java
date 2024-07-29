package testScipt;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseConfiguration.Base;
import constants.Constants;
import constants.Messages;
import pages.EditCategoryPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class EditCategoryTest extends Base {
	   @Test
	    public void verifyUserIsAbleToEditCategory(){
		    String usernameVal = ExcelUtility.getStringData(1, 0, Constants.LOGINPAGE);
	        String passwordVal = ExcelUtility.getStringData(1, 1, Constants.LOGINPAGE);
	        	       
	        LoginPage loginPage = new LoginPage(driver);

	        loginPage.enterUserNameOnUserNameField(usernameVal);
	        loginPage.enterPasswordOnPasswordField(passwordVal);
	        loginPage.clickOnSignInButton();

	        EditCategoryPage editCategoryPage = new EditCategoryPage(driver);

	        editCategoryPage.clickOnCategoryBtn();
			boolean is_edit_categories_header_availabe=editCategoryPage.isEditCategoriesHeaderDisplayed();
			
	        editCategoryPage.clickOnEditBtn();
	        String editedCategoryName = ExcelUtility.getStringData(1, 0,Constants.EDIT_CATEGORY_TEST_DATA);
		       //String imagePath = "D:\\cars.jpeg";

	        editCategoryPage.enterEditedCategory(editedCategoryName);
	        //editCategoryPage.clickOnDeleteImage();
	        //editCategoryPage.uploadImage(imagePath);
	        editCategoryPage.clickOnShowOnTopRadioBtn();
	        editCategoryPage.clickOnShowOnLeftRadioBtn();
	        
	        editCategoryPage.clickOnSubmitBtn();	       
	        boolean isCategoryEditedSuccess = editCategoryPage.isCategoryEdited();
	        
			Assert.assertTrue(is_edit_categories_header_availabe,Messages.EDIT_CATEGORY_HEADER_NOT_FOUND);
			Assert.assertTrue(isCategoryEditedSuccess, Messages.SUCCESS_ALERT_NOT_FOUND);
	    }
}
