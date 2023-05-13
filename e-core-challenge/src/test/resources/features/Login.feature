@Alltests

Feature: Try to log in with different input data

  Background:
    Given I access the website to login


  Scenario Outline: I enter correct data to login into the system
    And I enter the username <username>
    And I enter the password <password>
    And I click on the login button
    Then I check that I successfully logged in

    Examples:
      | username | password |
      | demouser | abc123   |


  Scenario Outline: I enter wrong data to login into the system
    And I enter the username <username>
    And I enter the password <password>
    And I click on the login button
    Then I check that I am presented with a wrong credentials message <validationMessage>

    Examples:
      | username  | password | validationMessage           |
      | Demouser  | abc123   | Wrong username or password. |
      | demouser_ | xyz      | Wrong username or password. |
      | demouser  | nananana | Wrong username or password. |
      | demouser  | abc123   | Wrong username or password. |
