package AkakceTestProjesi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elif_Oz_03LoginAcma extends BaseDriver {
    @Test
    public void Test1(){
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.akakce.com/");

        WebElement girisYap=driver.findElement(By.xpath("//div[@id='H_v8']"));
        girisYap.click();

        WebElement inputEmail= driver.findElement(By.xpath("//input[@type='email']"));
        inputEmail.sendKeys("grup16basarir@gmail.com");

        WebElement inputsifre= driver.findElement(By.xpath("//div[@class='mode2']"));
        inputsifre.sendKeys("1234567Ss");

        WebElement butonTikla= driver.findElement(By.xpath("//input[@type='submit']"));
        butonTikla.click();





        MyFunc.Bekle(5);
    }
}
