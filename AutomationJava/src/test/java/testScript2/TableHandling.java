package testScript2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import testScript.Base;

public class TableHandling extends Base {
	public void tablePrinting() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
		
	}
	public void tableRow() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement tableRow=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]"));
		System.out.println(tableRow.getText());
	}
	public void tableRowCell() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement rowCellValue= driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[4]"));
		System.out.println(rowCellValue.getText());

	}
	public void tableColoumn() {
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> tableColoumn= driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]"));
		for(WebElement menu:tableColoumn) {
			System.out.println(menu.getText());
		}
	}
		
	 public void ashtonCox() {
	        driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
	        WebElement ashtonCoxElement = driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[1]"));
	        List<WebElement> firstColumnCells = driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));	      
	        for (WebElement cell:firstColumnCells) {
	            if (cell.getText().equals(ashtonCoxElement.getText())) {
	                System.out.println("Both are same");
	            }
	        }
	    }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TableHandling tablehandling=new TableHandling();
		tablehandling.initializeBrowser();
		//tablehandling.tablePrinting();
		//tablehandling.tableRow();
		//tablehandling.tableRowCell();
		tablehandling.tableColoumn();
		//tablehandling.ashtonCox();

	}

}
