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


 Scenario Outline: Check side menu list
   Given User opens '<homePage>' page
   When User open side menu
   Then User check that amount of submenu  in side menu list are 28
   Examples:
     | homePage                            |
     | https://www.amazon.com/ref=nav_logo |








