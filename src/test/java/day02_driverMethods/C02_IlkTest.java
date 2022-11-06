package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_IlkTest {
    public static void main(String[] args) {
        /*
        Gerekli ayarlamalari yapip amazon anasayfaya gidin
        1- sayfa basligi amazon kelimesi icermeli
        2- sayfa urlìnde "Amazon" kelimesi icermeli
         */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.com");

        String expectedTitleIcerik="amazon";
        String expectedUrlIcerik="Amazon";

        String actualUrl=driver.getCurrentUrl();
        String actualTitle=driver.getTitle();

        // url test yapalim

        if (actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Url Testi PASSED");

        }else {
            System.out.println("Url test FAILED");
            System.out.println("actual Url : " + actualUrl);
            System.out.println("Actual Url Aranan : " + expectedUrlIcerik + "kelimesini icermiyor");
        }

        // title test

        if (actualTitle.contains(expectedTitleIcerik)){
            System.out.println("Title Testi PASSED");

        }else {
            System.out.println("Title Testi FAILED");
            System.out.println("Actual Title : " + actualTitle);
            System.out.println("Actual Title Aranan : " + expectedTitleIcerik + "kelimesini icermiyor");
        }

        driver.close();
    }
}
