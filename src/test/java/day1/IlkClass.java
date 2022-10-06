package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IlkClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
     driver.get("https://amazon.com");
     //driver.close();
        //Şuan bir sorun yok kaydıda tekrar izlersiniz bugün derste yaptıklarımızı kod sharing den paylaştım
        //Bir tekrar edersiniz
      if (driver.getPageSource().contains("sell")){
          System.out.println("pageSource test passed");
      } else{
          System.out.println("pagesource test failled");
      }


driver.close();

    }
}
