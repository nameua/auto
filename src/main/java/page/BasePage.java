package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Represents general methods and descriptions for all the pages.
 *
 * Created by tykhon on 6/11/15.
 */
public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver=driver;
    }

    /**
     * Provide ability to stop execution while the whole page will be loaded into the browser.
     *
     * @param driver - implementation that controls a Chrome browser running on the local machine.
     */
    //This method is for a waiting while the page will be fully loaded
    public void waitForLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
    }
}
