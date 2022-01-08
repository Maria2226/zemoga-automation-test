package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import model.ProductList;

public class ProductListSteps {

    ProductList productList = new ProductList();

    @And("Filter by {string}")
    public void filterBy(String filter) {
        productList.filterSortBy(filter);
    }

    @Then("Validate if product list is ordered by price lower")
    public void validateFilter() {
        productList.validateFilter();
    }
}
