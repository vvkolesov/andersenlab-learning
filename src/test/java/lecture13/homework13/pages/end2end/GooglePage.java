package lecture13.homework13.pages.end2end;

import lecture13.homework13.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class GooglePage extends BasePage {

    @FindBy(xpath = "//textarea[@name='q']")
    private WebElement searchBar;
    @FindBy(xpath = "//h3[contains(text(), 'Create account')]")
    private WebElement guinnessTitle;
    @FindBy(xpath = "//h3[contains(text(), 'AlertsDemo')]")
    private WebElement hyrtutorialsTitle;
    @FindBy(xpath = "//*[@id='W0wltc']/div")
    private WebElement declineAllButton;

    public GooglePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public List<String> getTabs() {
        return new ArrayList<>(driver.getWindowHandles());
    }

    public GooglePage load(String url) {
        driver.get(url);
        declineAllButton.click();
        return this;
    }

    public GooglePage openTabs(List<String> urlsList) {
        new Actions(driver)
                .sendKeys(searchBar, urlsList.get(0))
                .sendKeys(Keys.ENTER)
                .perform();

        waitForClickable(guinnessTitle);
        new Actions(driver)
                .keyDown(Keys.CONTROL)
                .click(guinnessTitle)
                .keyUp(Keys.CONTROL)
                .perform();

        searchBar.clear();

        new Actions(driver)
                .sendKeys(searchBar, urlsList.get(1))
                .sendKeys(Keys.ENTER)
                .perform();

        new Actions(driver)
                .keyDown(Keys.CONTROL)
                .click(hyrtutorialsTitle)
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
