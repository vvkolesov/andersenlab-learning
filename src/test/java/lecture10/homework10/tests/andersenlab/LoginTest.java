package lecture10.homework10.tests.andersenlab;

import lecture10.homework10.base.BaseTest;
import lecture10.homework10.pages.andersenlab.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    //1)Автоматизируйте по два тест-кейса из каждого модуля, которые вы писали для предыдущего домашнего задания.

    private final String url = "https://qa-course-01.andersenlab.com/login";
    private final String email = "email@email.nl";
    private final String password = "password";

    @Test
    public void loginWithCorrectCredentials() {

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.load(url)
                .typeCredential(email, password)
                .clickLoginButton();
    }

    @Test
    public void loginWithEmptyForm() {

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.load(url)
                .clickLoginButton();
        Assert.assertEquals(loginPage.errorMessages().size(), 2);
    }
}
