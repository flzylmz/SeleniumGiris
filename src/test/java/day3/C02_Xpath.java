package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) throws InterruptedException {

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin  2- Add Element butonuna basin
        //Delete butonu’nun gorunur oldugunu test edin
        //Delete tusuna basin
        //“Add/Remove Elements” yazisinin gorunur oldugunu test edin
        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);
        ////*[text ='addElement']

    }
}
