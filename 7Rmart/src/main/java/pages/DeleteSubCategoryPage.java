package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteSubCategoryPage {
	  WebDriver driver;

	    public DeleteSubCategoryPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category' and @class='small-box-footer']")private WebElement subCategoryLink;
	    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td[5]/a[2]")private WebElement deleteBtn;
	    @FindBy(xpath = "//div[contains(@class,'alert-success')]")private WebElement deleteSubCategorySuccess;

	    public void clickOnSubCategoryLink() {
	        subCategoryLink.click();
	    }

	    public void clickOnDeleteButton() {
	        deleteBtn.click();
	        driver.switchTo().alert().accept();
	    }

	    public boolean isSubcategoryPageDeleted() {
	        return deleteSubCategorySuccess.isDisplayed();
	    }
	}
