package stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.SignupPage;
import io.cucumber.java.en.*;

public class SignupTestSteps {

    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);
    SignupPage signupPage = new SignupPage(driver);



    @When("Kullanıcı Signup/Login butonuna tıklar")
    public void kullanıcı_signup_login_butonuna_tıklar() {
        loginPage.clickSignupLogin();
    }

    @When("Kullanıcı geçersiz bir e-posta adresi {string} girer")
    public void kullanıcı_gecersiz_bir_e_posta_adresi_girer(String email) {
        signupPage.enterInvalidEmail(email);
    }

    @Then("Email hatası kontrol edilir")
    public void email_hatası_kontrol_edilir() {
        signupPage.checkEmailError("Please enter a valid email address");
    }

    @When("Kullanıcı adını 30 karakteri aşacak şekilde {string} girer")
    public void kullanıcı_adını_30_karakteri_aşacak_şekilde_girer(String name) {
        signupPage.enterNameExceedingLimit(name);
    }

    @When("Kullanıcı doğru e-posta {string} ve doğru adı {string} girer")
    public void kullanıcı_doğru_e_posta_ve_doğru_adı_girer(String email, String name) {
        signupPage.enterValidEmail(email);
        signupPage.enterValidName(name);
    }

    @When("Kullanıcı Signup butonuna tıklar")
    public void kullanıcı_signup_butonuna_tıklar() {
        signupPage.clickSignup();
    }

    @When("Kullanıcı tüm kayıt bilgilerini doldurur")
    public void kullanıcı_tüm_kayıt_bilgilerini_doldurur() {
        signupPage.enterFullRegistrationDetails("Ceyda", "Öztürk", "Kadıköy, İstanbul", "İstanbul", "Kadıköy", "34740", "1234567890");
    }

    @When("Kullanıcı Create Account butonuna tıklar")
    public void kullanıcı_create_account_butonuna_tıklar() {
        signupPage.clickCreateAccount();
    }

    @Then("Kullanıcı başarıyla kaydolur")
    public void kullanıcı_başarıyla_kaydolur() {
        // Success message kontrolü yapılabilir
    }
}
