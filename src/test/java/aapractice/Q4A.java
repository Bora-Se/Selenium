package aapractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q4A {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

    driver.get("https://testpages.herokuapp.com/styled/index.html");

        driver.findElement(By.xpath("//a[@id='calculatetest']")).click();
        Thread.sleep(1000);
    WebElement simpleCalculatorYazisi = driver.findElement(By.xpath("//h1[text()='Simple Calculator']"));

        if (simpleCalculatorYazisi.isDisplayed()) System.out.println("Test Passed");
        else System.out.println("Test Failed");

        driver.findElement(By.xpath("//input[@id='number1']")).sendKeys("25");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='number2']")).sendKeys("15");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='calculate']")).click();
        Thread.sleep(1000);

    WebElement answerElementi1 = driver.findElement(By.xpath("//span[@id='answer']"));
        System.out.println("Sonuc : " + answerElementi1.getText());

    //**************2. Yontem**********************
    String answerElementi2 = driver.findElement(By.xpath("//span[@id='answer']")).getText();
        System.out.println("Sonuc : " + answerElementi2);

    //**************3. Yontem**********************
    int answerElementi3 = Integer.parseInt((driver.findElement(By.xpath("//span[@id='answer']")).getText()));
        System.out.println("Sonuc : " + answerElementi3);
}
}
