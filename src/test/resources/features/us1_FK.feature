Feature:: As a user, I should be able to log in.


  @US1
  Scenario Outline: Verify login with valid credentials...
    Given user on the login page...
    When user use username "<username1>" and passcode "<password1>"
    And user click the login button...
    Then verify the user should be at the dashboard page ...

    Examples:
      | username1 | password1   |
      | user2     | Userpass123 |
      | user32    | Userpass123 |
      | user62    | Userpass123 |
      | user92    | Userpass123 |
