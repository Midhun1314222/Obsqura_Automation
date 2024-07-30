package testScipt;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseConfiguration.Base;
import constants.Constants;
import constants.Messages;
import pages.LoginPage;
import pages.ManagePage;
import utilities.ExcelUtility;

public class AddNewPageTest extends Base {
	@Test(groups={"regression","smoke"})
	    public void verifyUserIsAbleToCreateNewPage() throws AWTException{
		    String usernameVal = ExcelUtility.getStringData(1, 0, Constants.LOGINPAGE);
	        String passwordVal = ExcelUtility.getStringData(1, 1, Constants.LOGINPAGE);
	        
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.enterUserNameOnUserNameField(usernameVal);
	        loginPage.enterPasswordOnPasswordField(passwordVal);
	        loginPage.clickOnSignInButton();	    

	        ManagePage managePage = new ManagePage(driver);
	        managePage.clickOnManagePageBtn();
			boolean is_new_button_available=managePage.isNewButtonVisible();
			
	        managePage.clickOnCreateNewBtn();
			boolean is_enter_page_informations_header_available=managePage.isEnterPageInformationsHeaderDisplayed();
					    
	        String titledata=ExcelUtility.getStringData(0, 1, Constants.ADD_MANAGE_PAGE_DATA);
			String descriptiondata=ExcelUtility.getStringData(1, 1,Constants.ADD_MANAGE_PAGE_DATA);
			String pagedata=ExcelUtility.getStringData(2, 1,Constants.ADD_MANAGE_PAGE_DATA);
	        
	        managePage.enterTitle(titledata);
	        managePage.enterDescription(descriptiondata);
	        managePage.enterPage(pagedata);
	        managePage.clickOnAddImage();
	        managePage.clickOnSubmitBtn();	        
	        boolean isManagePageAvailable = managePage.isManagePageLoaded();
	        
			Assert.assertTrue(is_new_button_available,Messages.MANAGE_PAGES_NEW_BUTTON_IS_NOT_LOADED);	
			Assert.assertTrue(is_enter_page_informations_header_available,Messages.ENTER_PAGE_INFORMATION_HEADER_NOT_FOUND);	
			Assert.assertTrue(isManagePageAvailable,Messages.SUCCESS_ALERT_NOT_FOUND);

	    }
}
