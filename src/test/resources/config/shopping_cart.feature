Feature: Shopping cart feature
  you can add to cart, proceed to checkout, and finish an order


  @AddItemToShoppingCart
  Scenario Outline: Add item to shopping cart
  Given User open automationpractice
  And Input "<Product>" in search bar
  And Select first search list item
  And Add item to shopping cart
  Then Validate if product was added to shopping cart correctly

  Examples:
  | Product                         |
  | Faded Short Sleeve T-shirts     |
  | Printed Chiffon Dress           |


  @Checkout
  Scenario: Add item to shopping cart and checkout
  Given User open automationpractice
  And Add product to shopping cart
  And Go to shopping cart and proceed with the purchase
  Then Validate if order confirmation is correct

  @CheckoutMobile
  Scenario: Add item to shopping cart and checkout
  Given User open automationpractice in a mobile device
  And Add product to shopping cart
  And Go to shopping cart and proceed with the purchase
  Then Validate if order confirmation is correct
