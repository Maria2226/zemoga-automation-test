Feature: Sort item feature
  you can select a sort item and see ordered results


  @SortByLowestPrice
  Scenario: Correctly sort by price (lowest first)
  Given User open automationpractice
  And Input and search "Dresses" in search bar
  And Filter by "Price: Lowest first"
  Then Validate if product list is ordered by price lower
