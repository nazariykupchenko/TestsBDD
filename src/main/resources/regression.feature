Feature: Regression
  As a user
  I want to check unsuccessful login and registration

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


  Scenario Outline: Check to register with invalid email data
    Given User opens '<homePage>' page
    And User clicks sign in button
    And User clicks create new account button
    And User checks name, email, password fields visibility
    And User checks create account button visibility
    When User enter '<name>' to name field
    And User enter '<email>' to email_address  field
    And User enter '<password>' to password field
    And User re-enter '<password>' to password confirmation field
    And User clicks  create new account on Amazon button
    Then User checks that warning message visible
    Examples:
      | homePage                            | name | email | password |
      | https://www.amazon.com/ref=nav_logo | test | test  | testtest |

