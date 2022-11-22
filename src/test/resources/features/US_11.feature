@us11
Feature: As a user, I should be able to access to Talks module

  @talksmodule1
  Scenario Outline: As a user, I should be able to access to Talks module
    Given user is on the login page
    When user enters "<username>" and "<password>"
    When the user clicks the  "Talk" module
    Then verify the page title is "Talk - Trycloud QA"


    Examples:
      | username | password    |
      | user2    | Userpass123 |
#      | user32   | Userpass123 |
#      | user62   | Userpass123 |
#      | user92   | Userpass123 |


  @talksmodule2
  Scenario Outline: As a user, I should be able to access to Talks module
    Given user is on the login page
    When user enters "<username>" and "<password>"
    When the user clicks the  "Talk" module
    And user search user from the search box
    And user write a message
    And user clicks to submit button
    Then the user should be able to see the message is displayed on the conversation log



    Examples:
      | username | password    |
      | user2    | Userpass123 |
#      | user32   | Userpass123 |
#      | user62   | Userpass123 |
#      | user92   | Userpass123 |