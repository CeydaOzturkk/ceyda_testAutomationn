package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

  
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    
    By signupLoginButton = By.xpath("//a[@href='/login']");

 
    public void clickSignupLogin() {
        driver.findElement(signupLoginButton).click();
    }
}
