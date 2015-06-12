package page;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by tykhon on 6/11/15.
 */
public class SearchPage extends BasePage {

    private static Logger logger = Logger.getLogger(SearchPage.class);

    @FindBy(name = "q")
    private WebElement searchField;

    @FindBy(linkText = "Kreditech - Digital Banking for Everyone")
    private WebElement kreditoLink;

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void clickSearchPage(String text) {
        searchField.sendKeys(text);
        waitForLoad(driver);
        Assert.assertEquals("Kreditech - Digital Banking for Everyone", kreditoLink.getText());
    }

}
