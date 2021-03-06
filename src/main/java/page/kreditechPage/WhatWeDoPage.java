package page.kreditechPage;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import page.BasePage;

/**
 * This is the representation of the kreditech.com/what-we-do/ page
 * <p>
 * Created by tykhon on 6/16/15.
 */
public class WhatWeDoPage extends BasePage {

    public WhatWeDoPage(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(WhatWeDoPage.class);

    /**
     * Verification that current page is What we do - Kreditech Page.
     */
    public void verifyCorrectPage() {
        logger.info("Current page: " + driver.getTitle());
        Assert.assertEquals("What we do - Kreditech", driver.getTitle());

    }
}
