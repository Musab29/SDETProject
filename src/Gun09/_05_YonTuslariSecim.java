package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class _05_YonTuslariSecim extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement txtBox = driver.findElement(By.id("autoCompleteSingleContainer"));
        MyFunc.Bekle(3);

        Actions aksyionDriver = new Actions(driver);

        // elemente git, içine tıklat ve "b" yi gönder
        aksyionDriver
                .moveToElement(txtBox)
                .click()
                .sendKeys("b")
                .build()
                .perform();

        MyFunc.Bekle(2);

        aksyionDriver
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();

        BekleVeKapat();
    }

}
