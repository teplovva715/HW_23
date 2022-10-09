package PO;

import driver.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class AbstractPO {
    public AbstractPO(){
        PageFactory.initElements ( DriverManager.getDriver(), this);
    }
}
