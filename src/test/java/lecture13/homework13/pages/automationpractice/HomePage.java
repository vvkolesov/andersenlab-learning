package lecture13.homework13.pages.automationpractice;

import lecture13.homework13.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(id = "search_query_top")
    private WebElement searchField;
    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public HomePage load(String url){
        driver.get(url);
        return this;
    }

    public HomePage typeItemInSearchbar(String item) {
        searchField.sendKeys(item);
        return this;
    }

    public HomePage clickSearchButton() {
        searchButton.click();
        return this;
    }

}
