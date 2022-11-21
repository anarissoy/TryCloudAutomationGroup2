@smoke
Feature: As a user I should be able to access toFiles module

  Background:
    Given user on the dashboard page

  @US4.1
  Scenario: verify user can access to Files module
    When the user clicks the "Files" module
    Then verify the page title is "Files - Trycloud QA."

  @US4.2
  Scenario: verify users can select all the uploaded files from the page
    When the user clicks the "Files" module
    And user click the top-left checkbox of the table
    Then verify all the files are selected