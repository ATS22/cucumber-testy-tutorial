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
