Feature: Login
  @Smoke
  Scenario: user can login with valid username and password
    Given user go to website
    When user press on login
    And user login with valid username and password
    And user press on login button
    Then user login to system successfully
    @Smoke
    Scenario: user can't login with invalid username and password
      Given user go to website
      When  user press on login
      And user login with invalid username and password
      And user press on login button
      Then user can't login to the system