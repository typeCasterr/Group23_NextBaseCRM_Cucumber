
Feature: Users should be able to login

  Scenario Outline: Login as a help desk
    Given the user log in as "<userType>" user
    Then the user should be able to login

    Examples:
      |userType|
      |help desk|
      |human resource|
      |marketing|

