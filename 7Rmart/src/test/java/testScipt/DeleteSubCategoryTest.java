package testScipt;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
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
        deleteSubcategoryPage.clickOnDeleteButton();
     
        boolean isSubcategoryPageDeletedSuccess = deleteSubcategoryPage.isSubcategoryPageDeleted();
        assertTrue(isSubcategoryPageDeletedSuccess, "Subcategory page not deleted successfully");
    }
}
