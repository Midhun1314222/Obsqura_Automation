package testScript2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import testScript.Base;

public class ActionClass extends Base {
	public void actionClass() {
		driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement dragElement=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dropzone=driver.findElement(By.id("mydropzone"));
		Actions action = new Actions(driver);
		action.moveToElement(dragElement).build().perform();
		action.doubleClick(dragElement).build().perform();
		action.contextClick(dragElement).build().perform();
		action.dragAndDrop(dragElement, dropzone).build().perform();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionClass actionclass=new ActionClass();
		actionclass.initializeBrowser();
		actionclass.actionClass();
		//actionclass.driverQuitAndClose();

	}

}
