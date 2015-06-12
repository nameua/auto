package page;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tykhon on 6/11/15.
 */
public class SearchPage extends BasePage {

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(SearchPage.class);

    @FindBy(name = "q")
    private WebElement searchField;

    @FindBy(linkText = "Kreditech - Digital Banking for Everyone")
    private WebElement kreditoLink;

     public void clickSearchPage(String text) {
        searchField.sendKeys(text);
        logger.info("Input a "+text + " to the search field");
        //waitForLoad(driver);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.info("Wait until the page is fully loaded");
        Assert.assertEquals("Kreditech - Digital Banking for Everyone", kreditoLink.getText());
        logger.info("Verify Kreditech - Digital Banking for Everyone is presented on the page.");
    }

    public void navigateToKreditechLink(){
        driver.findElement(By.xpath(".//*[@id='rso']/div[2]/li[1]/div/h3/a")).getAttribute("data-href").toString();

        logger.info("link to site: " + driver.findElement(By.xpath(".//*[@id='rso']/div[2]/li[1]/div/h3/a")).getAttribute("data-href").toString());
        //driver.navigate().to();
        logger.info("Click a link: " + kreditoLink.getText().toString());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
