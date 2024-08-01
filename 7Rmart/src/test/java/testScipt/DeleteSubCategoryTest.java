package testScipt;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseConfiguration.Base;
import constants.Constants;
import constants.Messages;
import pages.DeleteSubCategoryPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class DeleteSubCategoryTest extends Base {
    @Test
    public void verifyUserIsAbleToDeleteSubcategory(){
    	 String usernameVal = ExcelUtility.getStringData(1, 0, Constants.LOGINPAGE);
         String passwordVal = ExcelUtility.getStringData(1, 1, Constants.LOGINPAGE);

        LoginPage loginPage = new LoginPage(driver);

        // Perform login actions
        loginPage.enterUserNameOnUserNameField(usernameVal);
        loginPage.enterPasswordOnPasswordField(passwordVal);
        loginPage.clickOnSignInButton();

        DeleteSubCategoryPage deleteSubcategoryPage = new DeleteSubCategoryPage(driver);

        deleteSubcategoryPage.clickOnSubCategoryLink();
		boolean isListSubcategoryTextloaded= deleteSubcategoryPage.isListSubcategoryTextVisible();
       
        deleteSubcategoryPage.clickOnDeleteButton();
        boolean isSubcategoryPageDeletedSuccess = deleteSubcategoryPage.isSubcategoryPageDeleted();
        
		Assert.assertTrue(isListSubcategoryTextloaded,Messages.LIST_SUBCATEGORIES_HEADER_NOT_FOUND);
		Assert.assertTrue(isSubcategoryPageDeletedSuccess, Messages.SUCCESS_ALERT_NOT_FOUND);
    }
}
