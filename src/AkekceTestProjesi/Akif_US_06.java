package AkekceTestProjesi;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Akif_US_06 {

    @Test
    public void Test1() {
        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://www.akakce.com/");

        WebElement girisYap = driver.findElement(By.xpath("//div[@id='H_rl_v8']/a /following::a"));
        girisYap.click();
        Bekle(1);

        WebElement ePosta = driver.findElement(By.xpath("//*[@id='life']"));
        ePosta.sendKeys("abili@hotmail.com");
        Bekle(1);

        WebElement sifre = driver.findElement(By.xpath("//*[@id='lifp']"));
        sifre.sendKeys("Akif123.");
        Bekle(1);

        WebElement girisYap2 = driver.findElement(By.xpath("//*[@id='lfb']"));
        girisYap2.click();
        Bekle(1);


        WebElement profile = driver.findElement(By.xpath("//div[@id='HM_v8']//a"));
        profile.click();
        Bekle(1);

        WebElement mesajlarim = driver.findElement(By.xpath("//li[@class='order first']/a[2]"));
        mesajlarim.click();
        Bekle(1);

        WebElement messagebox = driver.findElement(By.xpath("//div[@class='wbb_v8']/p"));

        Assert.assertEquals("Listelenecek mesaj bulunamadı.", messagebox.getText());

    }


    public static void Bekle(int sn) {
        try {
            Thread.sleep(sn * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
