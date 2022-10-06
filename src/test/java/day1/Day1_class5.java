package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_class5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://amazon.com");
        //navigate.to metodu sayfada ileri geri yapacaksak kullanilir
        driver.navigate().to("https://techproeducation.com");
        //drive.get ile istedigimiz sayfaya gidiyoruz
        Thread.sleep(3000);
        driver.navigate().back();//bir onceki sayfaya geri doner

        Thread.sleep(3000);
        driver.navigate().forward();//ilk sayfadan ileriye gider

        Thread.sleep(3000);
        driver.navigate().refresh();//sayfayi yeniler
        //son olarak sayfayi kaopatiniz
        driver.close();











    }

}
