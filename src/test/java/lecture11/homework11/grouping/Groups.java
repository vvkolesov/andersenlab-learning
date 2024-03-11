package lecture11.homework11.grouping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groups {

    //Task2:
    //     Создать отдельный пакет grouping. В нем класс Groups.
    //     В этом классе создать тесты one, two, three, four, five, six, seven, eight такого плана:

    @Test(priority = 1, groups = "first")
    public void one() {
        Assert.assertTrue(true);
    }

    @Test(priority = 1, groups = "second")
    public void two() {
        Assert.assertTrue(true);
    }

    @Test(priority = 2, groups = "first")
    public void three() {
        Assert.assertTrue(true);
    }

    @Test(priority = 2, groups = "second")
    public void four() {
        Assert.assertTrue(true);
    }

    @Test(priority = 3, groups = "first")
    public void five() {
        Assert.assertTrue(true);
    }

    @Test(priority = 3, groups = "second")
    public void six() {
        Assert.assertTrue(true);
    }

    @Test(priority = 4, groups = "first")
    public void seven() {
        Assert.assertTrue(true);
    }

    @Test(priority = 4, groups = "second")
    public void  eight() {
        Assert.assertTrue(true);
    }
}
