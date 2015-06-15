package page.kreditechPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.BasePage;

/**
 * Created by tykhon on 6/12/15.
 */
public class LandingPage extends BasePage {


    public LandingPage(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(LandingPage.class);

    @FindBy(linkText = "What we do")
    private WebElement whatWeDo;

    @FindBy(linkText = "Who we are")
    private WebElement whoWeAre;


    public WhoWeArePage clickWhoWeAre() {
        logger.info("Switch to Landing page");
        driver.findElement(By.linkText("Who we are")).click();
        logger.info("Click the Who we are link");

        try {    Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //whatWeDo.click();
        //logger.info("Click a link: " + whatWeDo.getText());
        //waitForLoad();

        return new WhoWeArePage(driver);
    }


}
