package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _08_AlertPart2 extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");
        MyFunc.Bekle(3);

        WebElement clickMe2= driver.findElement(By.xpath("//*[@onclick='myConfirmFunction()']"));
        clickMe2.click();

        MyFunc.Bekle(2);
        // alert açıldı.
        driver.switchTo().alert().dismiss();
        //alert kutusuna git ve CANCEL a bas. böylece kapanıyor.

        BekleVeKapat();
    }

}
