package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMetods {
    public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver",
  "src/resources/drivers/chromedriver.exe");
    WebDriver driver=new ChromeDriver();
//amazona gidelim
        driver.get("https://amazon.com");

        //sayfanin konumunu ve boyutrlatrini yazdirin
        System.out.println("pencere konumu "
                + driver.manage().window().getPosition());
        System.out.println("pencere olculueri "+ driver.manage().window().getSize());
//Sayfayi simge durumuna getirin
driver.manage().window().minimize();
//simge drumunda 3 saniye bekletip sayfayi maximize edin
Thread.sleep(5000);
driver.manage().window().maximize();
//sayfanin konumu ve boyutlRINI MAXIMIZE DURUMDA IKEN YAZDIRIN

 System.out.println("yeni oencere konumu "+ driver.manage().window().getPosition());
 System.out.println("yeni pencere olcusu "+ driver.manage().window().getSize());
//SAYFAYI FULSCREEN YAPIN
        Thread.sleep(5000);
  driver.manage().window().fullscreen();
 //SAYFASNIN KONUMU VE BOYUTLARINI FULLSCREAN KONUMUNDA IKEN Yazdirin
        Thread.sleep(3000);
        driver.close();












}}
