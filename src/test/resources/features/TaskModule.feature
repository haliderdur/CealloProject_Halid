
# User Stroy - test execution
@CEA10-261 @CEA10-280
Feature: Task Module Functionality
  User story: As a user, I should be able to create a new task list
  or a single task and add any task to completed and important tasks list.


  Background: user should be already logged in
    Given user logged in and on tasks page

  #AC1: User can create a new list of tasks
  @CEA10-272 @smoke
  Scenario: User can create a new list of tasks
    When user clicks on AddList button and type list name
    And user clicks on save button
    Then list name should be displayed as tab


  #AC2: User can create a new task
  @CEA10-281 @smoke
  Scenario: User can create a new task
    When user clicks on newly created list tab
    And user types taskname and hits enter
    Then new task created


  #AC3: User can add any task to the list of completed
  # tasks by clicking on the checkbox near the task name
  @CEA10-282 @smoke
  Scenario: User can add any tasks to the completed task tab
    When user clicks on tasklist tab
    And user clicks on task checkbox
    Then task should be added in completed tab


  #AC4: User can add any task to the list of important tasks
  # by clicking on the star icon on the right side of task line
  @CEA10-283 @smoke
  Scenario: User can add any tasks to the important task tab
    When user clicks on tasklist tab
    And user clicks on star icon
    Then task should be added in important tab


  #AC5: User can see the number of all uncompleted tasks next to the Current tab
  @CEA10-284 @smoke
  Scenario: User can see the number of all uncompleted tasks next to the Current tab
    When user clicks on tasklist tab
    And user types taskname and hits enter
    And user clicks on task checkbox
    Then user can see number of uncompleted task amount on current tab




