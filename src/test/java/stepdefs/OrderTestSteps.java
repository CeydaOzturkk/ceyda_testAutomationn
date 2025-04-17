package stepdefs;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.*;

public class OrderTestSteps {

    WebDriver driver;
    HomePage homePage;
    ProductPage productPage;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    OrderOnayPage orderOnayPage;

    @Given("Kullanıcı siteye login olur")
    public void kullanıcı_siteye_login_olur() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com");

        // Sayfa nesneleri
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        orderOnayPage = new OrderOnayPage(driver);

        homePage.clickSignupLogin();
        homePage.login("ceyda@example.com", "ceyda123");
        Assert.assertTrue(homePage.isLoggedIn(), "Kullanıcı login olamadı.");
    }

    @When("Bir ürün sepete ekler")
    public void bir_ürün_sepete_ekler() {
        homePage.clickProducts();
        productPage.addFirstProductToCart();
        productPage.viewCart();
    }

    @And("Sepeti görüntüler ve ödeme sürecini başlatır")
    public void sepeti_görüntüler_ve_ödeme_sürecini_başlatır() {
        cartPage.clickProceedToCheckout();
    }

    @And("Ödeme bilgilerini girerek siparişi tamamlar")
    public void ödeme_bilgilerini_girerek_siparişi_tamamlar() {
        checkoutPage.enterComment("Test siparişi.");
        checkoutPage.placeOrder();
        checkoutPage.enterPaymentDetails("Ceyda Öztürk", "1234567812345678", "123", "12", "2025");
        checkoutPage.clickPayAndConfirmOrder();
    }

    @Then("{string} mesajı görünür")
    public void mesajı_görünür(String expectedMessage) {
        String actualMessage = orderOnayPage.getOrderPlacedMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Beklenen mesaj görünmedi!");
    }

    @And("Fatura indirilir ve 'invoice.txt' dosyasının indirildiği doğrulanır")
    public void fatura_indirilir_ve_dosyanın_indirildiği_doğrulanır() {
        orderOnayPage.clickDownloadInvoice();

        boolean invoiceDownloaded = orderOnayPage.checkIfInvoiceDownloaded("invoice.txt");
        Assert.assertTrue(invoiceDownloaded, "'invoice.txt' dosyası indirilemedi!");
    }
}
