Feature: Login

  Scenario: Login successfully:
    Given the user accesses the login page
    And he/she inserts valid credentials
    When he/she clicks the login button
    Then he/she checks if the user was logged in


  Scenario: Login with wrong credentials:
    Given the user accesses the login page
    And he/she inserts invalid credentials
    When he/she clicks the login button
    Then he/she expects an invalid credentials message


  Scenario: Login with no password
    Given the user accesses the login page
    When the user enters "eu@fast.com"/"wrong.pass" credentials
    And he/she clicks the login button
    Then he/she expects an invalid credentials message
    Then he/she expects error message
    #Then he/she expects "Please enter your password!" message


  Scenario Outline: Failed login
    Given the user accesses the login page
    When the user enters "<email>"/"<pass>" credentials
    And he/she clicks the login button
    Then he/she expects "<message>" error message
    Examples:
      | email       | pass     | message                     |
      | aa@fast.com |          | Please enter your password! |
      |             | onlypass | Please enter your email!    |
      |             |          | Please enter your email!    |

