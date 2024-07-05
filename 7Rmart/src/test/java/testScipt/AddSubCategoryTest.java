package testScipt;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AddSubCategoryPage;
import pages.LoginPage;

public class AddSubCategoryTest extends Base {
	
     @Test
	 public void verifyUserIsAbleToAddSubcategory() {
	        String usernameVal = "admin";
	        String passwordVal = "admin";
	        String subCategoryName = "Iphone 15 pro";
	        //String filePath = "D:\\iphone-15-pro-finish-select-202309-6-1inch-blacktitanium.jpeg";
	        String categoryValue = "247";

	        LoginPage loginPage = new LoginPage(driver);
	        
	        loginPage.enterUserNameOnUserNameField(usernameVal);
	        loginPage.enterPasswordOnPasswordField(passwordVal);
	        loginPage.clickOnSignInButton();

	        AddSubCategoryPage addSubcategoryPage = new AddSubCategoryPage(driver);
	        
	        addSubcategoryPage.clickOnSubCategoryLink();
	        addSubcategoryPage.clickOnCreateNewButton();
	        addSubcategoryPage.selectCategoryByValue(categoryValue);
	        addSubcategoryPage.enterSubCategoryName(subCategoryName);
	        //addSubcategoryPage.uploadFile(filePath);
	        addSubcategoryPage.clickOnSubmitButton();
	        
	        boolean isNewSubCategoryCreated = addSubcategoryPage.isSubcategoryPageCreated();
	        assertTrue(isNewSubCategoryCreated, "Subcategory is not able to create");
	    }
}
