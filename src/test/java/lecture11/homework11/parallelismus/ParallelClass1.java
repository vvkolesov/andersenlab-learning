package lecture11.homework11.parallelismus;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ParallelClass1 {

    //     Создать отдельный пакет parallelismus. В нем класс ParallelClass1.
    //     В котором  создать тесты parallel1, parallel2, parallel3, parallel4, parallel5.
    //     Создать класс ParallelClass2. В котором создать тесты parallel6, parallel7, parallel8, parallel9, parallel10.
    //     Тесты в классах должны быть следующего плана:

    @Test
    public void parallel1() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(true);
    }

    @Test
    public void parallel2() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(true);
    }

    @Test
    public void parallel3() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(true);
    }

    @Test
    public void parallel4() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(true);
    }

    @Test
    public void parallel5() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(true);
    }
}
