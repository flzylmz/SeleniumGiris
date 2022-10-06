package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://amazon.com");
        //amazonda nutella aratalim
       WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella", Keys.ENTER);
/*
        //id uniqe oldugu icin sorunsuz calisir
        WebElement aramaKutusu2=driver.findElement(By.name("field-keywords"));
        aramaKutusu2.sendKeys("Nutella"+Keys.ENTER);
        //Uniqe oldugu icin sorunsuz calisir

        WebElement aramaKutusu3=driver.findElement(By.className(""));

   //bu locatar calismadi
   //locatar alirken gozumuzden kacan detaylar olabilir
   //aldigimiz bir locator calismazsa altarnatif locatorlar denemliyiz

 */

  driver.findElement(By.partialLinkText(""));
  driver.findElement(By.linkText(""));








    }
}
