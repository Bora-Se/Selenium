package aapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q3 {
    /* ...Exercise3...
    go to url : https://www.techlistic.com/p/selenium-practice-form.html
    fill the firstname; Nevzat
    fill the lastname; Celik
    check the gender; Male e tikla
    check the experience; 7 yil tikla
    fill the date; tarihe 11-10-2022 yazalim
    choose your profession -> Automation Tester secelim
    choose your tool -> Selenium Webdriver
    choose your continent -> Antartica
    choose your command  -> Browser Commands
    click submit button  */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        //driver.findElement(By.name())    src/main/resources---

        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("//button[@id='ez-accept-all']")).click(); // cikan pencereyi acmak icin

        driver.findElement(By.xpath("//a[@id='cookieChoiceDismiss']"));
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nevzat" + Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Celik" + Keys.ENTER);


        WebElement genderRadioButton= driver.findElement(By.xpath("//input[@id='sex-0']")); // Gender
        genderRadioButton.click();

        genderRadioButton.sendKeys(Keys.PAGE_DOWN); // sectigimiz komuttan itibaren 1 sayfa asagi
        //driver.findElement(By.xpath("//input[@id='sex-0']")).click();

        driver.findElement(By.xpath("//input[@id='exp-6'")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("11.10.2022" + Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@class='input-xlarge']")).sendKeys("Europe"+Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//select[@id='selenium_commands']")).sendKeys("Browser Commands"+Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='btn btn-info]")).click(); //Button a basalim
        Thread.sleep(1000);
        driver.close();

        //driver.findElement(By.xpath("(//option[@style='margin: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px;'])[8]"));

        // Experience 7 yil //input[@id='exp-6']
        // Date //input[@id='datepicker']

        // //input[@id='profession-1']
        //input[@id='tool-2']
        // (//option[@style='margin: 0px; padding-bottom: 0px; padding-left: 0px; padding-right: 0px;'])[8]





    }
}