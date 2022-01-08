package model;

import config.BaseConfig;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static constants.Selectors.*;


// This class extends from BaseConfig to get driver element that is initialized in this constuctor
public class SearchBar extends BaseConfig {

    //this method fills search field and have a parameter in order to send enter key to send search action
     public void fillSearchField (String search) {
         WebElement searchInput = driver.findElement(SEARCH_INPUT);
         searchInput.sendKeys(search);
     }

     public void pressSearchButton () {
         WebElement searchInput =  driver.findElement(SUBMIT_SERACH_BUTTON);
         searchInput.click();
     }

    //this method select first item of results list
    public void selectSearchItem () {
        try {
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
        WebElement searchInputOptionsItem = driver.findElement(SEARCH_OPTIONS_ITEM);
        Assert.assertTrue(searchInputOptionsItem.isDisplayed());
        searchInputOptionsItem.click();
     }
}
