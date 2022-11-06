package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_Homework1 {
    public static void main(String[] args) throws InterruptedException {

    /*
    1.Yeni bir class olusturalim (Homework)
    2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
       oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
    3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i yazdirin.
    4.https://www.walmart.com/ sayfasina gidin.
    5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
    6. Tekrar “facebook” sayfasina donun
    7. Sayfayi yenileyin
    8. Sayfayi tam sayfa (maximize) yapin
    9.Browser’i kapatin
        System.setProperty("webdriver.chrome.driver","src/Resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
     */
        System.setProperty("webdriver.chrome.driver","src/Resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com"); //2

        if (driver.getTitle().contains("facebook")){
            System.out.println("Facebook Title : " + driver.getTitle());
        }else {
            System.out.println("Facebook Title is : " + driver.getTitle());
        }
        Thread.sleep(2000);


        if (driver.getCurrentUrl().contains("facebook")){ //3
            System.out.println("Facebook Url contains facebook");
        }else {
            System.out.println("Facebook URL: "+ driver.getCurrentUrl());
        }

        driver.get("https://www.walmart.com"); //4
        if (driver.getTitle().contains("Walmart.com")){
            System.out.println("Walmart Title : " + driver.getTitle());
        }else {
            System.out.println("Walmart Title is : " + driver.getTitle());
        }
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();

        driver.close();

    }
}
