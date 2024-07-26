package testScipt;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import pages.AddNewNewsPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AddNewNewsTest extends Base {
	 @Test
	    public void verifyUserIsAbleToAddNewNews(){
		    String usernameVal = ExcelUtility.getStringData(1, 0, Constants.LOGINPAGE);
	        String passwordVal = ExcelUtility.getStringData(1, 1, Constants.LOGINPAGE);
	        
	        String newsContent = "Test News";

	        LoginPage loginPage = new LoginPage(driver);

	        loginPage.enterUserNameOnUserNameField(usernameVal);
	        loginPage.enterPasswordOnPasswordField(passwordVal);
	        loginPage.clickOnSignInButton();

	        AddNewNewsPage addNewNewsPage = new AddNewNewsPage(driver);

	        addNewNewsPage.clickOnManageNewsBtn();
	        addNewNewsPage.clickOnAddNewNewsBtn();
	        addNewNewsPage.enterNews(newsContent);
	        addNewNewsPage.clickOnSubmitBtn();

	        boolean isNewsAdded = addNewNewsPage.isNewsAddedSuccessfully();
	        assertTrue(isNewsAdded, "News was not added successfully");
	    }
}
