package stepDefinitions;

import io.cucumber.java.en.And;
import model.SearchBar;

public class SearchBarSteps {
    SearchBar searchBar = new SearchBar();

    @And("Input and search {string} in search bar")
    public void fillAndSearchSearchField(String search) {
        searchBar.fillSearchField(search); // this method fills search field
        searchBar.pressSearchButton(); // this method press search button
    }

    @And("Input {string} in search bar")
    public void fillSearchField(String search) {
        searchBar.fillSearchField(search); // this method fills search field
    }

    @And("Select first search list item")
    public void selectSearchItem() {
        searchBar.selectSearchItem();
    }
}
