package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _07_JavaScriptClick extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.copado.com/robotic-testing");
        MyFunc.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor)driver;


        WebElement readStoryLink= driver.findElement(By.xpath("(//a[text()='Read Story'])[1]"));
        js.executeScript("arguments[0].scrollIntoView(true);", readStoryLink);

        // readStoryLink.click();  // üst menunun altına kaldığından sayfa üstünden tıklatamadı
        js.executeScript("arguments[0].click();", readStoryLink); // html içinde JavaScript kodu ile
        // tıklattık. ve çalıştı

        MyFunc.Bekle(3);
        BekleVeKapat();
    }
}