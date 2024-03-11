package lecture11.homework11.priority;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority1 {

    //Task1:
    //     Создать отдельный пакет priority. В нем класс Priority1.
    //     В этом классе создать тесты a, b, c, d, e , f, g такого плана:

    @Test (priority = 7, dependsOnMethods = "b")
    public void a() {
        Assert.assertTrue(true);
    }

    @Test (priority = 6, dependsOnMethods = "c")
    public void b() {
        Assert.assertTrue(true);
    }

    @Test (priority = 5, dependsOnMethods = "d")
    public void c() {
        Assert.assertTrue(true);
    }

    @Test (priority = 4, dependsOnMethods = "e")
    public void d() {
        Assert.assertTrue(true);
    }

    @Test (priority = 3, dependsOnMethods = "f")
    public void e() {
        Assert.assertTrue(true);
    }

    @Test (priority = 2, dependsOnMethods = "g")
    public void f() {
        Assert.assertTrue(true);
    }

    @Test (priority = 1)
    public void g() {
        Assert.assertTrue(true);
    }
}
