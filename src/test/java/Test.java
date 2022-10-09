import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Test {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        System.setProperty ( "webdriver.chrome.driver", System.setProperty (`"user dir") +"\\chromedriver.exe");
        driver = new ChromeDriver ( );
    }


    @org.testng.annotations.Test
    public void test(){
        String title = "Ноутбуки";
        String article = "Від дрогих до дешевих";


        driver.manage ().window ().maximize ();
        driver.manage ().timeouts ().implicitlyWait ( 10, TimeUnit.SECONDS );
        driver.get ( "https://rozetka.com.ua/ua/" );

        WebElement mainTitle = driver.findElement ( By.xpath ( "//*[@id=\"fat-menu\"]" ) );
        Assert.assertEquals(mainTitle.getText (), title);
        Assert.assertTrue ( driver.findElement ( By.xpath ( "//*[@id=\"fat-menu\"]" ) ).isDisplayed (), "element is not displayed" );

        driver.findElement ( By.xpath ( "//*[@id=\"fat-menu\"]" ) ).click ();

        Assert.assertEquals (driver.findElement ( By.xpath ("//*[@id=\"fat-menu\"]") ).getText (),article);

        WebDriverWait wait = new WebDriverWait ( driver,30);
        wait.until ( ExpectedCondition.visibilityOfElementLocated ( By.xpath ( "//*[@id=\"fat-menu\"]" ) ) );
        driver.manage ().timeouts ().pageLoadTimeout ( 5, TimeUnit.SECONDS );

    }

    @AfterMethod
    public void quit() {

    }
}

