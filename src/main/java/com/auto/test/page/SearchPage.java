package com.auto.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by none on 09.06.15.
 */
public class SearchPage {
    private WebDriver driver;

    public  SearchPage (WebDriver driver){
        this.driver = driver;
    }

    public void fillSearchField (String string){
        driver.findElement(By.name("q")).sendKeys(string);
    }

}
