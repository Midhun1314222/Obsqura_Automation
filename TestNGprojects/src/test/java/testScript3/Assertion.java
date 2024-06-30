package testScript3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion extends Base {
	@Test
	public void assertEqualsTest() {
		driver.navigate().to("https://www.browserstack.com/");
		String actualString=driver.getTitle();
		System.out.println(actualString);
		String expectedstring="Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		Assert.assertEquals(actualString, expectedstring,"Title mismatch");
	}
	@Test
	public void asertNotEqualsTest() {
		driver.navigate().to("https://www.browserstack.com/");
		String actualString=driver.getTitle();
		System.out.println(actualString);
		String expectedstring="Most Reliable App & Cross Browser Testing Platform | BrowserStack.";
		Assert.assertNotEquals(actualString, expectedstring,"Title same");
	}
	@Test
	public void assertTrueTest() { //verifies that a condition is true
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifTitle=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		Assert.assertTrue(verifTitle);

	}
	@Test
	public void assertFalseTest() {
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifTitle=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack 123");
		Assert.assertFalse(verifTitle);
	}
	@Test
	public void assertNullTest() {
		driver.navigate().to("https://www.browserstack.com/");
		String verifyAssertNull=null;
		Assert.assertNull(verifyAssertNull);

	}
	@Test
	public void assertNotNullTest() {
		driver.navigate().to("https://www.browserstack.com/");
		boolean verifyAssertNotNull=driver.getTitle().equalsIgnoreCase("Most Reliable App & Cross Browser Testing Platform | BrowserStack 123");
		Assert.assertNotNull(verifyAssertNotNull);

	}

}
