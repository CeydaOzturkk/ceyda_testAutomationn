package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    By commentBox = By.name("message");
    By placeOrderButton = By.xpath("//a[contains(text(),'Place Order')]");
    By nameOnCard = By.name("name_on_card");
    By cardNumber = By.name("card_number");
    By cvc = By.name("cvc");
    By expiryMonth = By.name("expiry_month");
    By expiryYear = By.name("expiry_year");
    By payAndConfirmOrderButton = By.id("submit");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterComment(String comment) {
        driver.findElement(commentBox).sendKeys(comment);
    }

    public void placeOrder() {
        driver.findElement(placeOrderButton).click();
    }

    public void enterPaymentDetails(String name, String number, String cvcCode, String month, String year) {
        driver.findElement(nameOnCard).sendKeys(name);
        driver.findElement(cardNumber).sendKeys(number);
        driver.findElement(cvc).sendKeys(cvcCode);
        driver.findElement(expiryMonth).sendKeys(month);
        driver.findElement(expiryYear).sendKeys(year);
    }

    public void clickPayAndConfirmOrder() {
        driver.findElement(payAndConfirmOrderButton).click();
    }
}
