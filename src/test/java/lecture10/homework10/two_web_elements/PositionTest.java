package lecture10.homework10.two_web_elements;

import lecture10.homework10.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PositionTest {

    //3)Написать метод в параметры которого принимаются два ВебЭлемента.
    //метод выводит в консоль информацию какой из двух элементов располагается  выше на странице,
    //какой из элементов располагается левее на странице,
    //а также какой из элементов занимает большую площадь.
    //Параметры метода могут также включать в себя другие аргументы, если это необходимо.

    // we can change WebElements to By and add additional parameter - driver
    public void compare2WebElementsPosition(WebElement webElement1, WebElement webElement2) {

        String whatElementIsHigher =
                webElement1.getLocation().getY() > webElement2.getLocation().getY()
                        ? "Web element " + webElement2 + " is higher"
                        : webElement1.getLocation().getY() == webElement2.getLocation().getY()
                        ? "Web elements have the same Y coordinates"
                        : "Web element " + webElement1 + " is higher";
        //in some case it can look like webElement1.getAccessibleName() with less information but more readable

        String whatElementIsOnTheLeft =
                webElement1.getLocation().getX() > webElement2.getLocation().getX()
                        ? "Web element " + webElement2 + " is more to the left"
                        : webElement1.getLocation().getY() == webElement2.getLocation().getY()
                        ? "Web elements have the same X coordinates"
                        : "Web element " + webElement1 + " is more to the left";

        float webElement1Square = webElement1.getSize().height * webElement1.getSize().width;
        float webElement2Square = webElement2.getSize().height * webElement2.getSize().width;

        String whatElementIsBigger =
                webElement1Square > webElement2Square
                        ? "Web element " + webElement1 + " has bigger square"
                        : webElement1.getLocation().getY() == webElement2.getLocation().getY()
                        ? "Web elements have the same squares"
                        : "Web element " + webElement2 + " has bigger square";

        System.out.println(whatElementIsHigher + "\n" + whatElementIsOnTheLeft + "\n" + whatElementIsBigger);
    }
}
