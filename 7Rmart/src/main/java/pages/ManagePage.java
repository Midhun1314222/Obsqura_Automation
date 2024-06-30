package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagePage {
    WebDriver driver;

    public ManagePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-page' and @class='small-box-footer']")private WebElement managePageBtn;
    @FindBy(xpath = "//a[@onclick='click_button(1)']")private WebElement createNewBtn;
    @FindBy(xpath = "//input[@id='title']")private WebElement titleField;
    @FindBy(xpath = "//textarea[@role='textbox']")private WebElement descField;
    @FindBy(xpath = "//input[@id='page']")private WebElement page;
    @FindBy(xpath = "//button[@type='submit']")private WebElement submitBtn;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div")WebElement managePageHeader;

    public void clickOnManagePageBtn() {
        managePageBtn.click();
    }

    public void clickOnCreateNewBtn() {
        createNewBtn.click();
    }

    public void enterTitle(String title) {
        titleField.sendKeys(title);
    }

    public void enterDescription(String description) {
        descField.sendKeys(description);
    }

    public void enterPage(String pageName) {
        page.sendKeys(pageName);
    }

    public void clickOnSubmitBtn() {
        submitBtn.click();
    }
    public boolean isManagePageLoaded() {
        return managePageHeader.isDisplayed();
    }
}
