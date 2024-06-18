package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript.Base;

public class CheckBox extends Base {
	public void checkBox() {
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkBox1= driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkBox1.click();
		
		if(!checkBox1.isSelected()) {
			checkBox1.click();
			System.out.println("Selected");
		}else {
			checkBox1.click();
            System.out.println("Checkbox is already unchecked.");
        }
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBox checkbox=new CheckBox();
		checkbox.initializeBrowser();
		checkbox.checkBox();
		//checkbox.uncheckBox();
		

	}

}
