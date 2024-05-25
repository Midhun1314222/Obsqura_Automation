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
		//select elements whose attribute value contains a specified substring.
		driver.findElement(By.xpath("//div[contains(@id,'message-two')]"));
		driver.findElement(By.xpath("//select[contains(@id,'single-input-field')]"));
		driver.findElement(By.xpath("//div[contains(@dropzone,'move')]"));
		driver.findElement(By.xpath("//div[contains(@class,'w25')]"));
		driver.findElement(By.xpath("//input[contains(@id,'field2')]"));


	}
	public void startsWith() {
		//select elements whose attribute value starts with a specified substring.
		driver.findElement(By.xpath("//button[starts-with(@id,'button-f')]"));
		driver.findElement(By.xpath("//button[starts-with(@id,'autoclosable-btn-s')]"));
		driver.findElement(By.xpath("//button[starts-with(@id,'normal-btn-w')]"));
		driver.findElement(By.xpath("//button[starts-with(@id,'autoclosable-btn-danger')]"));

	}
	public void text() {
		//select elements based on their text content.
		driver.findElement(By.xpath("//a[text()='Bootstrap List Box']"));
		driver.findElement(By.xpath("//button[text()='Submit data']"));
		driver.findElement(By.xpath("//button[text()='Get Total']"));
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[text()='Get Total']"));
		driver.findElement(By.xpath("//button[text()='Get Total']"));


	}
	public void and() {
		/*Two conditions are used, both conditions should be true to find the element. 
		It fails to find element if any one condition is false.*/
		driver.findElement(By.xpath("//button[@type='button' and @id='button-two']"));
		driver.findElement(By.xpath("//input[@type='text' and @id='single-input-field']"));
		driver.findElement(By.xpath("//input[@type='text' and @id='from']"));
		driver.findElement(By.xpath("//input[@type='text' and @id='value-a']"));

	}
	public void or() {
		/*Two conditions are used, whether 1st condition OR 2nd condition should be true.
		  It is also applicable if any one condition is true or maybe both*/
		driver.findElement(By.xpath("//div[@id='mydropzone' or @dropzone='move']"));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xpath xpath=new Xpath();
		xpath.initializeBrowser();
		xpath.basicXpath();
		xpath.cointains();
		xpath.startsWith();
		xpath.text();
		xpath.and();
		xpath.or();

	}

}
