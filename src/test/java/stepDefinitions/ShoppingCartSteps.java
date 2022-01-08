package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import model.CreateAccount;
import model.Product;
import model.SearchBar;
import model.ShoppingCart;

public class ShoppingCartSteps {

    Product product = new Product();
    SearchBar searchBar = new SearchBar();
    ShoppingCart shoppingCart = new ShoppingCart();
    CreateAccount createAccount = new CreateAccount();

    @And("Add item to shopping cart")
    public void addItemToShoppingCart() {
        product.addItemToShoppingCart();
    }


    @And("Add product to shopping cart")
    public void addProductToShoppingCart() {
        final String productName = "Faded Short Sleeve T-shirts";
        searchBar.fillSearchField(productName);
        searchBar.selectSearchItem(); // this method fills search field
        product.addItemToShoppingCart();
    }

    @And("Go to shopping cart and proceed with the purchase")
    public void proceedToPurchase() {
        shoppingCart.goToShoppingList();
        shoppingCart.proceedToCheckout();
        createAccount.enterEmailAndProceedToCreateAccount();
        createAccount.fillCreateAccountForm();
        shoppingCart.proceedToCheckoutInAddressPage();
        shoppingCart.proceedToCheckoutInShippingPage();
        shoppingCart.selectPaymentMethod();
        shoppingCart.confirmMyOrder();
    }

    @Then("Validate if product was added to shopping cart correctly")
    public void productWasAddedToCart() {
        shoppingCart.productWasAddedToCart();
    }

    @Then("Validate if order confirmation is correct")
    public void validateOrderConfirmation() {
        shoppingCart.validateOrderConfirmation();
    }

}
