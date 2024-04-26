Feature: Read Excel

  Background: Precondition
    Given I read the Excel products list

  @Regression
  @Smoke
  Scenario: Verify the third element
    When I get the element with index 2
    Then I verify that its name is "HUEVO" and its price is 43.9

  @Regression
  @Smoke
  Scenario: Verify the last element
    When I get the last element
    Then I verify that its price is 6.56 and it is NOT perishable

  @Regression
  Scenario: Verify the list size
    When I get the list size
    Then I verify that the list size is 22

  @Regression
  Scenario Outline: Verify several elements of the list
    When I get the element with index <index>
    Then I verify that it has <name>, <price>, <stock>

    Examples:
    | index | name       | price | stock |
    | 0     | "SALMON"   | 58.39 | 9     |
    | 1     | "JITOMATE" | 96.21 | 77    |
    | 2     | "HUEVO"    | 92.91 | 34    |
    | 3     | "LECHE"    | 41.53 | 25    |