package page.kreditechPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.BasePage;

/**
 * This is the representation of the kreditech.com page
 *
 * Created by tykhon on 6/12/15.
 */
public class LandingPage extends BasePage {

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(LandingPage.class);

    @FindBy(linkText = "Who we are")
    protected WebElement whoWeAre;

    /**
     * This emulated click by the who we are link on the kreditech.com page.
     */
    public void clickWhoWeAre() {
        logger.info("Switch to Landing page");
        whoWeAre.click();
        logger.info("Click the Who we are link");

        try {    Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
