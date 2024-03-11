package lecture13.homework13.pages.automationpractice;

import lecture13.homework13.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductComparisonPage extends BasePage {

    private final By product = By.xpath("//a[@class='product-name']");

    public ProductComparisonPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getProducts() {
        return driver.findElements(product);
    }
}
