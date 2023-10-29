package Gun08;

//        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//          öncesinde de görünmediğini, sonrasında da göründüğünü
//          assert ile doğrulayınız.


import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class _03_Soru extends BaseDriver {

    @Test
    public void Test1()
    {
        driver.get("https://www.facebook.com/");

        MyFunc.Bekle(2);
        List<WebElement> cookiesAccept=driver.findElements(By.xpath("//button[text()='Allow all cookies']"));
        if (cookiesAccept.size() > 0)
            cookiesAccept.get(0).click();


        MyFunc.Bekle(2);
        WebElement btnYeniHesap=driver.findElement(By.linkText("Create new account"));
        btnYeniHesap.click();

        MyFunc.Bekle(2);
        WebElement firstname=driver.findElement(By.name("firstname"));
        firstname.sendKeys("ismet");

        MyFunc.Bekle(2);
        WebElement lastname=driver.findElement(By.name("lastname"));
        lastname.sendKeys("temur");

        MyFunc.Bekle(2);
        WebElement reEmail=driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(reEmail.isDisplayed(), "ReEmail gözüktü = ");

        MyFunc.Bekle(2);
        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("ismettemur@gmail.com");

        MyFunc.Bekle(2);
        Assert.assertTrue(reEmail.isDisplayed(), "ReEmail gözükmedi = ");


        WebElement webDay=driver.findElement(By.id("day"));
        WebElement webMonth=driver.findElement(By.id("month"));
        WebElement webYear=driver.findElement(By.id("year"));

        Select day=new Select(webDay);
        Select month=new Select(webMonth);
        Select year=new Select(webYear);

        day.selectByVisibleText("21");
        month.selectByValue("3");
        year.selectByVisibleText("1975");

        MyFunc.Bekle(3);
        BekleVeKapat();
    }

}
