package lecture10.homework10.tests.five_pages;

import lecture10.homework10.base.BaseTest;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FivePagesTest extends BaseTest {

//    2)Написать программу, которая будет открывать пять различных страниц в новых окнах:
//    http://www.automationpractice.pl/index.php
//    https://zoo.waw.pl/
//    https://www.w3schools.com/
//    https://www.clickspeedtester.com/click-counter/
//    https://andersenlab.com/
//    Прописать цикл, который будет переключаться поочередно через все страницы,
//    для каждой страницы выводить в консоль название и ссылку на эту страницу.
//    И будет закрывать ту страницу в названии которой есть слово "Zoo".

    private final String page1 = "http://www.automationpractice.pl/index.php";
    private final String page2 = "https://zoo.waw.pl/";
    private final String page3 = "https://www.w3schools.com/";
    private final String page4 = "https://www.clickspeedtester.com/click-counter/";
    private final String page5 = "https://andersenlab.com/";

    @Test
    public void fivePages() throws InterruptedException {
        List<String> webPages = new ArrayList<>();
        webPages = Stream.of(page1, page2, page3, page4, page5)
                .toList();
        String pageName = getDriver().getWindowHandle();

        for (String page : webPages) {
            getDriver().switchTo().newWindow(WindowType.TAB).get(page);
            if (getDriver().getTitle().contains("Zoo Warszawa")) {
                pageName = getDriver().getWindowHandle();
            }
            System.out.println(getDriver().getTitle() + " url is: " + page);
        }
        getDriver().switchTo().window(pageName).close();
        Thread.sleep(5000);
    }
}
