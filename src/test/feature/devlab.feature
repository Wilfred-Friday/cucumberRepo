Feature: validate devlab application

  Scenario: validate devlab HomePage Header Navigation
    Given user lunch devlab application
    Then user validate the home page title
    And user validate devlab logo
    When user clicks on login button
    Then Login pop up screen displays
    When user gives input as user name and password
    Then user close the login pop up
    Then user close de application