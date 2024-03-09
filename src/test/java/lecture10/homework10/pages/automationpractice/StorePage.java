package lecture10.homework10.pages.automationpractice;

import lecture10.homework10.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StorePage extends BasePage {

    private final By listViewButton = By.id("list");
    private final By addToCompareButton = By.xpath("(//a[@class='add_to_compare'])[1]");
    private final By flyoutWomen = By.xpath("//a[@title='Women']");
    private final By compareButton = By.xpath("//button/span[contains(text(),'Compare')]");

    public StorePage(WebDriver driver) {
        super(driver);
    }

    public StorePage changeToListView() {
        driver.findElement(listViewButton).click();
        return this;
    }

    public StorePage addToCompare() {
        driver.findElement(addToCompareButton).click();
        return this;
    }

    public StorePage goToWomenSection() {
        driver.findElement(flyoutWomen).click();
        return this;
    }

    public StorePage goToComparisonPage() {
        driver.findElement(compareButton).click();
        return this;
    }
}
