package testScipt;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.DeleteSubCategoryPage;
import pages.LoginPage;

public class DeleteSubCategoryTest extends Base {
    @Test
    public void verifyUserIsAbleToDeleteSubcategory() {
        String usernameVal = "admin";
        String passwordVal = "admin";

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
