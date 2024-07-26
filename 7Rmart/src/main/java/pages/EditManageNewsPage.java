package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class EditManageNewsPage {
	  WebDriver driver;

	    public EditManageNewsPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")private WebElement manageNewsBtn;
	    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td[2]/a[1]")private WebElement editBtn;
	    @FindBy(xpath = "//textarea[@id='news']")private WebElement newsTextArea;
	    @FindBy(xpath = "//button[@type='submit']")private WebElement submitBtn;
	    @FindBy(xpath = "//div[contains(@class,'alert-success')]")private WebElement successMessage;

	    public void clickOnManageNewsBtn() {
	        PageUtility.click(manageNewsBtn);
	    }

	    public void clickOnEditBtn() {
	        PageUtility.click(editBtn);
	    }

	    public void enterEditedNews(String news) {
	        PageUtility.clearAndSendKeys(newsTextArea, news);
	    }

	    public void clickOnSubmitBtn() {
	        PageUtility.click(submitBtn);
	    }

	    public boolean isNewsEditedSuccessfully() {
	        return successMessage.isDisplayed();
	    }
}
