package day2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;

public class C03_Manage_Metodlari {
    public static void main(String[] args) throws InterruptedException {
    /*
    Yeni bir Class olusturalim.C07_ManageWindowSet
Amazon soyfasina gidelim. https://www.amazon.com/
Sayfanin konumunu ve boyutlarini yazdirin
Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin
Sayfanin sizin istediginiz konum ve boyuta geldigini test edin
8. Sayfayi kapatin

     */
        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        //1.
        driver.get("https://amazon.com");
        //2
        System.out.println("Sayfanin konumu "+driver.manage().window().getPosition());
        System.out.println("Sayfanin boyutu "+ driver.manage().window().getSize());
        //3
        driver.manage().window().setPosition(new Point(20,20));
        driver.manage().window().setSize(new Dimension(600,300));
        //4
        System.out.println("Sayfanin yeni konumu "+driver.manage().window().getPosition());
        System.out.println("Sayfanin yeni  boyutu "+ driver.manage().window().getSize());
Thread.sleep(2000);













    }
}
