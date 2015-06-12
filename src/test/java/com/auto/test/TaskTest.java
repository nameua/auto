package com.auto.test;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.SearchPage;
import page.kreditechPage.LandingPage;
//import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by none on 09.06.15.
 */
public class TaskTest extends BaseTest {
    private static Logger logger = Logger.getLogger(TaskTest.class);
    private SearchPage searchPage;
    private LandingPage landingPage;

    @Before
    public void setUp() {
        //driver = new FirefoxDriver();
        //logger.info("Running Firefox browser");
        driver = new ChromeDriver();
        logger.info("Running Chrome browser");
        driver.manage().window().maximize();
        logger.info("Maximaze browser");
        searchPage = PageFactory.initElements(driver, SearchPage.class);
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
        searchPage.clickSearchPage("Kreditech");
        searchPage.navigateToKreditechLink();
        landingPage.clickWhatWeDo();
    }

}
