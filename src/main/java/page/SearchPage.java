package page;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Search page is represents the google.ru page. It's needed to provide ability use a search feature
 * via framework.
 * <p>
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

    @FindBy(xpath = ".//*[@id='rso']/div[2]/li[1]/div/h3/a")
    private WebElement firstLink;

    /**
     * On the Search page input a text and click the search button. Also this function is for verify
     * that the 1st link from the search results contains: Kreditech - Digital Banking for Everyone
     *
     * @param text String parameter for the searching
     */
    public void clickSearchPage(String text) {
        searchField.sendKeys(text);
        logger.info("Input a " + text + " to the search field");
        logger.info("Wait until the page is fully loaded");
        setDelay(500);
        Assert.assertEquals("Kreditech - Digital Banking for Everyone", kreditoLink.getText());
        logger.info("Verify Kreditech - Digital Banking for Everyone is presented on the page.");
    }

    /**
     * Navigate to the 1st link from the search list by xpath on the google.ru page.
     */
    public void navigateToKreditechLink() {
        logger.info("Navigate to the " + firstLink.getAttribute("href"));
        driver.navigate().to(firstLink.getAttribute("href"));
        logger.info("Wait until navigation will be completed");
        setDelay(500);
    }
}