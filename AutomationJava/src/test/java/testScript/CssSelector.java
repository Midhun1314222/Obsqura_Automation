package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CssSelector extends Base {
	
	public void tagId() {
		WebElement showmessage=driver.findElement(By.cssSelector("button#button-one"));
		WebElement textbox=driver.findElement(By.cssSelector("textarea#textbox"));
		WebElement validation=driver.findElement(By.cssSelector("input#validationCustom03"));
	
	}
	public void tagClass() {
		WebElement cardbody=driver.findElement(By.cssSelector("div.card-body"));
		WebElement formgroup=driver.findElement(By.cssSelector("div.form-group"));
		WebElement formcheck=driver.findElement(By.cssSelector("label.form-check-label"));

	}
	public void tagAttribute() {
		//Syntax: css=tag[attribute=value]
				//Eg: driver.findElement(By.cssSelector("button[id=button-one]"));
		WebElement messageone=driver.findElement(By.cssSelector("div[id=message-one]"));
		WebElement validationcustom=driver.findElement(By.cssSelector("input[id=validationCustom01]"));

	}
	public void tagClassAttribute() {
		//driver.findElement(By.cssSelector("button.navbar-toggler[type=button]"));
		driver.findElement(By.cssSelector("div.my-2[id=message-two]"));
		driver.findElement(By.cssSelector("select.form-control[id=single-input-field]"));
		driver.findElement(By.cssSelector("textarea.form-control[id=description]"));
		driver.findElement(By.cssSelector("input.form-control[type=text]"));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		CssSelector cssselector=new CssSelector();
		cssselector.initializeBrowser();
		cssselector.tagId();
		cssselector.tagClass();
		cssselector.tagAttribute();
		cssselector.tagClassAttribute();
		cssselector.driverQuitAndClose();


	}

}
