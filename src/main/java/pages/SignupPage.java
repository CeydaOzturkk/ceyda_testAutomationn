package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignupPage {

    WebDriver driver;

    // Constructor
    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    // Elementlerin locatorsleri
    By nameInput = By.xpath("//input[@data-qa='signup-name']");
    By emailInput = By.xpath("//input[@data-qa='signup-email']");
    By signupButton = By.xpath("//button[@data-qa='signup-button']");
    By emailError = By.xpath("//p[@data-qa='email-error']");
    By nameError = By.xpath("//input[@data-qa='signup-name']");
    
 
    By firstNameInput = By.xpath("//input[@data-qa='first-name']");
    By lastNameInput = By.xpath("//input[@data-qa='last-name']");
    By addressInput = By.xpath("//input[@data-qa='address']");
    By stateInput = By.xpath("//input[@data-qa='state']");
    By cityInput = By.xpath("//input[@data-qa='city']");
    By zipCodeInput = By.xpath("//input[@data-qa='zipcode']");
    By mobileInput = By.xpath("//input[@data-qa='mobile-number']");
    By createAccountButton = By.xpath("//button[@data-qa='create-account-button']");

    

    // Email format kontrolü ve hata mesajı kontrolü
    public void enterInvalidEmail(String invalidEmail) {
        driver.findElement(emailInput).sendKeys(invalidEmail);
    }

    public void checkEmailError(String expectedError) {
        WebElement error = driver.findElement(emailError);
        assert error.getText().contains(expectedError) : "Error message not displayed correctly";
    }

    // Name alanı için karakter sınırı kontrolü
    public void enterNameExceedingLimit(String name) {
        driver.findElement(nameInput).sendKeys(name);
        String enteredName = driver.findElement(nameInput).getAttribute("value");
        if (enteredName.length() > 30) {
            System.out.println("Name input exceeds the 30 character limit.");
        }
    }

    public void enterValidName(String name) {
        driver.findElement(nameInput).clear();
        driver.findElement(nameInput).sendKeys(name);
    }

    public void enterValidEmail(String email) {
        driver.findElement(emailInput).clear();
        driver.findElement(emailInput).sendKeys(email);
    }

    public void clickSignup() {
        driver.findElement(signupButton).click();
    }

    // Kayıt formunu doldurma
    public void enterFullRegistrationDetails(String firstName, String lastName, String address, 
                                              String state, String city, String zipCode, String mobile) {
        driver.findElement(firstNameInput).sendKeys(firstName);
        driver.findElement(lastNameInput).sendKeys(lastName);
        driver.findElement(addressInput).sendKeys(address);
        driver.findElement(stateInput).sendKeys(state);
        driver.findElement(cityInput).sendKeys(city);
        driver.findElement(zipCodeInput).sendKeys(zipCode);
        driver.findElement(mobileInput).sendKeys(mobile);
    }

    public void clickCreateAccount() {
        driver.findElement(createAccountButton).click();
    }
}
