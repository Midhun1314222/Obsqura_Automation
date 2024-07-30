package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import constants.Constants;
import utilities.FileUploadUtility;
import utilities.PageUtility;
import utilities.WaitUtility;
import utilities.WebElementsUtility;

public class AddSubCategoryPage {

	 WebDriver driver;

	    public AddSubCategoryPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category' and @class='small-box-footer']")private WebElement subCategoryLink;
		@FindBy(xpath="//h1[text()='List Sub Categories']")private WebElement listSubcategoriesText;
	    @FindBy(xpath = "//a[@onclick='click_button(1)']")private WebElement createNewBtn;
		@FindBy(xpath="//h1[text()='Add Sub Category']")private WebElement addSubcategoryText;
	    @FindBy(xpath = "//select[@id='cat_id']")private WebElement categoryDropdown;
	    @FindBy(xpath = "//input[@id='subcategory']")private WebElement subCategoryField;
	    @FindBy(xpath = "//input[@type='file']")private WebElement fileUploadField;
		@FindBy(xpath="//div[@id='imagePreview']")private WebElement imagePreview ;
	    @FindBy(xpath = "//button[@type='submit']")private WebElement submitBtn;
	    @FindBy(xpath = "//div[contains(@class,'alert-success')]")private WebElement addSubCategorySuccess;

	    public void clickOnSubCategoryLink() {
	    	PageUtility.click(subCategoryLink);
	    }
	    public boolean isListSubcategoryTextVisible()
		{
			boolean islistSubcategoriesTextAvailable=WebElementsUtility.isElementDisplayed(listSubcategoriesText);
			return islistSubcategoriesTextAvailable;
		}

	    public void clickOnCreateNewButton() {
	        PageUtility.click(createNewBtn);
	    }
	    
	    public boolean isAddSubCategoryTextVisible()
	    {
	    	boolean isaddSubcategoryTextAvailable=WebElementsUtility.isElementDisplayed(addSubcategoryText);
	    	return isaddSubcategoryTextAvailable;
	    }

	    public void selectCategoryByValue(String value) {
	        PageUtility.selectByValue(categoryDropdown, value);
	    }

	    public void enterSubCategoryName(String subCategoryName) {
	        PageUtility.sendKeys(subCategoryField, subCategoryName);
	    }
  
	    public void uploadFile() throws AWTException
		{
				
	    	FileUploadUtility.fileUploadUsingSendkeys(fileUploadField,Constants.TESTDATA_IMAGE_FOR_ADD_SUBCATEGORY);
	    	WaitUtility.waitForElement(driver, imagePreview);
			System.out.println("Image added successfully");
		}

	    public void clickOnSubmitButton() {
	        PageUtility.clickElementByJS(driver, submitBtn);
	    }

	    public boolean isSubcategoryPageCreated() {
	    	boolean isAddSubCategorySuccessAlertDisplayed=WebElementsUtility.isElementDisplayed(addSubCategorySuccess);
	    	return isAddSubCategorySuccessAlertDisplayed;	    }
	}
