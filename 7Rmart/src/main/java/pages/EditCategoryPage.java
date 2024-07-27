package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WebElementsUtility;

public class EditCategoryPage {
	   WebDriver driver;
	   WebElementsUtility webelementsutility=new WebElementsUtility();

	    public EditCategoryPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div/div/div[6]/div/a")private WebElement categoryBtn;
		@FindBy(xpath="//h1[@class='m-0 text-dark']")private WebElement editCategoriesHeader ;
	    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td[4]/a[1]")private WebElement editBtn;
	    @FindBy(xpath = "//input[@type='text']")private WebElement editedCategory;
	    @FindBy(xpath = "//a[@role='button']")private WebElement deleteImage;
	    //@FindBy(xpath = "//input[@type='file']")private WebElement imageUpload;
	    @FindBy(xpath = "//input[@name='top_menu' and @value='yes']")private WebElement showOnTopRadioBtn;
	    @FindBy(xpath = "//input[@name='show_home' and @value='no']")private WebElement showOnLeftRadioBtn;
	    @FindBy(xpath = "//button[@type='submit']")private WebElement submitBtn;
	    @FindBy(xpath = "//div[contains(@class,'alert-success')]")private WebElement successMessage;


	    public void clickOnCategoryBtn() {
	        PageUtility.click(categoryBtn);
	    }
	    
	    public boolean isEditCategoriesHeaderDisplayed()
		{
			boolean isEditCategoriesHeaderAvailabe=webelementsutility.isElementDisplayed(editCategoriesHeader);
			return isEditCategoriesHeaderAvailabe;
		}

	    public void clickOnEditBtn() {
	        PageUtility.click(editBtn);
	    }

	    public void enterEditedCategory(String categoryName) {
	        PageUtility.clearAndSendKeys(editedCategory, categoryName);

	    }

	    /*public void clickOnDeleteImage() {
	        deleteImage.click();
	        driver.switchTo().alert().accept();
	    }

	    public void uploadImage(String imagePath) {
	        imageUpload.sendKeys(imagePath);
	    }*/

	    public void clickOnShowOnTopRadioBtn() {
	        PageUtility.click(showOnTopRadioBtn);
	    }

	    public void clickOnShowOnLeftRadioBtn() {
	        PageUtility.click(showOnLeftRadioBtn);
	    }

	    public void clickOnSubmitBtn() {
	        PageUtility.clickElementByJS(driver, submitBtn);
	    }
	    public boolean isCategoryEdited() {
	    	boolean isEditCategorySuccessAlertDisplayed=webelementsutility.isElementDisplayed(successMessage);
	    	return isEditCategorySuccessAlertDisplayed;		 
	    	}
}
