package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Homework3 {  //1. Bir class oluşturun: LoginTest

    public static void main(String[] args) throws InterruptedException { // 2. Main method oluşturun ve aşağıdaki görevi tamamlayın.

            /*


f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
3. Sayfada kac tane link oldugunu bulun. */

System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//a. http://a.testaddressbook.com adresine gidiniz.
driver.get("http://a.testaddressbook.com");

 //b Sign in butonunua tiklayin
 WebElement signInButton =driver.findElement(By.id("sign-in"));
signInButton.sendKeys("arananEleman",Keys.ENTER);
Thread.sleep(2000);
signInButton.click();
//c. email textbox,password textbox,
// and signin button elementlerini locate ediniz..
WebElement  userName=driver.findElement(By.id("session_email"));//i. Username : testtechproed@gmail.com
WebElement password=driver.findElement(By.id("session_password"));//ii. Password : Test1234!
WebElement exceptedUser =driver.findElement(By.className("navbar-text"));
Thread.sleep(2000);
 userName.sendKeys("testtechproed@gmail.com");
Thread.sleep(2000);


password.sendKeys("Test1234!");
Thread.sleep(2000);
password.click();

//d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:



//e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
//dogrulama!!!
if (exceptedUser.isDisplayed()){
    System.out.println("excepted user test passed"+exceptedUser.getText());
    //web elementin ustundeki yaziyi konsolda yazdirabilmek icin get text metodu kullanilir

}else System.out.println("excepted user test failed");

//son kismi al;










        System.out.println("driver.findElement(By.linkText(\"a\")) = " + driver.findElement(By.linkText("a")));


    }
}
