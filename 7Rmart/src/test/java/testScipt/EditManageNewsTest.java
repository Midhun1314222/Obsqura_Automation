package testScipt;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.EditManageNewsPage;
import pages.LoginPage;

public class EditManageNewsTest extends Base {
	  @Test
	    public void verifyUserIsAbleToEditNews() {
	        String usernameVal = "admin";
	        String passwordVal = "admin";
	        String editedNewsContent = "Edited News";

	        LoginPage loginPage = new LoginPage(driver);

	        loginPage.enterUserNameOnUserNameField(usernameVal);
	        loginPage.enterPasswordOnPasswordField(passwordVal);
	        loginPage.clickOnSignInButton();

	        EditManageNewsPage editManageNewsPage = new EditManageNewsPage(driver);

	        editManageNewsPage.clickOnManageNewsBtn();
	        editManageNewsPage.clickOnEditBtn();
	        editManageNewsPage.enterEditedNews(editedNewsContent);
	        editManageNewsPage.clickOnSubmitBtn();

	        boolean isNewsEdited = editManageNewsPage.isNewsEditedSuccessfully();
	        assertTrue(isNewsEdited, "News was not edited successfully");
	    }
}
