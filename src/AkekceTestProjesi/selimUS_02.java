package AkekceTestProjesi;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selimUS_02 {
    @Test
    public void test(){

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.akakce.com/");

        WebElement girisYap= driver.findElement(By.xpath("//*[@id=\"H_rl_v8\"]/a[2]"));
        girisYap.click();

        WebElement Eposta= driver.findElement(By.xpath("//input[@id='life']"));
        Eposta.sendKeys("grup16basarir@gmail.com");

        WebElement sifre= driver.findElement(By.xpath("//input[@id='lifp']"));
        sifre.sendKeys("1234567Ss");

        WebElement beniHatirla= driver.findElement(By.xpath("//input[@id='lifr']"));
        beniHatirla.click();

        WebElement GirisYap= driver.findElement(By.xpath("//input[@id='lfb']"));
        GirisYap.click();

        WebElement actualText= driver.findElement(By.xpath("//*[text()='Akakçe ile En Ucuzu Keşfet!']"));

        String actualYazi= actualText.getText();

        String expectedText="Akakçe ile En Ucuzu Keşfet!\n";

        Assert.assertTrue(actualYazi.contains(expectedText));
























    }
}
