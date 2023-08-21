package AkekceTestProjesi;

import org.asynchttpclient.util.Assertions;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class selim_US_01 {
    @Test
    public void test01(){

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.akakce.com/");

        WebElement hesapAc= driver.findElement(By.xpath("//*[@id=\"H_rl_v8\"]/a[1]"));

        hesapAc.click();

        WebElement ad= driver.findElement(By.xpath("//input[@id='rnufn']"));
        ad.sendKeys("Selim");

        WebElement soyad=driver.findElement(By.xpath("//input[@id='rnufs']"));
        soyad.sendKeys("Yilmaz");

        WebElement email=driver.findElement(By.xpath("//input[@id='rnufe1']"));

        email.sendKeys("grup16basarir@gmail.com");

        WebElement emailT=driver.findElement(By.xpath("//input[@id='rnufe2']"));

        emailT.sendKeys("grup16basarir@gmail.com");

        WebElement sifre= driver.findElement(By.xpath("//input[@id='rnufp1']"));
        sifre.sendKeys("1234567Ss");

        WebElement sifreT= driver.findElement(By.xpath("//input[@id='rnufp2']"));
        sifreT.sendKeys("1234567Ss");

        WebElement cinsiyetE= driver.findElement(By.xpath("//input[@id='rngm']"));
        cinsiyetE.click();

        WebElement ilsec=driver.findElement(By.xpath("//*[@id='locpr']"));

        Select il=new Select(ilsec);
        il.selectByIndex(1);



        WebElement webGun=driver.findElement(By.xpath("//*[@id='bd']"));
        WebElement webAy=driver.findElement(By.xpath("//*[@id='bm']"));
        WebElement webYil=driver.findElement(By.xpath("//*[@id='by']"));

        Select day=new Select(webGun);
        Select month=new Select(webAy);
        Select year=new Select(webYil);

        day.selectByVisibleText("10");
        month.selectByValue("5");
        year.selectByVisibleText("1990");

        WebElement KullanimSoz= driver.findElement(By.xpath("//input[@id='rnufpca']"));
        KullanimSoz.click();

        WebElement BilgilendirmeButonu= driver.findElement(By.xpath("//input[@id='rnufnee']"));
        BilgilendirmeButonu.click();

        WebElement hesapacma=driver.findElement(By.xpath("//input[@id='rfb']"));
        hesapacma.click();






    }
}
