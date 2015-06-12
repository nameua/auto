package com.auto.test;

/**
 * Created by none on 09.06.15.
 */

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class BaseTest {
    private static Logger logger = Logger.getLogger(BaseTest.class);

    protected WebDriver driver;

    //System.setProperty("webdriver.chrome.driver", this.getClass().getClassLoader().getResource("chromedriver").getPath());


}
