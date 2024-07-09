package testScipt;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.AddNewNewsPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AddNewNewsTest extends Base {
	 @Test
	    public void verifyUserIsAbleToAddNewNews() throws IOException {
		    String usernameVal = ExcelUtility.getStringData(1, 0, "Login");
	        String passwordVal = ExcelUtility.getStringData(1, 1, "Login");
	        
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
