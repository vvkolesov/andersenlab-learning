package lecture13.homework13.pages.end2end;

import lecture13.homework13.base.BasePage;
import lecture13.homework13.objects.UserRegistrationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class W3schoolPage extends BasePage {

    @FindBy(xpath = "//*[@id='iframeResult']")
    private WebElement iframe;
    @FindBy(xpath = "//div[@id='accept-choices']")
    private WebElement acceptAll;
    @FindBy(xpath = "//*[@id='fname']")
    private WebElement firstNameInput;
    @FindBy(xpath = "//*[@id='lname']")
    private WebElement lastNameInput;
    @FindBy(xpath = "//input[@value='Submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//div[@class='w3-panel w3-pale-yellow w3-leftbar w3-border-yellow']")
    private WebElement noteText;

    public W3schoolPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String getNoteText() {
        driver.switchTo().frame(iframe);
        waitForVisibility(noteText);
        String text = noteText.getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public W3schoolPage login(UserRegistrationData userRegistrationData) {
        wait.until(ExpectedConditions.elementToBeClickable(acceptAll)).click();
        driver.switchTo().frame(iframe);
        firstNameInput.clear();
        lastNameInput.clear();
        firstNameInput.sendKeys(userRegistrationData.getFirstName());
        lastNameInput.sendKeys(userRegistrationData.getLastName());
        submitButton.click();
        driver.switchTo().defaultContent();
        return this;
    }
}
