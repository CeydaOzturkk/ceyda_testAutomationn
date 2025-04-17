Feature: Automation Exercise Site Testleri
 
  Scenario: Kullanıcı Kaydı Oluşturma
  
  # Burda yanlış formatta e-mail girip uygun uyarı mesajının çıkıp çıkmadığının kontrol edilmesini hedefledim.
  
    Given Kullanıcı "https://www.automationexercise.com" sitesine gider
    When Kullanıcı Signup/Login butonuna tıklar
    And Kullanıcı geçersiz bir e-posta adresi "ceydagmail.com" girer
    Then Email hatası kontrol edilir

  Scenario: Kullanıcı 30 karakterden fazla ad girer  
   
  #burda maksimum karakter sayısını 30 olduğunu varsaydım ve bunun kontrolunu yapmayı hedefledim. 
  #Karakter sınırlaması gereksiz bellek tüketmemek için önemlidir ve veri girişi olan yerlerde kontrol edilmelidir.
   
    Given Kullanıcı "https://www.automationexercise.com" sitesine gider
    When Kullanıcı Signup/Login butonuna tıklar
    And Kullanıcı adını 30 karakteri aşacak şekilde "Ceyda Öztürk Ceyda Öztürk Ceyda" girer
    Then Name input exceeds the 30 character limit

  Scenario: Kullanıcı geçerli bilgilerle kayıt olur
    Given Kullanıcı "https://www.automationexercise.com" sitesine gider
    When Kullanıcı Signup/Login butonuna tıklar
    And Kullanıcı doğru e-posta "ceyda@gmail.com" ve doğru adı "Ceyda" girer
    And Kullanıcı Signup butonuna tıklar
    Then Kullanıcı kayıt sayfasına yönlendirilir

  Scenario: Kayıt işlemi başarıyla tamamlanır
    Given Kullanıcı "https://www.automationexercise.com" sitesine gider
    When Kullanıcı Signup/Login butonuna tıklar
    And Kullanıcı doğru e-posta "ceyda@gmail.com" ve doğru adı "Ceyda" girer
    And Kullanıcı Signup butonuna tıklar
    And Kullanıcı tüm kayıt bilgilerini doldurur
    And Kullanıcı Create Account butonuna tıklar
    Then Kullanıcı başarıyla kaydolur

  Scenario: Sipariş Oluşturma ve Fatura İndirme
    Given Kullanıcı siteye login olur
    When Bir ürün sepete ekler
    And Sepeti görüntüler ve ödeme sürecini başlatır
    And Ödeme bilgilerini girerek siparişi tamamlar
    Then "Order Placed!" mesajı görünür
    And Fatura indirilir ve 'invoice.txt' dosyasının indirildiği doğrulanır
