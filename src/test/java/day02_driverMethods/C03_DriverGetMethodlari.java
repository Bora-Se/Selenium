package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverGetMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        System.out.println(driver.getWindowHandle());
        // Bize acilan browserìn handle degerini alir
        // CDwindow-BF1762080AD1B01CC13E296873A1B9D6


        System.out.println(driver.getWindowHandles());

        // [CDwindow-0D0E88A92294608F88B928339D0035FC]
        /*

         */

        driver.get("https://www.amazon.com");
        System.out.println(driver.getPageSource());
        // web sayfasinin tum kaynak kodlarini döndurur


        driver.close();
    }

}
