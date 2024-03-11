package lecture13.homework13.pages.automationpractice;

import lecture13.homework13.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StorePage extends BasePage {

    @FindBy(id = "list")
    private WebElement listViewButton;
    @FindBy(xpath = "(//a[@class='add_to_compare'])[1]")
    private WebElement addToCompareButton;
    @FindBy(xpath = "//a[@title='Women']")
    private WebElement flyoutWomen;
    @FindBy(xpath = "//button/span[contains(text(),'Compare')]")
    private WebElement compareButton;

    public StorePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public StorePage changeToListView() {
        listViewButton.click();
        return this;
    }

    public StorePage addToCompare() {
        addToCompareButton.click();
        return this;
    }

    public StorePage goToWomenSection() {
        flyoutWomen.click();
        return this;
    }

    public StorePage goToComparisonPage() {
        compareButton.click();
        return this;
    }
}
