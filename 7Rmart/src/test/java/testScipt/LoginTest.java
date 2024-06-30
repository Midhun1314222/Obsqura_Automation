package testScipt;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
	
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() {
		String usernameVal="admin";
		String passwordVal="admin";
		LoginPage loginPage=new LoginPage(driver);
		loginPage.enterUserNameOnUserNameField(usernameVal);
		loginPage.enterPasswordOnPasswordField(passwordVal);
		loginPage.clickOnSignInButton();
		boolean isHomePageAvailable=loginPage.isHomePageLoaded();
		assertTrue(isHomePageAvailable,"Home page not loaded when user is entering valid credentials");
	}
	

    @Test
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
}
