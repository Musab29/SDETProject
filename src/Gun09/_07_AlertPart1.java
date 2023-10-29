package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _07_AlertPart1 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        MyFunc.Bekle(3);

        WebElement clickMe1= driver.findElement(By.cssSelector("button[onclick='myAlertFunction()']"));
        clickMe1.click();

        MyFunc.Bekle(2);
        // alert açıldı.
        driver.switchTo().alert().accept();
        //alert kutusuna git ve OK ye bas. böylece kapanıyor.

        BekleVeKapat();
    }

}
