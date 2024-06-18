package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript.Base;

public class Actions extends Base {
	public void performActions() {
		WebElement mobileSection = driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']"));
		mobileSection.click();
		WebElement laptop= driver.findElement(By.xpath("//a[contains(@aria-label,'Laptops')]"));
		laptop.click();
		WebElement externalDevice=driver.findElement(By.xpath("//span[text()='External Devices & Data Storage']"));
		externalDevice.click();
		WebElement penDrive= driver.findElement(By.xpath("//img[contains(@alt,'Sandisk Extreme Portable 1TB')]"));
		penDrive.click();
		WebElement addToCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addToCart.click();
		WebElement checkout= driver.findElement(By.xpath("//input[@aria-labelledby='attach-sidesheet-checkout-button-announce']"));
		checkout.click();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Actions actions=new Actions();
		actions.initializeBrowser();
		actions.performActions();

	}

}
