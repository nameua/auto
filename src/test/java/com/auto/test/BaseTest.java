package com.auto.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

/**
 * Represented all general methods for over the test cases.
 *
 * Created by none on 09.06.15.
 */

public class BaseTest {
    private static Logger logger = Logger.getLogger(BaseTest.class);
    protected WebDriver driver;

    //System.setProperty("webdriver.chrome.driver", this.getClass().getClassLoader().getResource("chromedriver").getPath());


}
