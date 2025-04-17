package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    By signupLoginButton = By.xpath("//a[@href='/login']");
    By emailInput = By.xpath("//input[@data-qa='login-email']");
    By passwordInput = By.xpath("//input[@data-qa='login-password']");
    By loginButton = By.xpath("//button[@data-qa='login-button']");
    By loggedInText = By.xpath("//a[contains(text(),'Logged in as')]"); 
    By productsButton = By.xpath("//a[@href='/products']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignupLogin() {
        driver.findElement(signupLoginButton).click();
    }

    public void login(String email, String password) {
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public boolean isLoggedIn() {
        return driver.findElement(loggedInText).isDisplayed();
    }

    public void clickProducts() {
        driver.findElement(productsButton).click();
    }
}
