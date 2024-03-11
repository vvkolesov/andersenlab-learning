package lecture13.homework13.tests.andersenlab;

import lecture13.homework13.base.BaseTest;
import lecture13.homework13.pages.andersenlab.LoginPage;
import lecture13.homework13.utils.FakerUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class RegistrationTest extends BaseTest {

    //3.	Необходимо автоматизировать сценарий, который показан на видео “Сценарий для автоматизации Лекция 12ч2.mp4.
    // https://qa-course-01.andersenlab.com/registration

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
