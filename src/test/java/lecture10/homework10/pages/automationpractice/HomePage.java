package lecture10.homework10.pages.automationpractice;

import lecture10.homework10.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {

    private final By searchField = By.id("search_query_top");
    private final By searchButton = By.xpath("//button[@name='submit_search']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage load(String url){
        driver.get(url);
        return this;
    }

    public HomePage typeItemInSearchbar(String item) {
        driver.findElement(searchField).sendKeys(item);
        return this;
    }

    public HomePage clickSearchButton() {
        driver.findElement(searchButton).click();
        return this;
    }

}
