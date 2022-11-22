@us8
Feature:As a user, I should be able to delete a file/folder

  Background:
    Given user on the login page


  @run
    Scenario: Verify users delete a file/folder
    When user use username and password and login
    Then verify the user should be at the dashboard page
    When the user clicks the Files module
    And user click action-icon  from any file on the page
    And user choose the Delete f option
    When the user clicks the Deleted files sub-module on the left side
    Then Verify the deleted file is displayed on the page


