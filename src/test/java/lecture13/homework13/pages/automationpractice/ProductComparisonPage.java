package lecture13.homework13.pages.automationpractice;

import lecture13.homework13.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductComparisonPage extends BasePage {

    @FindBy(xpath = "//a[@class='product-name']")
    private List<WebElement> product;

    public ProductComparisonPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public List<WebElement> getProducts() {
        return product;
    }
}
