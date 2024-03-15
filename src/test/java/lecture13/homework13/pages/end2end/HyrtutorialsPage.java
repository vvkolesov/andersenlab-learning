package lecture13.homework13.pages.end2end;

import lecture13.homework13.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class HyrtutorialsPage extends BasePage {

    @FindBy(xpath = "//button[@class='fc-button fc-cta-do-not-consent fc-secondary-button']")
    private WebElement declineAllButton;
    @FindBy(xpath = "//button[@id='alertBox']")
    private WebElement alertBoxButton;
    @FindBy(xpath = "//button[@id='confirmBox']")
    private WebElement confirmBoxButton;
    @FindBy(xpath = "//button[@id='promptBox']")
    private WebElement promptBoxButton;
    @FindBy(xpath = "//div[@id='output']")
    private WebElement outputText;

    public HyrtutorialsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void alertBoxButton() {
        //waitForVisibility(declineAllButton);
        declineAllButton.click();
        new Actions(driver)
                .click(alertBoxButton)
                .perform();

        driver.switchTo()
                .alert().accept();
    }

    public void confirmBoxButton() {
        new Actions(driver)
                .click(confirmBoxButton)
                .perform();
        driver.switchTo().alert().dismiss();
    }

    public void promptBoxButton(String promt) {
        new Actions(driver)
                .click(promptBoxButton)
                .perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
        driver.switchTo().alert().sendKeys(promt);
    }

    public String getOutputText() {
        waitForVisibility(outputText);
        return outputText.getText();
    }
}
