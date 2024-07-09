package testScipt;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.EditManageNewsPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class EditManageNewsTest extends Base {
	  @Test
	    public void verifyUserIsAbleToEditNews() throws IOException {
		    String usernameVal = ExcelUtility.getStringData(1, 0, "Login");
	        String passwordVal = ExcelUtility.getStringData(1, 1, "Login");
	        
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
