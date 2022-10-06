package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class homeworkxpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
//a.web sayfasına gidin. https://www.amazon.com
     driver.get("https://www.cimri.com");
     //b. Search(ara) “bisiklet " yazdirin
  //    WebElement aranacakKelime=driver.findElement(By.xpath("//*[@type='text']"));
        WebElement aranacak=driver.findElement(By.xpath("//*[@class='s17vz787-2 gELcmC']"));
     //   WebElement aranacakKelime=driver.findElement(By.name("search-bar"));
    //    aranacakKelime.sendKeys("city bike", Keys.ENTER);
        //    aranacakKelime.click();
        aranacak.sendKeys("bisiklet",Keys.ENTER);
//c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın

        WebElement aramaSonucu=driver.findElement(By.xpath("//*[@class='s1tg1k8o-5 lisaly']"));
        System.out.println("aramaSonucu.getText() = " + aramaSonucu.getText());
        String [] arr=aramaSonucu.getText().split(" ");

       Arrays.stream(arr).limit(1).forEach(System.out::println);

        //ilk resme tiklamak icin
         WebElement ilkResim = driver.findElement(By.xpath("//*[@class='link-detail']"));
         ilkResim.click();








//d. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
    }
}
