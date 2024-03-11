package lecture13.homework13.pages.andersenlab;

import lecture13.homework13.base.BasePage;
import lecture13.homework13.objects.UserRegistrationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage {

    private final By firstNameField = By.xpath("//input[@name='firstName']");
    private final By lastNameField = By.xpath("//input[@name='lastName']");
    private final By dateOfBirthField = By.xpath("//input[@name='dateOfBirth']");
    private final By emailField = By.xpath("//input[@name='email']");
    private final By passwordField = By.xpath("//input[@name='password']");
    private final By confirmPasswordField = By.xpath("//input[@name='passwordConfirmation']");
    private final By datePicket = By.xpath("//div[@class='react-datepicker__month-container']");
    private final By submitButton = By.xpath("//button");
    private final By yearDatePicker = By.xpath("//select[1]");
    private final By monthDatePicker = By.xpath("//select[2]");

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public RegistrationPage typeRegistrationData(UserRegistrationData userRegistrationData) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameField))
                .sendKeys(userRegistrationData.getFirstName());
        driver.findElement(lastNameField).sendKeys(userRegistrationData.getLastName());
        driver.findElement(emailField).sendKeys(userRegistrationData.getEmail());
        driver.findElement(passwordField).sendKeys(userRegistrationData.getPassword());
        driver.findElement(confirmPasswordField).sendKeys(userRegistrationData.getPassword());
        return this;
    }

    public RegistrationPage chooseDateOfBirth(String month, String year, String day) {
        driver.findElement(dateOfBirthField).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(datePicket));
        new Select(driver.findElement(monthDatePicker)).selectByValue(month);
        new Select(driver.findElement(yearDatePicker)).selectByValue(year);

        driver.findElement(By.xpath("//div[contains(text(), '" + day + "')]")).click();
        return this;
    }

    public RegistrationPage clickSubmitButton() {
        wait.until(ExpectedConditions.elementToBeClickable(submitButton)).click();
        return this;
    }
}
