package lecture10.homework10.tests.automationpractice;

import lecture10.homework10.base.BaseTest;
import lecture10.homework10.pages.automationpractice.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class End2EndTest extends BaseTest {

//4)Написать программу, которая повторит действия на видео "Сценарий для автоматизации Лекция 10.mp4".

    private final String url = "http://www.automationpractice.pl/index.php";
    private final String firstItem = "Printed chiffon dress";
    private final String secondItem = "Faded Short";

    @Test
    public void end2EndTest() throws InterruptedException {

        HomePage homePage = new HomePage(getDriver())
                .load(url)
                .typeItemInSearchbar(firstItem)
                .clickSearchButton();

        StorePage storePage = new StorePage(getDriver())
                .changeToListView()
                .addToCompare()
                .goToWomenSection();

        homePage
                .typeItemInSearchbar(secondItem)
                .clickSearchButton();

        storePage
                .addToCompare()
                .goToComparisonPage();

        ProductComparisonPage productComparisonPage = new ProductComparisonPage(getDriver());
        Assert.assertEquals(productComparisonPage.getProducts().size(), 2);

    }
}
