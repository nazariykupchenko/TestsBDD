Feature: Smoke
  As a user
  I want to test main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check site main functions
    Given User opens '<homePage>' page
    And User checks header visibility
    And User checks search field visibility
    And User checks logo visibility
    And User checks navigation menu visibility
    And User checks sign in button visibility
    When User clicks sign in button
    And User checks that login field visible
    And User checks that continue button visible
    And User clicks continue button
    Then User checks that alert message is visible

    Examples:
      | homePage                            |
      | https://www.amazon.com/ref=nav_logo |


  Scenario Outline: Check language switching
    Given User opens '<homePage>' page
    And User checks header visibility
    And User checks language icon visible
    And User clicks language icon
    And User checks that languages for select visible
    When User clicks on second language in the list
    And User clicks on save changes language button
    Then User checks that current url contains 'es' language

    Examples:
      | homePage                            |
      | https://www.amazon.com/ref=nav_logo |


  Scenario Outline: Check sign in with invalid login
    Given User opens '<homePage>' page
    And User checks header visibility
    And User checks sign in button visibility
    And User clicks sign in button
    And User checks that login field visible
    When User enter '<keyword>' to email field
    And User checks continue button visible
    And User clicks continue button
    Then User checks that error message visible

    Examples:
      | homePage                            | keyword |
      | https://www.amazon.com/ref=nav_logo | 123456  |


  Scenario Outline: Check change location
    Given User opens '<homePage>' page
    And User checks header visibility
    And User checks navigation menu visibility
    And User checks location icon visibility
    And User clicks location icon
    And User checks location popup visibility
    And User clicks location dropdown  menu
    When User clicks on first country
    And User clicks on submit button
    Then User checks that location icon contains '<countryName>' text

    Examples:
      | homePage                            | countryName |
      | https://www.amazon.com/ref=nav_logo | Australia   |

  Scenario Outline: Check adding product to cart page
    Given User opens '<homePage>' page
    When User enter '<productName>' to search field
    And User clicks on search button
    And User clicks on first product in search results list
    And User clicks Add to Cart button
    Then User checks that add to cart popup header is '<header>'
    And User checks that Go to Cart button visible
    And User checks that Proceed to checkout button visible

    Examples:
      | homePage                            | productName |header       |
      | https://www.amazon.com/ref=nav_logo | Iphone 10   |Added to Cart|









