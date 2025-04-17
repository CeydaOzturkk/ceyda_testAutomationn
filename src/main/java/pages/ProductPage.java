package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    By firstAddToCartButton = By.xpath("(//a[contains(text(),'Add to cart')])[1]");
    By continueShoppingButton = By.xpath("//button[contains(text(),'Continue Shopping')]");
    By viewCartButton = By.xpath("//a[@href='/view_cart']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addFirstProductToCart() {
        driver.findElement(firstAddToCartButton).click();
        driver.findElement(continueShoppingButton).click();
    }

    public void viewCart() {
        driver.findElement(viewCartButton).click();
    }
}
