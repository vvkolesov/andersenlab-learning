package lecture11.homework11.data_providing.tests;

import lecture13.homework13.base.BaseTest;
import lecture13.homework13.pages.andersenlab.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    //Task4:
    //     Заранее создать трех пользователей для нашего сайта.
    //     Написать тест используя @DataProvider который будет проверять логин этих трех пользователей.

    //Task5:
    //     Решить предыдущую задачу используя аннотацию @Parameters.
    //     А также создать для работы с данным тестом дополнительный xml файл testngParametersHome.xml.

    private final String url = "https://qa-course-01.andersenlab.com/login";

    @Test
    @Parameters({"email", "password"})
    public void loginWithCorrectCredentialsParametrize(String email, String password) {

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.load(url)
                .typeCredential(email, password)
                .clickLoginButton();
        Assert.assertEquals(loginPage.nextPageChecker(), email);
    }

    @Test(dataProvider = "userCredentials")
    public void loginWithCorrectCredentials(String email, String password) throws InterruptedException {

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.load(url)
                .typeCredential(email, password)
                .clickLoginButton();
        Assert.assertEquals(loginPage.nextPageChecker(), email);
    }

    @DataProvider(name = "userCredentials")
    public String[][] userCredentials() {
        return new String[][] {
                {"email@email.nl", "password"},
                {"email@email.kz", "password"},
                {"email@email.be", "password"}
        };
    }
}
