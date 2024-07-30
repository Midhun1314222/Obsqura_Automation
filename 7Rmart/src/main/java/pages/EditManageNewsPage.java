package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WebElementsUtility;

public class EditManageNewsPage {
	  WebDriver driver;

	    public EditManageNewsPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")private WebElement manageNewsBtn;
		@FindBy(xpath="//h1[@class='m-0 text-dark']")private WebElement headerManageNews;
	    @FindBy(xpath = "/html/body/div[1]/div[1]/section/div[4]/div[2]/table/tbody/tr[1]/td[2]/a[1]")private WebElement editBtn;
		@FindBy(xpath="//h3[text()='Enter News Informations']")private WebElement headerenternewsinformation ;
	    @FindBy(xpath = "//textarea[@id='news']")private WebElement newsTextArea;
	    @FindBy(xpath = "//button[@type='submit']")private WebElement submitBtn;
	    @FindBy(xpath = "//div[contains(@class,'alert-success')]")private WebElement successMessage;

	    public void clickOnManageNewsBtn() {
	        PageUtility.click(manageNewsBtn);
	    }
	    
	    public boolean isManageNewsHeaderDisplayed()
	  		{
	  			boolean isManageNewsHeaderAvailable=WebElementsUtility.isElementDisplayed(headerManageNews);
	  			return isManageNewsHeaderAvailable;
	  		}

	    public void clickOnEditBtn() {
	        PageUtility.click(editBtn);
	    }
	    
	    public boolean isHeaderEnterNewsInformationDisplayed()
		{
			boolean isHeaderEnterNewsInformationAvailable=WebElementsUtility.isElementDisplayed(headerenternewsinformation);
			return isHeaderEnterNewsInformationAvailable;
		}

	    public void enterEditedNews(String news) {
	        PageUtility.clearAndSendKeys(newsTextArea, news);
	    }

	    public void clickOnSubmitBtn() {
	        PageUtility.click(submitBtn);
	    }

	    public boolean isNewsEditedSuccessfully() {
	    	boolean isNewsEditedSuccessMessageDisplayed=WebElementsUtility.isElementDisplayed(successMessage);
	    	return isNewsEditedSuccessMessageDisplayed;	
	    	}
}
