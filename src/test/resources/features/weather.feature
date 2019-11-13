Feature: As a User I want to go to Weather.com website and search for the weather forecast in a few cities

  @PositiveTests
  Scenario Outline: Finding weather by search
    Given I am on the Weather.com main page
    And Click on the search field
    When I type <query>
    Then I verify there is the weather forecast for <query>
  Examples:
    |query     |
    |London    |
    |Moscow    |

  @NegativeTests
  Scenario Outline: Finding weather by search
    Given I am on the Weather.com main page
    And Click on the search field
    When I type <query>
    Then I verify there is the message: <errorMessage>
  Examples:
    |query     |errorMessage        |
    |__ths     |There was a problem |
    |%%%%%     |There was a problem |


