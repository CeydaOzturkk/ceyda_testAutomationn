package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import io.cucumber.java.en.*;

public class AutomationSteps {

    WebDriver driver = new ChromeDriver();
    HomePage homePage = new HomePage(driver);

    @Given("Kullanıcı {string} sitesine gider")
    public void kullanici_siteye_gider(String url) {
        driver.get(url);
    }

    @When("Kullanıcı ana sayfada {string} butonuna tıklar")
    public void kullanici_ana_sayfada_butonuna_tiklar(String buttonName) {
        homePage.clickSignupLogin();
    }

  
}
