package homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) {
        /*
        2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
(verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
URL'yi yazdırın.
*/

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com");
        if (driver.getTitle().contains("youtube")){
            System.out.println("tittle test passed");
        }else{
            System.out.println("tittle test failed");
            System.out.println(driver.getTitle());
        }
        if (driver.getCurrentUrl().contains("youtube")){
            System.out.println("url test passed");
        }else {
            System.out.println("url test failed");
            System.out.println(driver.getCurrentUrl());
        }
  /*
4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
5. Youtube sayfasina geri donun
6. Sayfayi yenileyin
7. Amazon sayfasina donun
8. Sayfayi tamsayfa yapin
9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
doğru başlığı(Actual Title) yazdırın.
10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
URL'yi yazdırın
11.Sayfayi kapatin
         */
        driver.get("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().back();
WebDriver driver1=new ChromeDriver();
driver1.get("https://www.amazon.com");
        driver1.manage().window().fullscreen();
        if (driver1.getTitle().contains("Amazon")){
            System.out.println("Amazon tittle passed");
        }else {
            System.out.println("Amazon test failed     "+driver1.getTitle());

        }
       String url="https://www.amazon.com";
        if (driver1.getCurrentUrl().equals(url)){
            System.out.println("amazon url test passed");
        }else {
            System.out.println("amazon url test failed"+driver1.getCurrentUrl());
        }
    }
}
