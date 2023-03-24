Feature: Log out Functionality
  User Story: As a user, I should be able log out

  Background: User is already logged in
    Given user is on home page

  @Logout
  Scenario: logout scenario
    When user clicks profile status icon
    And user clicks log out button
    Then user reaches login page