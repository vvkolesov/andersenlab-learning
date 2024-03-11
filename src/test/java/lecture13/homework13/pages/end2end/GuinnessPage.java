package lecture13.homework13.pages.end2end;

import lecture13.homework13.base.BasePage;
import lecture13.homework13.objects.UserRegistrationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class GuinnessPage extends BasePage {

    private final By lastNameField = By.xpath("//input[@name='LastName']");
    private final By firstNameField = By.xpath("//input[@name='FirstName']");
    private final By dateOfBirthDay = By.xpath("//input[@name='DateOfBirthDay']");
    private final By dateOfBirthMonth = By.xpath("//input[@name='DateOfBirthMonth']");
    private final By dateOfBirthYear = By.xpath("//input[@name='DateOfBirthYear']");
    private final By countrySelect = By.xpath("//select[@name='Country']");
    private final By stateField = By.xpath("//select[@name='State']");
    private final By emailField = By.xpath("//input[@name='EmailAddress']");
    private final By confirmEmailField = By.xpath("//input[@name='ConfirmEmailAddress']");
    private final By passwordField = By.xpath("//input[@name='Password']");
    private final By confirmPasswordField = By.xpath("//input[@name='ConfirmPassword']");
    private final By errorMessage = By.xpath("//span[@for='ConfirmPassword']");

    public GuinnessPage(WebDriver driver) {
        super(driver);
    }

    public void guinnessRegistration(UserRegistrationData userRegistrationData) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmEmailField));
        new Actions(driver)
                .sendKeys(driver.findElement(lastNameField), userRegistrationData.getLastName())
                .sendKeys(driver.findElement(firstNameField), userRegistrationData.getFirstName())
                .sendKeys(driver.findElement(dateOfBirthDay), userRegistrationData.getDateOfBirthDay())
                .sendKeys(driver.findElement(dateOfBirthMonth), userRegistrationData.getDateOfBirthMonth())
                .sendKeys(driver.findElement(dateOfBirthYear), userRegistrationData.getDateOfBirthYear())
                .sendKeys(driver.findElement(stateField), userRegistrationData.getState())
                .sendKeys(driver.findElement(emailField), userRegistrationData.getEmail())
                .sendKeys(driver.findElement(confirmEmailField), userRegistrationData.getEmail())
                .sendKeys(driver.findElement(passwordField), userRegistrationData.getPassword())
                .sendKeys(driver.findElement(confirmPasswordField), userRegistrationData.getPassword() + "123")
                .perform();
        new Select(driver.findElement(countrySelect))
                .selectByValue(userRegistrationData.getCountry().toUpperCase());
    }

    public String getErrorMessageText() {
        return driver.findElement(errorMessage).getText();
    }

}
