package lecture13.homework13.pages.end2end;

import lecture13.homework13.base.BasePage;
import lecture13.homework13.objects.UserRegistrationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class W3schoolPage extends BasePage {

    private final By iframe = By.xpath("//*[@id='iframeResult']");
    private final By acceptAll = By.xpath("//div[@id='accept-choices']");
    private final By firstNameInput = By.xpath("//*[@id='fname']");
    private final By lastNameInput = By.xpath("//*[@id='lname']");
    private final By submitButton = By.xpath("//input[@value='Submit']");
    private final By noteText = By.xpath("//div[@class='w3-panel w3-pale-yellow w3-leftbar w3-border-yellow']");

    public W3schoolPage(WebDriver driver) {
        super(driver);
    }

    public String getNoteText() {
        driver.switchTo().frame(driver.findElement(iframe));
        String text = wait.until(ExpectedConditions.visibilityOfElementLocated(noteText)).getText();
        driver.switchTo().defaultContent();
        return text;
    }

    public W3schoolPage login(UserRegistrationData userRegistrationData) {
        wait.until(ExpectedConditions.elementToBeClickable(acceptAll)).click();
        driver.switchTo().frame(driver.findElement(iframe));
        driver.findElement(firstNameInput).clear();
        driver.findElement(firstNameInput).sendKeys(userRegistrationData.getFirstName());
        driver.findElement(lastNameInput).clear();
        driver.findElement(lastNameInput).sendKeys(userRegistrationData.getLastName());
        driver.findElement(submitButton).click();
        driver.switchTo().defaultContent();
        return this;
    }
}
