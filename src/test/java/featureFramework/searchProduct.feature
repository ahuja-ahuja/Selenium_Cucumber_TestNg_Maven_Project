Feature: Search and Place the order of the product

  @SearchOrder
  Scenario: Search Experience for product search in both home and offer page
    Given User in on GreenCart Landing page
    When User searched for only "Tom" with no Outline scenario

  Scenario Outline: Search Experience for product search in both home and offer page with multiple values
    Given User in on GreenCart Landing page
    When User searched with shortname <Name> and extracted actual name of the product
    Then User searched for <Name> shortname in offer page to check if product exist
    Examples:
      | Name |
      | Tom  |
      | Beet |