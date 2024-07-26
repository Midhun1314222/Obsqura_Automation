package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class AddNewNewsPage {
	 WebDriver driver;

	    public AddNewNewsPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")private WebElement manageNewsBtn;
	    @FindBy(xpath = "//a[@onclick='click_button(1)']")private WebElement addNewNewsBtn;
	    @FindBy(xpath = "//textarea[@id='news']")private WebElement newsTextArea;
	    @FindBy(xpath = "//button[@type='submit']")private WebElement submitBtn;
	    @FindBy(xpath = "//div[contains(@class,'alert-success')]")private WebElement successMessage;

	    public void clickOnManageNewsBtn() {
	        PageUtility.click(manageNewsBtn);
	    }

	    public void clickOnAddNewNewsBtn() {
	        PageUtility.click(addNewNewsBtn);
	    }

	    public void enterNews(String news) {
	        PageUtility.sendKeys(newsTextArea, news);
	    }

	    public void clickOnSubmitBtn() {
	        PageUtility.click(submitBtn);
	    }

	    public boolean isNewsAddedSuccessfully() {
	        return successMessage.isDisplayed();
	    }
}
