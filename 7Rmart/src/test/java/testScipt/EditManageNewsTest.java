package testScipt;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseConfiguration.Base;
import constants.Constants;
import constants.Messages;
import pages.EditManageNewsPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class EditManageNewsTest extends Base {
	  @Test
	    public void verifyUserIsAbleToEditNews(){
		    String usernameVal = ExcelUtility.getStringData(1, 0, Constants.LOGINPAGE);
	        String passwordVal = ExcelUtility.getStringData(1, 1, Constants.LOGINPAGE);
	        
	        LoginPage loginPage = new LoginPage(driver);

	        loginPage.enterUserNameOnUserNameField(usernameVal);
	        loginPage.enterPasswordOnPasswordField(passwordVal);
	        loginPage.clickOnSignInButton();

	        EditManageNewsPage editManageNewsPage = new EditManageNewsPage(driver);

	        editManageNewsPage.clickOnManageNewsBtn();
			boolean is_header_manage_news_loaded=editManageNewsPage.isManageNewsHeaderDisplayed();
			
	        editManageNewsPage.clickOnEditBtn();
			boolean is_header_enter_news_information_loaded=editManageNewsPage.isHeaderEnterNewsInformationDisplayed();
			
	        String editedNewsContent = RandomDataUtility.getNews();
	        editManageNewsPage.enterEditedNews(editedNewsContent);
	        
	        editManageNewsPage.clickOnSubmitBtn();
	        boolean isNewsEdited = editManageNewsPage.isNewsEditedSuccessfully();
	        
			Assert.assertTrue(is_header_manage_news_loaded,Messages.MANAGE_NEWS_HEADER_NOT_FOUND);
			Assert.assertTrue(is_header_enter_news_information_loaded,Messages.ENTER_NEWS_INFORMATION_HEADER_NOT_FOUND);
			Assert.assertTrue(isNewsEdited, Messages.SUCCESS_ALERT_NOT_FOUND);
	    }
}
