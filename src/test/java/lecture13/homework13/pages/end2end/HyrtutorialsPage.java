package lecture13.homework13.pages.end2end;

import lecture13.homework13.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class HyrtutorialsPage extends BasePage {

    private final By declineAllButton
            = By.xpath("//button[@class='fc-button fc-cta-do-not-consent fc-secondary-button']");
    private final By alertBoxButton = By.xpath("//button[@id='alertBox']");
    private final By confirmBoxButton = By.xpath("//button[@id='confirmBox']");
    private final By promptBoxButton = By.xpath("//button[@id='promptBox']");
    private final By outputText = By.xpath("//div[@id='output']");

    public HyrtutorialsPage(WebDriver driver) {
        super(driver);
    }

    public void alertBoxButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(declineAllButton)).click();
        new Actions(driver)
                .click(driver.findElement(alertBoxButton))
                .perform();

        driver.switchTo()
                .alert().accept();
    }

    public void confirmBoxButton() {
        new Actions(driver)
                .click(driver.findElement(confirmBoxButton))
                .perform();
        driver.switchTo().alert().dismiss();
    }

    public void promptBoxButton(String promt) {
        new Actions(driver)
                .click(driver.findElement(promptBoxButton))
                .perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
        driver.switchTo().alert().sendKeys(promt);
    }

    public String getOutputText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(outputText)).getText();
    }
}
