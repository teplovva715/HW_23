package ui;

import PO.RozetkaPO;
import org.testng.annotations.Test;
import util.PropertyReader;

public class PoTest extends BaseTest{
    clickOnCatalog catalogPo;

    @Test
    public void helloWorld(){
        driver,getClass ( PropertyReader.getValue ( "url" ) );
        rozetkaPO.clickOnCatalog();
        rozetkaPO.setSearchInput("HP");
        System.out.println (  );

        catalogPo = clickOnCatalog();
        catalogPo.HP

    }
}
