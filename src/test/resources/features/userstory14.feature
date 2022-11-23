
@us14 @smoke
Feature: US14 - As a user, I should be able to search any item/ users from the homepage.




  Scenario Outline:Verify users can search any files/folder/users from the search box.
    Given user should be on the login page
    When  user should enter "<username>" and "<password>"
    When the user clicks the magnifier icon on the right top
    And users search any existing file,folder,user name
    Then verify the app displays the expected result option

    Examples:
      | username | password    |
      | user2    | Userpass123 |
#      | user32   | Userpass123 |
#      | user62   | Userpass123 |
#      | user92   | Userpass123 |