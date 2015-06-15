package page.kreditechPage;

import junit.framework.Assert;
import org.openqa.selenium.WebDriver;
import org.apache.log4j.Logger;
import page.BasePage;

/**
 * Created by tykhon on 6/16/15.
 */
public class WhatWeDoPage extends BasePage{

    public WhatWeDoPage(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(WhatWeDoPage.class);

    public void verifyCorrectPage (WebDriver driver){
        logger.info("Current page: " + driver.getTitle());
        Assert.assertEquals("What we do - Kreditech",driver.getTitle());

    }
}
