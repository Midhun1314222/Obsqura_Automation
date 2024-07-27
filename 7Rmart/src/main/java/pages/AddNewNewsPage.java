package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WebElementsUtility;

public class AddNewNewsPage {
	 WebDriver driver;
	 WebElementsUtility webelementsutility=new WebElementsUtility();

	    public AddNewNewsPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")private WebElement manageNewsBtn;
		@FindBy(xpath="//h1[@class='m-0 text-dark']")private WebElement manageNewsHeader;
	    @FindBy(xpath = "//a[@onclick='click_button(1)']")private WebElement addNewNewsBtn;
		@FindBy(xpath="//h3[text()='Enter News Informations']")private WebElement enterNewsInformationHeader ;
	    @FindBy(xpath = "//textarea[@id='news']")private WebElement newsTextArea;
	    @FindBy(xpath = "//button[@type='submit']")private WebElement submitBtn;
	    @FindBy(xpath = "//div[contains(@class,'alert-success')]")private WebElement successMessage;

	    public void clickOnManageNewsBtn() {
	        PageUtility.click(manageNewsBtn);
	    }
	    
	    public boolean isManageNewsHeaderDisplayed()
		{
			boolean isManageNewsHeaderAvailable=webelementsutility.isElementDisplayed(manageNewsHeader);
			return isManageNewsHeaderAvailable;
		}

	    public void clickOnAddNewNewsBtn() {
	        PageUtility.click(addNewNewsBtn);
	    }
	    
	    public boolean isenterNewsInformationHeaderDisplayed()
		{
			boolean isEnterNewsInformationHeaderAvailabe=webelementsutility.isElementDisplayed(enterNewsInformationHeader);
			return isEnterNewsInformationHeaderAvailabe;
		}

	    public void enterNews(String news) {
	        PageUtility.sendKeys(newsTextArea, news);
	    }

	    public void clickOnSubmitBtn() {
	        PageUtility.click(submitBtn);
	    }

	    public boolean isNewsAddedSuccessfully() {
	    	boolean isAddNewsSuccessAlertDisplayed=webelementsutility.isElementDisplayed(successMessage);
	    	return isAddNewsSuccessAlertDisplayed;	
	    	
	    }
}
