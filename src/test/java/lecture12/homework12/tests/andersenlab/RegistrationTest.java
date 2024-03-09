package lecture12.homework12.tests.andersenlab;

import lecture10.homework10.base.BaseTest;
import lecture10.homework10.pages.andersenlab.LoginPage;
import lecture12.homework12.pages.andersenlab.RegistrationPage;
import lecture12.homework12.utils.FakerUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegistrationTest extends BaseTest {

    private final String url = "https://qa-course-01.andersenlab.com/login";
    private final String siginURL = "https://qa-course-01.andersenlab.com/";

    @Test
    public void successRegistration() throws InterruptedException {

        FakerUtils fakerUtils = new FakerUtils();
        new LoginPage(getDriver())
                .load(url)
                .clickRegistrationButton()
                .typeRegistrationData(fakerUtils.generateRegistrationData())
                .chooseDateOfBirth(
                        fakerUtils.generateDOB()[0],
                        fakerUtils.generateDOB()[1],
                        fakerUtils.generateDOB()[2])
                .clickSubmitButton();

        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Assert.assertEquals(getDriver().getCurrentUrl(), siginURL);
    }
}
