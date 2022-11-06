package aBora;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumTT {
    public static void main(String[] args) {

        /*1-C01_TekrarTesti isimli bir class olusturun
        2- https://www.amazon.com/ adresine gidin
        3- Browseri tam sayfa yapin
        4-Sayfayi “refresh” yapin
        5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        6- Gift Cards sekmesine basin
        7- Birthday butonuna basin
        8- Best Seller bolumunden ilk urunu tiklayin
        9- Gift card details’den 25 $’i  secin
        10-Urun ucretinin 25$ oldugunu test edin
        11-Sayfayi kapatin
          */
        System.setProperty("webdriver.chrome.driver", "src/Resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1- C01_TekrarTesti isimli bir class olusturun-Yukarda olusturuldu

        //2- https://www.amazon.com/ adresine gidin
        driver.get("https://www.amazon.com");

        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();

        //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();

        //5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        if (driver.getTitle().contains("Spend less")) {
            System.out.println("Baslik, Spend less kelimelerini iceriyor, yani test PASSED");
        } else {
            System.out.println("Baslik, Spend less kelimelimeleri icermiyor, Test FAILED");
        }

        WebElement baslikText = driver.findElement(By.xpath(""));
    }
}