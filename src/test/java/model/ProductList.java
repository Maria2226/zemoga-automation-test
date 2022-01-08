package model;

import config.BaseConfig;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static constants.Selectors.*;

public class ProductList extends BaseConfig {
    public void filterSortBy (String filterText) {
        WebElement filterSelect = driver.findElement(FILTER_SELECT_PRODUCT_LIST);
        filterSelect.click();
        WebElement filterItem = driver.findElement(getFilterSelector(filterText));
        filterItem.click();
    }

    public void validateFilter () {
        int xpathCount = driver.findElements(FILTER_LIST_ITEMS).size();
        float priceToValidate = 0;
        for(int i=1 ; i<=xpathCount ; i++){

            List<WebElement> priceByItemElements = driver.findElements(getPriceByProductIndex(i));
            WebElement priceByItemElement;
            if(priceByItemElements.size()>1){
                priceByItemElement= priceByItemElements.get(1);
            }else {
                priceByItemElement= priceByItemElements.get(0);
            }
            float priceByItem = Float.parseFloat(priceByItemElement.getText().replace("$",""));
            Assert.assertTrue(priceByItem > priceToValidate);
            if(priceByItem > priceToValidate){
                priceToValidate=priceByItem;
            }
        }
    }

}
