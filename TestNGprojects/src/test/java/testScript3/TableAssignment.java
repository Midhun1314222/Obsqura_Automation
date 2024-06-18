package testScript3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TableAssignment extends Base {
	@Test
	public void printTable() {
		driver.navigate().to("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		WebElement table=driver.findElement(By.xpath("//table[@id='customers']"));
		System.out.println(table.getText());
		
	}
	@Test
	public void colomnPrint() {
		driver.navigate().to("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		List<WebElement> tableColoumn= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		for(WebElement menu:tableColoumn) {
			System.out.println(menu.getText());
		}
	}
	@Test
	public void rowCell() {
		driver.navigate().to("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
		WebElement rowCellValue= driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[1]/td[2]"));
		System.out.println(rowCellValue.getText());

	}

}
