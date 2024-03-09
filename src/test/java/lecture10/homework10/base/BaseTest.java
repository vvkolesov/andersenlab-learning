package lecture10.homework10.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

public class BaseTest {

    private ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    private void setDriver(WebDriver driver) {
        this.driver.set(driver);
    }

    protected WebDriver getDriver() {
        return this.driver.get();
    }

    @BeforeMethod
    public void startDriver() {

        WebDriverManager.chromedriver().cachePath("web driver").setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        setDriver(driver);
    }

    @AfterMethod
    public void stopDriver() {
        getDriver().quit();
    }
}
