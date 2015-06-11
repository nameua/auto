package com.auto.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;

//import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by none on 09.06.15.
 */
public class TaskTest extends BaseTest{

    public void startWebDriver()  {

        System.setProperty("webdriver.chrome.driver", this.getClass().getClassLoader().getResource("chromedriver").getPath());

    }


    @Before
    public void setUp() throws MalformedURLException {
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get("https://www.google.ru");
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    @Test
    public void searchResult(){


    }



}
