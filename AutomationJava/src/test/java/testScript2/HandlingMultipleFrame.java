package testScript2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript.Base;

public class HandlingMultipleFrame extends Base {
	public void multipleFrames() {
		driver.navigate().to("https://selenium.qabible.in/window-popup.php");
		WebElement likeBtn=driver.findElement(By.xpath("//a[contains(@title,'Follow @obsqurazone on')]"));
		likeBtn.click();
		String mainWindow=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> itr=windows.iterator();
		while(itr.hasNext()) {
			String childWindow=itr.next();
			if(!mainWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingMultipleFrame multipleframes=new HandlingMultipleFrame();
		multipleframes.initializeBrowser();
		multipleframes.multipleFrames();

	}

}
