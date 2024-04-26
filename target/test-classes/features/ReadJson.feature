Feature: Read Json

  Background: Precondition
    Given I read the JSON of user

  @Regression
  @Smoke
  Scenario: ID is positive
    Then I verify that the ID is positive

  @Regression
  Scenario: Verify the longitude
    Then I verify that the longitude is 71.7478

  @Regression
  Scenario: Verify the company bs length
    Then I verify that the company bs length is greater than 10