Feature: fill form input
  @regression
  Scenario: fill form with data
    Given user lunch form application
    Then user scroll to the contact form
    And  user fills out the form
    When user finish he closes the application


    Scenario Outline: fill details in form using feature file
      Given user is in form hompage
      Then user scroll till the form section
      Then user fills the form with "<firstname>","<lastname>","<email>","<inquiry>
      Examples:
      |firstname|lastname|email|inquiry|
      |Max      |Verstappen|mv@gmail.com|1|
      |Lewis    |Hamilton|lh@gmail.com |2 |
      |Sergio   |Perez   |sp@gmail.com |3 |
