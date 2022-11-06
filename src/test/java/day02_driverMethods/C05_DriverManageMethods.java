package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_DriverManageMethods {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver","src/Resources/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        /*
        wait konusu ileride daha genis anlatilacak
        Implicitly wait aradigi elementleri bulmasi icin kendisine verdigimiz
        arastirma suresidir. O sure icinde aradigi elementi bulamazsa hata verir

         */

        driver.manage().window().fullscreen();
        System.out.println("Fullsecreen position : " + driver.manage().window().getPosition());
        System.out.println("Fullsecreen size : " + driver.manage().window().getSize());
        Thread.sleep(2000);

        driver.manage().window().maximize();
        System.out.println("maximize position : " + driver.manage().window().getPosition());
        System.out.println("maximize size : " + driver.manage().window().getSize());
        Thread.sleep(2000);

        driver.manage().window().minimize();
        System.out.println("minimize position : " + driver.manage().window().getPosition());
        System.out.println("minimize size : " + driver.manage().window().getSize());
        Thread.sleep(2000);


        driver.close();

        /*
         Fullsecreen position : (0, 0)
         Fullsecreen size : (1536, 864)
         maximize position : (-8, -8)
         maximize size : (1552, 840)
         minimize position : (9, 9)
         minimize size : (1051, 806)
         */

    }
}
