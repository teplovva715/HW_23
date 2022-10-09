package driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.PropertyReader;

import java.util.concurrent.TimeUnit;

public class DriverManager {
  private static WebDriver driver;

  public static void createDriver(){
    System.setProperty ( PropertyReader.getValue ( "name" ), PropertyReader.getValue ( "driverPath" ) );
    driver = new ChromeDriver (  );
    driver.manage ().timeouts ().implicitlyWait ( Integer.parseInt ( PropertyReader.getValue ( "timeout" ) ), TimeUnit.MILLISECONDS );
    driver.manage ().window ().maximize ();
  }

  public static WebDriver getDriver(){
    return driver;
  }
}
