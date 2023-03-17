Feature: test

  @positiveLogin
  Scenario: test
    Given user is on login page
    When user enters valid username and password
    Then user can login