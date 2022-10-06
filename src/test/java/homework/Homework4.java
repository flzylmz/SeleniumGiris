package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Homework4 {
    public static void main(String[] args) throws InterruptedException {
          /*
        1. Bir class oluşturun : AmazonSearchTest
2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
a.web sayfasına gidin. https://www.amazon.com/
b. Search(ara) “city bike”
c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
         */
        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2);
        driver.get("https://amazon.com");

        WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("city bike");
        WebElement button=driver.findElement(By.id("nav-search-submit-button"));
        button.click();
List<WebElement> sonucsayisi=driver.findElements(By.className("a-section a-spacing-small a-spacing-top-small"));

        System.out.println(sonucsayisi.get(0).getText());

List<WebElement> ilkResim=driver.findElements(By.className("s-image"));






    }
}
