package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManagePage {
    WebDriver driver;

    public ManagePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page' and @class='small-box-footer']")private WebElement managePageBtn;
    @FindBy(xpath = "//a[@onclick='click_button(1)']")private WebElement createNewBtn;
    @FindBy(xpath = "//input[@id='title']")private WebElement titleField;
    @FindBy(xpath = "//div[@role='textbox']")private WebElement descField;
    @FindBy(xpath = "//input[@id='page']")private WebElement page;
    @FindBy(xpath = "//button[@type='submit']")private WebElement submitBtn;
    @FindBy(xpath = "//div[contains(@class,'alert-success')]")WebElement successMessage;

    public void clickOnManagePageBtn() {
        PageUtility.click(managePageBtn);
    }

    public void clickOnCreateNewBtn() {
        PageUtility.click(createNewBtn);
    }

    public void enterTitle(String title) {
        PageUtility.sendKeys(titleField, title);
    }

    public void enterDescription(String description) {
        PageUtility.sendKeys(descField, description);
    }

    public void enterPage(String pageName) {
        PageUtility.sendKeys(page, pageName);
    }

    public void clickOnSubmitBtn() {
        PageUtility.click(submitBtn);
    }
    public boolean isManagePageLoaded() {
        return successMessage.isDisplayed();
    }
}
