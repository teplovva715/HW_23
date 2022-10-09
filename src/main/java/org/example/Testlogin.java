package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
@Test
public class Testlogin {

    public void wikiMainPage(WebDriver driver) {

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds (10));
        driver.manage ().window ().maximize ();
        driver.get ( "https://rozetka.com.ua/ua/" );

        String title = driver.findElement ( By.xpath ( "/html/body/app-root/div/div/rz-main-page")).getText ();
        driver.close ();

        Assert.assertEquals ("Ласкаво просимо до вікіпедії,", title);
    }
}
