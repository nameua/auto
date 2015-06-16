package com.auto.test;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.SearchPage;
import page.kreditechPage.LandingPage;
import page.kreditechPage.WhatWeDoPage;
import page.kreditechPage.WhoWeArePage;
//import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This is a test case represent search on google.ru and basic navigation by the kreditech.com page.
 *
 * Created by none on 09.06.15.
 */
public class TaskTest extends BaseTest {
    private static Logger logger = Logger.getLogger(TaskTest.class);
    private SearchPage searchPage;
    private LandingPage landingPage;
    private WhoWeArePage whoWeArePage;
    private WhatWeDoPage whatWeDoPage;

    private final String SEARCH_WORD = "Kreditech";
    @Before
    public void setUp() {

        //driver = new FirefoxDriver();
        //logger.info("Running Firefox browser");

        driver = new ChromeDriver();
        logger.info("Running Chrome browser");
        driver.manage().window().maximize();
        logger.info("Maximaze browser");
        searchPage = PageFactory.initElements(driver, SearchPage.class);
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        whoWeArePage = PageFactory.initElements(driver, WhoWeArePage.class);
        whatWeDoPage = PageFactory.initElements(driver, WhatWeDoPage.class);
    }

    @After
    public void tearDown() {
        driver.close();
        logger.info("Close the browser");
        driver.quit();
    }

    @Test
    public void searchResult() {
        driver.get("https://www.google.ru");
        logger.info("Navigate to the google.ru");
        searchPage.clickSearchPage(SEARCH_WORD);
        searchPage.navigateToKreditechLink();
        landingPage.clickWhoWeAre();
        whoWeArePage.clickWhatWeDo();
        whatWeDoPage.verifyCorrectPage();
    }

}
