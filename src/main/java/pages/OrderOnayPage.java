package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class OrderOnayPage {

    WebDriver driver;

    By orderPlacedMessage = By.xpath("//*[contains(text(),'Your order has been placed successfully!')]");
    By downloadInvoiceButton = By.xpath("//a[contains(text(),'Download Invoice')]");

    public OrderOnayPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getOrderPlacedMessage() {
        return driver.findElement(orderPlacedMessage).getText();
    }

    public void clickDownloadInvoice() {
        driver.findElement(downloadInvoiceButton).click();
    }

    public boolean checkIfInvoiceDownloaded(String fileName) {
        String downloadPath = System.getProperty("user.home") + "/Downloads/" + fileName;
        File invoice = new File(downloadPath);
        return invoice.exists();
    }
}
