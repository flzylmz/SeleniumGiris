package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMetods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        //Sayfayi maximaze edin
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    /*

    ileride wait konusunu daha genis olarak ele alacagiz

    bir sayfa acilirken ilk basta sayfanin icerisinde bulunan elementlere gore
    bir yukleme suresine ihtiysc vardir.

    Bir web elementin kullanilamasi icin zamana ihtiyac olabilir
    implicitywait bize sayfsnin yuklenmesi ve sayfadaki elementlere ulasim icin
    beklenecek maximum sureyi belirleme olanagi verir
     */

    driver.close();



    }
}
