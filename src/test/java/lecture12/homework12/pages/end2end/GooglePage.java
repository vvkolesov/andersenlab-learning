package lecture12.homework12.pages.end2end;

import lecture10.homework10.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class GooglePage extends BasePage {

    private final By searchBar = By.xpath("//textarea[@name='q']");
    private final By guinnessTitle = By.xpath("//h3[contains(text(), 'Create account')]");
    private final By hyrtutorialsTitle = By.xpath("//h3[contains(text(), 'AlertsDemo')]");
    private final By declineAllButton = By.xpath("//*[@id='W0wltc']/div");

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public List<String> getTabs() {
        return new ArrayList<>(driver.getWindowHandles());
    }

    public GooglePage load(String url) {
        driver.get(url);
        driver.findElement(declineAllButton).click();
        return this;
    }

    public GooglePage openTabs(List<String> urlsList) {
        new Actions(driver)
                .sendKeys(driver.findElement(searchBar), urlsList.get(0))
                .sendKeys(Keys.ENTER)
                .perform();

        new Actions(driver)
                .keyDown(Keys.CONTROL)
                .click(wait.until(ExpectedConditions.elementToBeClickable(guinnessTitle)))
                .keyUp(Keys.CONTROL)
                .perform();

        driver.findElement(searchBar).clear();

        new Actions(driver)
                .sendKeys(driver.findElement(searchBar), urlsList.get(1))
                .sendKeys(Keys.ENTER)
                .perform();

        new Actions(driver)
                .keyDown(Keys.CONTROL)
                .click(driver.findElement(hyrtutorialsTitle))
                .keyUp(Keys.CONTROL)
                .perform();
        return this;
    }

    public W3schoolPage openW3schoolPage(List<String> urlsList) {
        driver.get(urlsList.get(2));
        return new W3schoolPage(driver);
    }

    public void switchToTab(List<String> tabs, int index) {
        driver.switchTo().window(tabs.get(index));
    }
}
