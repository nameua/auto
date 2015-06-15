package page.kreditechPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page.BasePage;

/**
 * Created by tykhon on 6/16/15.
 */
public class WhoWeArePage extends BasePage {

    public WhoWeArePage(WebDriver driver) {
        super(driver);
    }

    private static Logger logger = Logger.getLogger(WhoWeArePage.class);

    public WhatWeDoPage clickWhatWeDo(){
        logger.info("Switch to Who we are Page");
        driver.findElement(By.linkText("What we do")).click();
        logger.info("Navigate to What we do Page");
        return new WhatWeDoPage(driver);
    }
}
