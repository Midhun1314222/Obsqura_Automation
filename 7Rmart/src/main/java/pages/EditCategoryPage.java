package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCategoryPage {
	   WebDriver driver;

	    public EditCategoryPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div[6]/div/a")private WebElement categoryBtn;
	    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td[4]/a[1]")private WebElement editBtn;
	    @FindBy(xpath = "//input[@type='text']")private WebElement editedCategory;
	    @FindBy(xpath = "//a[@role='button']")private WebElement deleteImage;
	    //@FindBy(xpath = "//input[@type='file']")private WebElement imageUpload;
	    @FindBy(xpath = "//input[@name='top_menu' and @value='yes']")private WebElement showOnTopRadioBtn;
	    @FindBy(xpath = "//input[@name='show_home' and @value='no']")private WebElement showOnLeftRadioBtn;
	    @FindBy(xpath = "//button[@type='submit']")private WebElement submitBtn;
	    @FindBy(xpath = "//div[contains(@class,'alert-success')]")private WebElement successMessage;


	    public void clickOnCategoryBtn() {
	        categoryBtn.click();
	    }

	    public void clickOnEditBtn() {
	        editBtn.click();
	    }

	    public void enterEditedCategory(String categoryName) {
	        editedCategory.clear();
	        editedCategory.sendKeys(categoryName);
	    }

	    /*public void clickOnDeleteImage() {
	        deleteImage.click();
	        driver.switchTo().alert().accept();
	    }

	    public void uploadImage(String imagePath) {
	        imageUpload.sendKeys(imagePath);
	    }*/

	    public void clickOnShowOnTopRadioBtn() {
	        showOnTopRadioBtn.click();
	    }

	    public void clickOnShowOnLeftRadioBtn() {
	        showOnLeftRadioBtn.click();
	    }

	    public void clickOnSubmitBtn() {
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submitBtn);
	    }
	    public boolean isCategoryEdited() {
	        return successMessage.isDisplayed();
	    }
}
