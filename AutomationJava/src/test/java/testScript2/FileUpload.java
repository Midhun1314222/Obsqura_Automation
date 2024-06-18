package testScript2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript.Base;

public class FileUpload extends Base {
	public void sendKeys() {
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		WebElement pdf=driver.findElement(By.xpath("//input[@id='file-upload']"));
		//pdf.click();
		pdf.sendKeys("D:\\challan.pdf");
		WebElement fileSubmit=driver.findElement(By.xpath("//input[@id='file-submit']"));
		fileSubmit.click();		
	}
	public void robotClass() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement fileSend=driver.findElement(By.xpath("//a[@id='pickfiles']"));
		fileSend.click();
		StringSelection s = new StringSelection("D:\\challan.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
		Robot r=new Robot();
		r.delay(250);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
	      
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload fileupload = new FileUpload();
		fileupload.initializeBrowser();
		//fileupload.sendKeys();
		 try {
	            fileupload.robotClass();
	        } catch (AWTException e) {
	            e.printStackTrace();
	            System.out.println("AWTException");
	        }
	}

}
