package com.auto.test;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.SearchPage;
//import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by none on 09.06.15.
 */
public class TaskTest extends BaseTest {
    private static Logger logger = Logger.getLogger(TaskTest.class);
    private SearchPage searchPage;

    @Before
    public void setUp() {
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        logger.info("Running Chrome browser");
        driver.manage().window().maximize();
        searchPage = PageFactory.initElements(driver, SearchPage.class);
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void searchResult() {
        driver.get("https://www.google.ru");
        searchPage.clickSearchPage("Kreditech");
    }

}
