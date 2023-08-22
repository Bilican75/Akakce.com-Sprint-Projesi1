import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Zeynep_US_02 {
    @Test

    public void Test3() throws InterruptedException {


        WebDriver driver= new ChromeDriver();

        driver.get("https://www.akakce.com/");

        WebElement hesapLogin=driver.findElement(By.xpath("//a[text()='Giriş Yap']"));
        hesapLogin.click();

        WebElement emailGiris=driver.findElement(By.xpath("//input[@id=\"life\"]"));
        emailGiris.sendKeys("grup16basarir@gmail.com");

        WebElement sifre= driver.findElement(By.xpath("//input[@id=\"lifp\"]"));
        sifre.sendKeys("1234567Ss");

        WebElement girisYap= driver.findElement(By.xpath("  //input[@id=\"lfb\"]"));
       girisYap.click();

        Thread.sleep(3000l);

        WebElement hesabim= driver.findElement(By.xpath("//div[@id='HM_v8']"));
        //System.out.println(hesabim.getText());

        hesabim.getText().contains("Selim");



}
}