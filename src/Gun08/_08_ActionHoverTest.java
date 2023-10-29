package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class _08_ActionHoverTest extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://www.hepsiburada.com/");

        WebElement element = driver.findElement(By.xpath("//span[text()='Moda']"));
        MyFunc.Bekle(2);

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon= aksiyonlar.moveToElement(element).build(); // element in üzerine gel
        aksiyon.perform(); // etkinleştir.

        MyFunc.Bekle(2);
        BekleVeKapat();
    }



}
