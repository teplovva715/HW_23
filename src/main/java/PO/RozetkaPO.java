package PO;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class RozetkaPO extends AbstractPO {

    @FindBy(id = "fat-menu")
    public WebElement catalog;

    @FindBy(xpath = "/html/body/app-root/div/div/rz-header/rz-main-header/header/div/div/a/picture/img")
    public WebElement searchInput;

    @FindAll ({
            @FindBy(css = "li[key='ahdroid']"),
            @FindBy(css = "li[key='ios']")
    } )

    @FindBys ({
            @FindBy(css = "li[key='ahdroid']"),
            @FindBy(css = "li[key='ios']")
    })
    public WebElement search2;

    public void clickOnCatalog(){
        catalog.click ();
    }

    public void setSearchInput(String value){
        searchInput.sendKeys ( value );
    }
}