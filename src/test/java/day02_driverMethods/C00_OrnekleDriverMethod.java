package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C00_OrnekleDriverMethod {

        // Her zamanki gibi main methodumuzu calistiralim!!!
        public static void main(String[] args) throws InterruptedException {
        /* 1. Yeni bir class olusturun (TekrarTesti)---- (Clasimizi olusturduk...)
        2. Youtube web sayfasına gidin ve sayfa başlığının "youtube" olup olmadığını doğrulayın (verify), eğer değilse
        doğru başlığı(Actual Title) konsolda yazdirin.
        3. Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        5. Youtube sayfasina geri donun
        6. Sayfayi yenileyin
        7. Amazon sayfasina donun
        8. Sayfayi tamsayfa yapin
        9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.
        10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
        11.Sayfayi kapatin  */

            // Once, Selenium icin ilgili arayuzu(System.SetProperty ile) ve ChromeDriver methodunu olusturalim
            System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
            WebDriver driver=new ChromeDriver(); // ChromeDriver() i, WebDriver methodundan alarak olustuyoruz

            // 2. Youtube web sayfasına gidin
            driver.get("https://www.youtube.com"); //

            //Youtube" olup olmadığını doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

            if (driver.getTitle().contains("youtube")) {
                System.out.println("This title contains of : "+ driver.getTitle() );
            }else {System.out.println("Actual title :"+ driver.getTitle());}
            Thread.sleep(2000); // Sayfalar arasi gecisleri gormek icin aralara 2 saniye bekleme suresi

            // 3. Sayfa URL'sinin "youtube" içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
            if (driver.getCurrentUrl().contains("youtube")) {
                System.out.println("This Url contains of :"+driver.getCurrentUrl());
            }else {System.out.println("Actual URL: "+driver.getCurrentUrl());}

            //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
            driver.navigate().to("https://www.amazon.com/");
            Thread.sleep(2000);
            //5. Youtube sayfasina geri donun
            driver.navigate().back(); // driverimizi navigate ile back yaparak 1 geri gitme islemi yapiyoruz
            Thread.sleep(2000);

            // 6. Sayfayi yenileyin
            driver.navigate().refresh(); // driverimizi navigate ile refresh yaparak sayfayi yeniliyoruz
            Thread.sleep(2000);

            //7. Amazon sayfasina donun
            driver.navigate().forward(); // driverimizi forward ile bir ileri sayfaya gitmek icin kullaniyoruz
            Thread.sleep(2000);
        /* eger ki bir geri islemi gerceklestirdiysek (back ile) sonrasinda forward ile bir ileri giderek bir onceki
        sayfaya ulasmis oluruz.Yoksa baska bir sayfaya driver.navigate.to(url:"https://") ile gideriz. */

            // 8. Sayfayi tamsayfa yapin
            driver.manage().window().maximize();
            Thread.sleep(2000);

            //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın,
            // Yoksa doğru başlığı(Actual Title) yazdırın.
            if (driver.getTitle().contains("Amazon")) {
                System.out.println("This site contains of :"+ driver.getTitle());
            } else {System.out.println("Actual title :"+driver.getTitle());}

            // 10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın
            if (driver.getCurrentUrl().contains("https://www.amazon.com/")) {
                System.out.println("Sayfa URL: " +driver.getCurrentUrl());
            } else {System.out.println("Actual URL : "+driver.getCurrentUrl());;}

            //11.Sayfayi kapatin
            driver.close();
        /* Iki sekilde; 1-driver.close(); ile kullanilan pencereyi ya da,
                        2-driver.quit(); ile ilişkili tüm pencereleri kapatarak sürücüden çıkabiliriz.*/
        }
    }

