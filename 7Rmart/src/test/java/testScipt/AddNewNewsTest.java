package testScipt;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.AddNewNewsPage;
import pages.LoginPage;

public class AddNewNewsTest extends Base {
	 @Test
	    public void verifyUserIsAbleToAddNewNews() {
	        String usernameVal = "admin";
	        String passwordVal = "admin";
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
