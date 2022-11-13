Feature:

  @login
Scenario:   user login the page and be on the dashboard page
  Given user on the dashboard page


    @US1
  Scenario Outline:
    Given user on the login page
    When user use "<username>" and "<password>" and login
    Then verify the user should be at the dashboard page

    Examples:
      | username | password    |
      | user2    | Userpass123 |
      | user32   | Userpass123 |
      | user62   | Userpass123 |
      | user92   | Userpass123 |