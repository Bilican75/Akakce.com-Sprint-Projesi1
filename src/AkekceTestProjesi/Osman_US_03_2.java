package AkekceTestProjesi;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Osman_US_03_2 {
    @Test
    public void Test1() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.akakce.com/");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Bekle(2);

        WebElement girisYap = driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        girisYap.click();
        Bekle(2);

        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='life']"));
        inputEmail.sendKeys("grup16basarir@gmail.com");
        Bekle(2);

        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='lifp']"));
        inputPassword.sendKeys("1234567Ss");
        Bekle(2);

        WebElement girisYapTikla = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
        girisYapTikla.click();
        Bekle(2);

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        Bekle(2);

        WebElement hesapAd = driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
        Actions aksiyonlar = new Actions(driver);
        Action aksiyon = aksiyonlar.moveToElement(hesapAd).build();
        aksiyon.perform();
        Bekle(3);

        WebElement logOut = driver.findElement(By.xpath("//a[text()='Çık']"));
        logOut.click();
        Bekle(2);

        WebElement dogrulama = driver.findElement(By.xpath("(//div[contains(@id, 'v8')])[1]"));
        Assert.assertTrue(dogrulama.getText().contains("Giriş Yap"));


        driver.quit();

    }
    public static void Bekle(int sn){

        try {
            Thread.sleep(sn*1000l);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
