Feature: To Test the login functionality in the simplilearn site

  Background: 
    Given I have launched the application URL
    And I click on the Login Link

  Scenario: Validate the login success scenario
    Then I enter the username and password
    And I click on the Login button
    Then I should land on the home screen

  @Sanity
  Scenario: Validate Login failiure scenario using data parameters
    Then I enter the username as "Abc@xyz.com" and password as "Abc@1234"
    And I click on the Login button
    Then I should get the error message as "The email or password you have entered is invalid."

  Scenario Outline: Validate Login failiure scenario using Examples
    When I enter the username as "<UserName>" and password as "<Password>"
    And I click on the Login button
    Then I should get the error message as "<ErrorMsg>"

    Examples: 
      | UserName    | Password | ErrorMsg                                           |
      | Abc@xyz.com | Abc@1234 | The email or password you have entered is invalid. |
      | Pqr@xyz.com | Pqr@1234 | The email or password you have entered is invalid. |

  @Sanity
  Scenario: Validate the other login options on the screen
    Then I should see below login options on the screen
      | Google   |
      | Facebook |
      | Linkedin |
      | Apple    |
