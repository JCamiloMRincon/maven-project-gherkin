Feature: Random Data

  Background: Precondition
    Given I have two random int positive numbers

  @Regression
  @Smoke
  Scenario: Positive sum
    When I add the numbers
    Then I verify that the sum is positive

  @Regression
  Scenario: Positive product
    When I multiply the numbers
    Then I verify that the product is positive

  @Regression
  Scenario: Positive square root
    When I get the square root of the numbers
    Then I verify that the square roots are positive