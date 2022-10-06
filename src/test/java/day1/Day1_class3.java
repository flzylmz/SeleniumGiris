package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_class3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        System.out.println(driver.getWindowHandle());
        //Arama sonucu;
        //CDwindow-8A4C5F7C76D6C141983EE2CAA8EF4976



        //getWindowHandle() : farkli pencerelerde gezinmemizi saglar

    }
}
