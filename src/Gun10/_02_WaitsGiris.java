package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

public class _02_WaitsGiris extends BaseDriver {
    // Thread.Sleep, ImplicitlyWait
    @Test
    public void Test1() throws InterruptedException {
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        // Verilen mühlet kadar locator daki elementi bulmaya çalıştı bulunca çıktı.

        WebElement btn = driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

        //WebElement msj=driver.findElement(By.id("demo"));
        //Thread.sleep(20000); // 20sn  gereksiz fazla bekleme yapıyor

        WebElement msj = driver.findElement(By.xpath("//p[text()='WebDriver']"));
        System.out.println("msj.getText() = " + msj.getText());

        MyFunc.Bekle(2);
        BekleVeKapat();
    }


}
