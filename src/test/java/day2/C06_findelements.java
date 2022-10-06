package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class C06_findelements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //Amazon sayfasina gidiniz
driver.get("https://amazon.com");
//Amazon sayfasindaki taglarin sayisini bulunuz
        List<WebElement> tag=driver.findElements(By.tagName("a"));
        System.out.println("a taginin sayisi "+tag.size());

   //     System.out.println(driver.findElement(By.xpath("")).getText());



    }
}
