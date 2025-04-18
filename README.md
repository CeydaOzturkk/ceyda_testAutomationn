EGEMSOFT OTOMASYON CASE ÇALIŞMASI

Bu proje, https://www.automationexercise.com sitesine ait temel kullanıcı senaryolarının otomasyon testlerini içermektedir. Testler Selenium, Cucumber, TestNG teknolojileri ile yazılmıştır.

PROJE YAPISI

ceyda_testAutomationn
│
├── src
│   ├── main
│   │   └── java
│   └── test
│       └── java
│           ├── pages                    #POM

│           │   ├── CartPage.java           
│           │   ├── CheckoutPage.java       
│           │   ├── HomePage.java            
│           │   ├── LoginPage.java           
│           │   ├── OrderOnayPage.java       
│           │   ├── ProductPage.java         
│           │   ├── SignupPage.java 

│           │── utils
│           │       └── DriverManeger.java   # WebDriver yönetimi 
│           │

│           └── stepdefs                 # Cucumber Step Definition sınıfları
│               ├── AutomationSteps.java     
│               ├── OrderTestSteps.java      
│               ├── SignupTestSteps.java    
│               └── TestSteps.java           
│

├── resources
│   └── features
│       └── automationExercise.feature   # Cucumber test senaryoları
│

├── pom.xml                             #bağımlılıklar burada

└── README.md                           # Proje hakkında bilgiler ve açıklamalar



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
    runners paketindeki Runner.java dosyasını çalıştırarak tüm testleri çalıştırabilirsin.

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
