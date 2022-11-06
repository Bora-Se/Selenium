package aNevzat;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1_TXpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/Resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //
        driver.get("https://www.yves-rocher.com");


        driver.findElement(By.xpath("")).click(); // kita secme kutucugu
        driver.findElement(By.xpath("<span class=\"arrow\"></span>")).click(); // tik a tikladik
        //driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[1]/div[2]/div[4]/ul/li[34]")).click();
/*
        WebElement aramaKutusu= driver.findElement(By.className("desktopOldAutosuggestTheme-UyU36RyhCTcuRs_sXL9b"));
        aramaKutusu.sendKeys("Elektronik"+ Keys.ENTER);
        // yada +Keys.ENTER yerine driver.click; yazariz alt satirda

        WebElement artanFiyat= driver.findElement(By.className("desktop    voltran-container   sf-moria complete"));
        artanFiyat.click();

 */


    }
}
