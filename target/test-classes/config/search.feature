Feature: Search feature
  you can search and see filtered results

  @SearchFeature
  Scenario Outline: Correctly search a value
    Given User open automationpractice
    And Input "<Search>" in search bar
    And Select first search list item

    Examples:
      | Search    |
      | Dress     |
