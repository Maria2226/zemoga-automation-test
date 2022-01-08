package model;

import config.BaseConfig;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static constants.Selectors.*;

public class ShoppingCart extends BaseConfig {

    public void productWasAddedToCart (){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement successfulLabel = wait.until(
                ExpectedConditions.visibilityOfElementLocated(SUCCESSFUL_LABEL_ADD_TO_CART_MODAL));
        Assert.assertTrue(successfulLabel.isDisplayed());
        WebElement cartProductCount = driver.findElement(CART_PRODUCT_COUNT);
        Assert.assertEquals("1",cartProductCount.getText());
    }

    public void goToShoppingList(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement cartButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(GO_TO_SHOPPING_LIST_BUTTON));
        cartButton.click();
    }

    public void proceedToCheckout(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement proceedToCheckoutButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(PROCEED_TO_CHECKOUT_BUTTON));
        proceedToCheckoutButton.click();
    }

    public void proceedToCheckoutInAddressPage(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement proceedToCheckoutButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(PROCEED_TO_CHECKOUT_BUTTON_ADDRESS_PAGE));
        proceedToCheckoutButton.click();
    }

    public void proceedToCheckoutInShippingPage(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement cgv = wait.until(
                ExpectedConditions.visibilityOfElementLocated(ACCEPT_TERMS_CHECKBOX));
        cgv.click();
        WebElement proceedToCheckoutButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(PROCEED_TO_CHECKOUT_BUTTON_SHIPPING_PAGE));
        proceedToCheckoutButton.click();
    }

    public void confirmMyOrder(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement confirmMyOrderButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(CONFIRM_MY_ORDER_BUTTON));
        confirmMyOrderButton.click();
    }

    public void selectPaymentMethod(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement payByBankWireButton = wait.until(
                ExpectedConditions.visibilityOfElementLocated(PAY_BY_BANK_WIRE_BUTTON));
        payByBankWireButton.click();
        WebElement confirmationText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(CONFIRMATION_TEXT_PAYMENT));
        Assert.assertTrue(confirmationText.getText().contains("Dollar"));
    }


    public void validateOrderConfirmation(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement confirmationText = wait.until(
                ExpectedConditions.visibilityOfElementLocated(CONFIRMATION_TEXT_ORDER));
        Assert.assertTrue(confirmationText.getText().contains("Amount $18.51"));
    }

}
