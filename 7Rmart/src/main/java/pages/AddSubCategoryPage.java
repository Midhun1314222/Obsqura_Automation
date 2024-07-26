package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AddSubCategoryPage {

	 WebDriver driver;

	    public AddSubCategoryPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-sub-category' and @class='small-box-footer']")private WebElement subCategoryLink;
	    @FindBy(xpath = "//a[@onclick='click_button(1)']")private WebElement createNewBtn;
	    @FindBy(xpath = "//select[@id='cat_id']")private WebElement categoryDropdown;
	    @FindBy(xpath = "//input[@id='subcategory']")private WebElement subCategoryField;
	    //@FindBy(xpath = "//input[@type='file']")private WebElement fileUploadField;
	    @FindBy(xpath = "//button[@type='submit']")private WebElement submitBtn;
	    @FindBy(xpath = "//div[contains(@class,'alert-success')]")private WebElement addSubCategorySuccess;

	    public void clickOnSubCategoryLink() {
	        PageUtility.click(subCategoryLink);
	    }

	    public void clickOnCreateNewButton() {
	        PageUtility.click(createNewBtn);
	    }

	    public void selectCategoryByValue(String value) {
	        PageUtility.selectByValue(categoryDropdown, value);
	    }

	    public void enterSubCategoryName(String subCategoryName) {
	        PageUtility.sendKeys(subCategoryField, subCategoryName);
	    }

	    /*public void uploadFile(String filePath) {
	        fileUploadField.sendKeys(filePath);
	    }*/

	    public void clickOnSubmitButton() {
	        PageUtility.click(submitBtn);
	    }

	    public boolean isSubcategoryPageCreated() {
	        return addSubCategorySuccess.isDisplayed();
	    }
	}
