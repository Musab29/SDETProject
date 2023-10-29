package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class _07_ActionRightClickTest extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/buttons");

        WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));
        MyFunc.Bekle(2);

        Actions aksiyonlar = new Actions(driver);
        Action aksyion = aksiyonlar.contextClick(btnRightClick).build();
        aksyion.perform();

        //aksiyonlar.moveToElement(btnRightClick).contextClick().build();
        BekleVeKapat();
    }


}
