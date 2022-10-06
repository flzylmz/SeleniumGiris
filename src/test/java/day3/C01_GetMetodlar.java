package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_GetMetodlar {
    public static void main(String[] args) {

 /*Amazon sayfasina gidiniz
 Arama kutusunu locate ediniz
 Arama kutusunun tag name in input oldugunu test ediniz
 Arama kutusunun  name attribute in field-keywords   oldugunu test ediniz
 Sayfayi kapatin
  */
 System.setProperty("webdriver.chrome.driver",
  "src/resources/drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://www.amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
String exceptTagName="input";
String  actualName=aramaKutusu.getTagName();
if (actualName.equals(exceptTagName)){
    System.out.println("Tahname Testi Passed "+ actualName);
}else System.out.println("tagname failed");

String excepedAtributeName="field_keywords";
String actualAttributeName=aramaKutusu.getAttribute("name");
if (actualAttributeName.equals(excepedAtributeName)){
    System.out.println("Attribute passed");
}else System.out.println("atributte failed");









        }
}
