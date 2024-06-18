package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testScript.Base;

public class HandlingDropdown extends Base {
	public void dropdowns() {
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		WebElement fields=driver.findElement(By.xpath("//select[@id='single-input-field']"));
		Select select =new Select(fields);
		//select.selectByVisibleText("Red");
		//select.selectByIndex(3);
		select.selectByValue("Yellow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdown handlindDropdowns= new HandlingDropdown();
		handlindDropdowns.initializeBrowser();
		handlindDropdowns.dropdowns();

	}

}
