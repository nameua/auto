package page.kreditechPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.BasePage;

/**
 * This is the representation of the kreditech.com/who-we-are/ page
 *
 * Created by tykhon on 6/16/15.
 */
public class WhoWeArePage extends BasePage {

    public WhoWeArePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (linkText = "What we do")
    private WebElement whatWeDo;

    private static Logger logger = Logger.getLogger(WhoWeArePage.class);

    /**
     * This emulated click by the what we do link on the kreditech.com/who-we-are/ page.
     */

    public void clickWhatWeDo(){
        logger.info("Switch to Who we are Page");
        whatWeDo.click();
        logger.info("Navigate to What we do Page");
    }
}
