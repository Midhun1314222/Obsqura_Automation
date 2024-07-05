package testScipt;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.EditCategoryPage;
import pages.LoginPage;

public class EditCategoryTest extends Base {
	   @Test
	    public void verifyUserIsAbleToEditCategory() {
	        String usernameVal = "admin";
	        String passwordVal = "admin";
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
