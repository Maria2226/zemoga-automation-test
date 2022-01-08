package model;

import config.BaseConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static constants.Selectors.ADD_TO_SHOPPING_CART_BUTTON;

public class Product extends BaseConfig {


    public void addItemToShoppingCart () {
       WebElement addToShoppingCartButton = driver.findElement(ADD_TO_SHOPPING_CART_BUTTON);
        addToShoppingCartButton.click();
    }
}
