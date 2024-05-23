package testScript;

import org.openqa.selenium.By;

public class Xpath extends Base {
	
	public void basicXpath() {
		//xpath  //tag[@attribute='value']
		driver.findElement(By.xpath("//div[@id='message-two']"));
		driver.findElement(By.xpath("//select[@id='single-input-field']"));
		driver.findElement(By.xpath("//input[@type='text']"));


		
	}
	public void cointains() {
		driver.findElement(By.xpath("//div[contains(@id,'message-two')]"));
		driver.findElement(By.xpath("//select[contains(@id,'single-input-field')]"));
		driver.findElement(By.xpath("//div[contains(@dropzone,'move')]"));
		driver.findElement(By.xpath("//div[contains(@class,'w25')]"));
		driver.findElement(By.xpath("//input[contains(@id,'field2')]"));


	}
	public void startsWith() {
		driver.findElement(By.xpath("//button[starts-with(@id,'button-f')]"));
		driver.findElement(By.xpath("//button[starts-with(@id,'autoclosable-btn-s')]"));
		driver.findElement(By.xpath("//button[starts-with(@id,'normal-btn-w')]"));
		driver.findElement(By.xpath("//button[starts-with(@id,'autoclosable-btn-danger')]"));

	}
	public void text() {
		driver.findElement(By.xpath("//a[text()='Bootstrap List Box']"));
		driver.findElement(By.xpath("//button[text()='Submit data']"));


		
	}
	public void or() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xpath xpath=new Xpath();
		xpath.initializeBrowser();
		xpath.basicXpath();
		xpath.cointains();
		xpath.startsWith();
		xpath.text();
		xpath.or();

	}

}
