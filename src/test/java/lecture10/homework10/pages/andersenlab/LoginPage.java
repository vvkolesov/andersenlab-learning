package lecture10.homework10.pages.andersenlab;

import lecture10.homework10.base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;

public class LoginPage extends BasePage {

    private final By emailField = By.xpath("//input[@name='email']");
    private final By passwordField = By.xpath("//input[@name='password']");
    private final By submitButton = By.xpath("//button[@type='submit']");
    private final By errorMessage = By.xpath("//span[contains(text(),'Required')]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage load(String url) {
        driver.get(url);
        return this;
    }

    public LoginPage typeCredential(String email, String password) {
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public LoginPage clickLoginButton() {
        driver.findElement(submitButton).click();
        return this;
    }

    public List<WebElement> errorMessages() {
        return driver.findElements(errorMessage);
    }
}
