package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework1 {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver",
                    "src/resources/drivers/chromedriver.exe");
            WebDriver driver=new ChromeDriver();

 /*

2.ChromeDriver kullanarak, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
yazdirin.
*/

        /*
4.https://www.walmart.com/ sayfasina gidin.
5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
6. Tekrar “facebook” sayfasina donun
7. Sayfayi yenileyin
8. Sayfayi tam sayfa (maximize) yapin
9.Browser’i kapatin
         */

            driver.get("https://www.facebook.com");
            if (driver.getTitle().contains("facebook")){
                System.out.println("tittle test passed");
            }else {
                System.out.println("driver.getTitle() = " + driver.getTitle());

                System.out.println("tittle test failed"+driver.getTitle());

            }

            if (driver.getCurrentUrl().contains("facebook")){
                System.out.println("url test passed");
            }else
            {
                System.out.println("url test failed");
                driver.getCurrentUrl();
            }
  driver.navigate().to("https://www.walmart.com");
            Thread.sleep(6000);
            System.out.println("------------");
            if (driver.getTitle().contains("Walmart.com")){
                System.out.println("tittle test passed");
            }else{
                System.out.println("tittle test failed");
            }
            driver.navigate().back();

            driver.close();



        }}
