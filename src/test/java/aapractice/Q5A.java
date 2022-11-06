package aapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q5A {


    /*.......Exercise5........
    1. Navigate to website https://testpages.herokuapp.com/styled/index.html
    2. Under the ORIGINAL CONTENTS
    3. click on Alerts
    4. print the URL
    5. navigate back
    6. print the URL
    7. Click on Basic Ajax
    8. print the URL
    9. enter value 20 and ENTER
    10. and then verify Submitted Values is displayed open page
    11. close driver   */
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://testpages.herokuapp.com/styled/index.html"); //1

        driver.findElement(By.xpath("//a[@id='alerts']")).click(); //2-3
        System.out.println(driver.getCurrentUrl()); //4
        Thread.sleep(1000);

        driver.navigate().back(); //5
        System.out.println(driver.getCurrentUrl()); //6
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@id='basicajax']")).click(); //7
        System.out.println(driver.getCurrentUrl()); //8
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("20"+ Keys.ENTER); //9
        Thread.sleep(1000);

        // 10. and then verify Submitted Values is displayed open page
        String expectedText = "Submitted Values";
        String actualText = driver.findElement(By.xpath("//p[text()='Submitted Values']")).getText();

        if (expectedText.equals(actualText)) System.out.println("Test Passed");
        else System.out.println("Test Failed");

        driver.close(); //11
    }
    }
