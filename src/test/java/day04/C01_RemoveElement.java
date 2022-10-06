package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_RemoveElement {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get( "https://the-internet.herokuapp.com/add_remove_elements/");
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
//tekrar kullanacaksam web elemente atarim eger kullanamyacaksam gerek yok
WebElement deleteButton=driver.findElement(By.xpath("//*[@class='added-manually']"));
if(deleteButton.isDisplayed()){
    System.out.println("test passed");
}else System.out.println("test failed");

driver.findElement(By.xpath("//*[text()='Add Element']"));
WebElement addRemoveElement=driver.findElement(By.xpath("//h3"));
if (addRemoveElement.isDisplayed()){
    System.out.println("test passed");
}else System.out.println("Failled");


/*
locate alirken
 */









    }

}
