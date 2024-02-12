Feature: fill form input
  @regression
  Scenario: fill form with data
    Given user lunch form application
    Then user scroll to the contact form
    And  user fills out the form



    Scenario Outline: fill details in form using feature file
      Given user is in form hompage
      Then user fills the form with "<firstname>","<lastname>","<email>","<inquiry>"
      Examples:
      |firstname|lastname|email|inquiry|
      |Max      |Verstappen|mv@gmail.com|test|
      |Lewis    |Hamilton|lh@gmail.com |automation|
      |Sergio   |Perez   |sp@gmail.com |testing|
