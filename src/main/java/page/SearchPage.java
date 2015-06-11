package page;

import org.openqa.selenium.By;

/**
 * Created by tykhon on 6/11/15.
 */
public class SearchPage extends BasePage{

    public void googleSearch(){
        driver.findElement(By.name("btnK"));

    }

}
