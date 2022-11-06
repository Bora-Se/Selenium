package day03_webElements_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_webElementMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/Resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.clear();

        aramaKutusu.sendKeys("Java");

        System.out.println(aramaKutusu.getSize()); // (912, 38)  ; olcusu
        System.out.println(aramaKutusu.getTagName()); // input  ; ismi
        System.out.println(aramaKutusu.getAttribute("name")); //field-keywords
        aramaKutusu.getRect().getX(); //

        System.out.println(aramaKutusu.getText()); // kutucuktaki text i dondurur
        System.out.println(aramaKutusu.isDisplayed()); // true ; arama kutusu gorunuyormu?
        System.out.println(aramaKutusu.isEnabled()); // true ; erisilebiliyormu?
        aramaKutusu.isSelected(); // Radyo butonu ve checkbox larda bu buton kullanilir


        driver.close();
    }
}
