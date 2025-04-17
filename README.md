EGEMSOFT OTOMASYON CASE ÇALIŞMASI

Bu proje, https://www.automationexercise.com sitesine ait temel kullanıcı senaryolarının otomasyon testlerini içermektedir. Testler Selenium, Cucumber, TestNG teknolojileri ile yazılmıştır.

Proje Yapısı

ceyda_testAutomationn/

    ├── src/

    │ ├── main/

    │ │ └── java/

    │ │ └── pages/ → Page Object sınıfları burada yer alır

    │ └── test/

    │ ├── java/

    │ │ ├── stepdefs/ → Step Definition sınıfları burada

    │ │ └── runners/ → Test Runner sınıfı burada

    │ └── resources/

    │ └── features/ → .feature dosyaları burada

    ├── pom.xml → Maven bağımlılıkları burada tanımlanır

    └── README.md → Proje açıklamaları (bu dosya)


Kullanılan Teknolojiler

    Java
    Selenium WebDriver
    Cucumber
    TestNG
    Maven
    Page Object Model (POM)

Teknolojilerin Versiyonları
    
    Java	17
    Maven	17
    Selenium WebDriver	4.19.1
    Cucumber JVM	7.14.0
    TestNG	7.9.0
    WebDriverManager	5.7.0
    ChromeDriver	

Kurulum ve Çalıştırma

    Projeyi Klonla
    git clone https://github.com/kullaniciAdi/ceyda_testAutomationn.git
    cd ceyda_testAutomationn

    Maven Bağımlılıklarını Yükle
    mvn clean install

    Testleri Çalıştır
    runners paketindeki TestRunner.java dosyasını çalıştırarak tüm testleri çalıştırabilirsin.

 TEST SENARYOLARI
 
 Kullanıcı Kaydı

    Geçersiz e-posta ile kayıt denemesi
    30 karakterden fazla ad ile kayıt denemesi
    Geçerli bilgilerle başarılı kayıt işlemi
    Kayıt sonrası hesap oluşturma ve başarı mesajı

Sipariş Oluşturma

    Giriş yaptıktan sonra ürün sepete ekleme
    Sepeti görüntüleme ve ödeme adımları
    Sipariş onayı
    Fatura indirme ve dosya kontrolü


    
 İletişim
ceydaozturk55@gmail.com
