package lecture13.homework13.pages.end2end;

import lecture13.homework13.base.BasePage;
import lecture13.homework13.objects.UserRegistrationData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class GuinnessPage extends BasePage {

    @FindBy(xpath = "//input[@name='LastName']")
    private WebElement lastNameField;
    @FindBy(xpath = "//input[@name='FirstName']")
    private WebElement firstNameField;
    @FindBy(xpath = "//input[@name='DateOfBirthDay']")
    private WebElement dateOfBirthDay;
    @FindBy(xpath = "//input[@name='DateOfBirthMonth']")
    private WebElement dateOfBirthMonth;
    @FindBy(xpath = "//input[@name='DateOfBirthYear']")
    private WebElement dateOfBirthYear;
    @FindBy(xpath = "//select[@name='Country']")
    private WebElement countrySelect;
    @FindBy(xpath = "//select[@name='State']")
    private WebElement stateField;
    @FindBy(xpath = "//input[@name='EmailAddress']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@name='ConfirmEmailAddress']")
    private WebElement confirmEmailField;
    @FindBy(xpath = "//input[@name='Password']")
    private WebElement passwordField;
    @FindBy(xpath = "//input[@name='ConfirmPassword']" )
    private WebElement confirmPasswordField;
    @FindBy(xpath = "//span[@for='ConfirmPassword']")
    private WebElement errorMessage;

    public GuinnessPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void guinnessRegistration(UserRegistrationData userRegistrationData) {
       waitForVisibility(confirmEmailField);
        new Actions(driver)
                .sendKeys(lastNameField, userRegistrationData.getLastName())
                .sendKeys(firstNameField, userRegistrationData.getFirstName())
                .sendKeys(dateOfBirthDay, userRegistrationData.getDateOfBirthDay())
                .sendKeys(dateOfBirthMonth, userRegistrationData.getDateOfBirthMonth())
                .sendKeys(dateOfBirthYear, userRegistrationData.getDateOfBirthYear())
                .sendKeys(stateField, userRegistrationData.getState())
                .sendKeys(emailField, userRegistrationData.getEmail())
                .sendKeys(confirmEmailField, userRegistrationData.getEmail())
                .sendKeys(passwordField, userRegistrationData.getPassword())
                .sendKeys(confirmPasswordField, userRegistrationData.getPassword() + "123")
                .perform();
        new Select(countrySelect)
                .selectByValue(userRegistrationData.getCountry().toUpperCase());
    }

    public String getErrorMessageText() {
        return errorMessage.getText();
    }

}
