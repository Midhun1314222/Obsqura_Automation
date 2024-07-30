package testScipt;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseConfiguration.Base;
import constants.Constants;
import constants.Messages;
import pages.AddNewNewsPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.RandomDataUtility;

public class AddNewNewsTest extends Base {
	 @Test
	    public void verifyUserIsAbleToAddNewNews(){
		    String usernameVal = ExcelUtility.getStringData(1, 0, Constants.LOGINPAGE);
	        String passwordVal = ExcelUtility.getStringData(1, 1, Constants.LOGINPAGE);
	        
	        LoginPage loginPage = new LoginPage(driver);

	        loginPage.enterUserNameOnUserNameField(usernameVal);
	        loginPage.enterPasswordOnPasswordField(passwordVal);
	        loginPage.clickOnSignInButton();

	        AddNewNewsPage addNewNewsPage = new AddNewNewsPage(driver);

	        addNewNewsPage.clickOnManageNewsBtn();
			boolean is_manage_news_header_available=addNewNewsPage.isManageNewsHeaderDisplayed();
	        
	        addNewNewsPage.clickOnAddNewNewsBtn();
			boolean is_enter_news_information_header_availabe=addNewNewsPage.isenterNewsInformationHeaderDisplayed();
			
	        String newsContent = RandomDataUtility.getNews();
	        addNewNewsPage.enterNews(newsContent);
	        
	        addNewNewsPage.clickOnSubmitBtn();
	        boolean is_add_subcategory_success_alert_displayed = addNewNewsPage.isNewsAddedSuccessfully();
	        
			Assert.assertTrue(is_manage_news_header_available,Messages.MANAGE_NEWS_HEADER_NOT_FOUND);
			Assert.assertTrue(is_enter_news_information_header_availabe,Messages.ENTER_NEWS_INFORMATION_HEADER_NOT_FOUND);
			Assert.assertTrue(is_add_subcategory_success_alert_displayed, Messages.SUCCESS_ALERT_NOT_FOUND);
	    }
}
