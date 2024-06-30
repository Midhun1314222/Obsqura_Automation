package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

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
	    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div/text()")private WebElement addSubCategorySuccess;

	    public void clickOnSubCategoryLink() {
	        subCategoryLink.click();
	    }

	    public void clickOnCreateNewButton() {
	        createNewBtn.click();
	    }

	    public void selectCategoryByValue(String value) {
	        Select select = new Select(categoryDropdown);
	        select.selectByValue(value);
	    }

	    public void enterSubCategoryName(String subCategoryName) {
	        subCategoryField.sendKeys(subCategoryName);
	    }

	    /*public void uploadFile(String filePath) {
	        fileUploadField.sendKeys(filePath);
	    }*/

	    public void clickOnSubmitButton() {
	        submitBtn.click();
	    }

	    public boolean isSubcategoryPageCreated() {
	        return addSubCategorySuccess.isDisplayed();
	    }
	}
