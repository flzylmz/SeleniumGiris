package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_tekrar {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver",
                    "src/resources/drivers/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
//Amazon sayfasina gidelim

    driver.get("https://amazon.com");
        System.out.println("sayfa basligi " +driver.getTitle());
//sayfanin basliginin "Amazon icerdigini test edin
        String actualURL= driver.getTitle();
        String istenenKelime="Amazon";
        if (actualURL.contains(istenenKelime)){
            System.out.println("tittle test passed");
        }else{
            System.out.println("tittle test falied");
        }
        //Sayfsanin adresini yazdirin
        System.out.println("sayfanin URL si : "+driver.getCurrentUrl());

        //url nin amazon icerip icermedigini test edin
        String actuarly1=driver.getCurrentUrl();
        String arananKelime="amazon";
        if (actualURL.contains(arananKelime)){
            System.out.println("url testi  passed");
        }else{
            System.out.println("url testi failed");
        }
//Sayfa handle degerlerinin yazdirin
        System.out.println("handle degeri " +driver.getWindowHandle());
//Sayfanin HtMl kodlarinda "Gateway" kelimesinin gectigini kontrol edin
  String actualPageSource=driver.getPageSource();
  String htmlArananKelime="Gateway";
  if (actualPageSource.contains(htmlArananKelime)){
      System.out.println("Sourcecode test passed");
  }else
  {
      System.out.println("Sourcetest failed");
  }
driver.close();






}}
