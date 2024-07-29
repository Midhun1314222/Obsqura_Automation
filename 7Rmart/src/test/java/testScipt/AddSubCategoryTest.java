package testScipt;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseConfiguration.Base;
import constants.Constants;
import constants.Messages;
import pages.AddSubCategoryPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class AddSubCategoryTest extends Base {
	
	@Test(groups={"sanity","regression"})
	public void verifyUserIsAbleToAddSubcategory(){
	        String usernameVal = ExcelUtility.getStringData(1, 0, Constants.LOGINPAGE);
	        String passwordVal = ExcelUtility.getStringData(1, 1, Constants.LOGINPAGE);
	        	      
	        LoginPage loginPage = new LoginPage(driver);
	        
	        loginPage.enterUserNameOnUserNameField(usernameVal);
	        loginPage.enterPasswordOnPasswordField(passwordVal);
	        loginPage.clickOnSignInButton();

	        AddSubCategoryPage addSubcategoryPage = new AddSubCategoryPage(driver);
	        
	        addSubcategoryPage.clickOnSubCategoryLink();
			boolean isListSubcategoryTextloaded= addSubcategoryPage.isListSubcategoryTextVisible();
			
	        addSubcategoryPage.clickOnCreateNewButton();
			boolean isAddSubCategoryTextloaded=addSubcategoryPage.isAddSubCategoryTextVisible();
			
		    String subCategoryName = RandomDataUtility.getProductSubCategory();
	        String categoryValue = ExcelUtility.getIntegerData(0, 1,Constants.ADD_SUB_CATEGORY_DATA);
	        
	        addSubcategoryPage.selectCategoryByValue(categoryValue);
	        addSubcategoryPage.enterSubCategoryName(subCategoryName);
	        
	        addSubcategoryPage.clickOnSubmitButton();	      
	        boolean isNewSubCategoryCreated = addSubcategoryPage.isSubcategoryPageCreated();
	        
			Assert.assertTrue(isListSubcategoryTextloaded,Messages.LIST_SUBCATEGORIES_HEADER_NOT_FOUND);
			Assert.assertTrue(isAddSubCategoryTextloaded,Messages.ADD_SUBCATEGORIES_HEADER_NOT_FOUND);
			Assert.assertTrue(isNewSubCategoryCreated, Messages.SUCCESS_ALERT_NOT_FOUND);
	    }
}
