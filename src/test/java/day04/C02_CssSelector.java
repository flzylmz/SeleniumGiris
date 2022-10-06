package day04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_CssSelector {
    public static void main(String[] args) {
    // a. Verilen web sayfasına gidin.
    // http://a.testaddressbook.com/sign_in
       // b. Locate email textbox
        //        // c. Locate password textbox
        //        // d. Locate signin button
        //        //e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //        signButton.click();
        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("http://a.testaddressbook.com/sign_in");


    }
}
