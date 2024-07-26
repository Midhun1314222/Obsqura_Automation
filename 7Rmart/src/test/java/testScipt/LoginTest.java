package testScipt;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constants;
import dataProvider.DataProviders;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	
	@Test(groups={"smoke","regression"})//for multiple group
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() {
		//String usernameVal="admin";
		//String passwordVal="admin";
		String usernameVal=ExcelUtility.getStringData(1, 0, Constants.LOGINPAGE);
		String passwordVal=ExcelUtility.getStringData(1, 1, Constants.LOGINPAGE);

		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(usernameVal);
		loginPage.enterPasswordOnPasswordField(passwordVal);
		loginPage.clickOnSignInButton();
		boolean isHomePageAvailable=loginPage.isHomePageLoaded();
		assertTrue(isHomePageAvailable,"Home page not loaded when user is entering valid credentials");
	}
	

    @Test(groups="regression")
    public void verifyTheUserIsUnableToLoginUsingInvalidUsername() {
        String usernameVal = "invalidUser";
        String passwordVal = "admin";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserNameOnUserNameField(usernameVal);
        loginPage.enterPasswordOnPasswordField(passwordVal);
        loginPage.clickOnSignInButton();
        boolean isHomePageAvailable = loginPage.isHomePageLoaded();
        assertTrue(isHomePageAvailable, "Home page should not be loaded when user is entering an invalid username");
    }

    @Test
    public void verifyTheUserIsUnableToLoginUsingInvalidPassword() {
        String usernameVal = "admin";
        String passwordVal = "invalidPass";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserNameOnUserNameField(usernameVal);
        loginPage.enterPasswordOnPasswordField(passwordVal);
        loginPage.clickOnSignInButton();
        boolean isHomePageAvailable = loginPage.isHomePageLoaded();
        assertTrue(isHomePageAvailable, "Home page should not be loaded when user is entering an invalid password");
    }
    
    @Test
    public void verifyTheUserIsUnableToLoginUsingInvalidCredentials() {
        String usernameVal = "admin1";
        String passwordVal = "admin1";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUserNameOnUserNameField(usernameVal);
        loginPage.enterPasswordOnPasswordField(passwordVal);
        loginPage.clickOnSignInButton();
        boolean isHomePageAvailable = loginPage.isHomePageLoaded();
        assertTrue(isHomePageAvailable, "Home page should not be loaded when user is entering invalid credentials");
    }
    @Test(dataProvider="InvalidUserCredentials",dataProviderClass=DataProviders.class)
    public void verifyUserLoginWithValidCredential(String username,String password) {
           LoginPage loginPage = new LoginPage(driver);
    	   loginPage.enterUserNameOnUserNameField(username);
           loginPage.enterPasswordOnPasswordField(password);
           loginPage.clickOnSignInButton();
           boolean actualresultlogin=loginPage.isHomePageLoaded();
           assertTrue(actualresultlogin, "Home page should not be loaded when user is entering invalid credentials");

    }
}
