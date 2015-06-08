package com.auto.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import com.auto.test.page.SearchPage;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by none on 09.06.15.
 */
public class TaskTest extends BaseTest {

    @Before
    public void setUp() throws MalformedURLException {
        driver = new FirefoxDriver();
        driver.get("https://www.google.ru");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void searchResult(){
        SearchPage searchPage = new SearchPage(driver);
        searchPage.fillSearchField("123");

    }



}
