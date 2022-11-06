package aapractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q2 {

    /*...Exercise2...
 1 - Driver olusturalim
 2 - Java class'imiza chromedriver.exe'yi tanitalim
 3 - Driver'in tum ekrani kaplamasini saglayalim
 4 - Driver'a sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini
     söyleyelim. Eger oncesinde sayfa yuklenirse, beklemeyi bıraksin.
 5 - "https://www.otto.de" adresine gidelim
 6 - Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
 7 - Title ve url'nin "OTTO" kelimesinin icerip icermedigini kontrol edelim
 8 - Ardindan "https://wisequarter.com/" adresine gidelim
 9 - Bu adresin basligini ve URL alalim ve "Quarter" kelimesini icerip icermedigini
     kontrol edelim
 10- Bir onceki web sayfamiza geri donelim
 11- Sayfayi yenileyelim
 12- Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
 13- En son adim olarak butun sayfalarimizi kapatmis olalim

     */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.otto.de");

        String actOttoTitle = driver.getTitle();
        System.out.println("actOttoTitle = " + actOttoTitle);

        String actOttoUrl = driver.getCurrentUrl();
        System.out.println("actOttoUrl = " + actOttoUrl);

        System.out.println("Bu sayfanin basligi: " + driver.getTitle());

        System.out.println("Bu sayfanin URL si: " + driver.getCurrentUrl());

        if (driver.getTitle().contains("OTTO")){
            System.out.println("Otto Title Test Passed ");
        }else {
            System.out.println("Otto Title Test Failed");
        }

        if (driver.getCurrentUrl().contains("otto"))
            System.out.println("Otto URL Test Passed");
        else
            System.out.println("Otto URL Test Failed ");



        driver.navigate().to("https://wisequarter.com");

        String actWiseTitle = driver.getTitle();
        System.out.println("actWiseTitle = " + actWiseTitle);

        if (driver.getTitle().contains("Quarter")){
            System.out.println("Sayfa basligi : " + driver.getTitle());
        }else {
            System.out.println("Sayfa basligi: " + driver.getTitle());
        }

        driver.navigate().back();
        driver.navigate().refresh();
        Thread.sleep(1000);
        driver.navigate().back();

        driver.quit();


    }
}
