@screen
Feature: As logged in user I change my password

  Scenario: Change password successfully
    Given the user accesses the login page
    And he/she inserts valid credentials
    When he/she clicks the login button
    And I click on Preferences button
    And I input current password
    And I input new password
    And I confirm the new password
    And I click on the Save button
    Then I should see "Your password has been successfully changed." message
    And I close Preferences window
    And I can re-login with new credentials