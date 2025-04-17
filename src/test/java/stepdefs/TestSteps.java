package stepdefs;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import utils.DriverManager;

public class TestSteps {

    WebDriver driver;

    @Given("Tarayıcı başlatılır")
    public void tarayici_baslatilir() {
        driver = DriverManager.getDriver();  //  chrome
        driver.get("https://www.automationexercise.com");
    }


}
