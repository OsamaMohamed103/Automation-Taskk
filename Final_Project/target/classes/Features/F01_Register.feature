Feature: Registration
@Smoke
  Scenario: Valid Registration
    Given user should open brwoser and navigate to the website
    When click register button
    And select gender type
    And user enter first name
    And user enter last name
    And user enter date of birth
    And user enter  email
    And user fills password field
    And user fills confirm password
    And user click on register button
    Then success message is displayed