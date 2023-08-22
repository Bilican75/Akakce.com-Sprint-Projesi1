package AkekceTestProjesi;

import Utilty.BaseDriver;
import Utilty.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Main_Test extends BaseDriver {

    @Test //Selim bey
    public void Register(){
        driver = new ChromeDriver();

        //Codu bu alana yazabiliriz

        BekleVeKapat();
    }

    @Test //Zeynep hanim
    public void Account_verification(){
        driver = new ChromeDriver();

        //Codu bu alana yazabiliriz

        BekleVeKapat();
    }

    @Test //Elife hanim
    public void Login(){
        driver = new ChromeDriver();

        //Codu bu alana yazabiliriz

        BekleVeKapat();
    }

    @Test //Osman bey
    public void Logout(){
        driver = new ChromeDriver();

        driver.get("https://www.akakce.com/");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        MyFunc.Bekle(2);

        WebElement girisYap = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        girisYap.click();
        MyFunc.Bekle(2);

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='life']"));
        inputEmail.sendKeys("grup16basarir@gmail.com");
        MyFunc.Bekle(2);

        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='lifp']"));
        inputPassword.sendKeys("1234567Ss");
        MyFunc.Bekle(2);

        WebElement girisYapTikla = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
        girisYapTikla.click();
        MyFunc.Bekle(2);

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        MyFunc.Bekle(2);

        WebElement hesapAd = driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(hesapAd).build();
        aksiyon.perform();
        MyFunc.Bekle(2);

        WebElement logOut = driver.findElement(By.xpath("//a[text()='Çık']"));
        logOut.click();
        MyFunc.Bekle(2);

        WebElement dogrulama = driver.findElement(By.xpath("(//div[contains(@id, 'v8')])[1]"));
        Assert.assertTrue(dogrulama.getText().contains("Giriş Yap"));

        BekleVeKapat();
    }

    @Test //Dilek hanim
    public void Check_order_list(){
        driver = new ChromeDriver();

        //Codu bu alana yazabiliriz

        BekleVeKapat();
    }

    @Test //Akif bey
    public void Check_message_box(){
        driver = new ChromeDriver();

        //Codu bu alana yazabiliriz

        BekleVeKapat();
    }

    @Test //Suleyman bey
    public void Delete_account(){
        driver = new ChromeDriver();

        //Codu bu alana yazabiliriz

        BekleVeKapat();
    }

}
