package page.kreditechPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.BasePage;

/**
 * Created by tykhon on 6/12/15.
 */
public class LandingPage extends BasePage{


    public LandingPage(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(LandingPage.class);

    @FindBy(linkText = "What we do")
    private WebElement whatWeDo;

    @FindBy(linkText = "Who we are")
    private WebElement whoWeAre;


    public void clickWhatWeDo(){
        whatWeDo.click();
        logger.info("Click a link: " + whatWeDo.getText().toString());
        //waitForLoad();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
