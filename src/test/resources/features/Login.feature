Feature: Login Functionality
  User story: As a user I should be able to login with correct credentials


  @Login  @pre-condition
  Scenario: login scenario
    Given user is on login page
    When user enters valid username and password
    Then user can login

