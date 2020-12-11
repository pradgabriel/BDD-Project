Feature: Testing GooglePage Title

@PositiveScenario
Scenario: Login
    Given User launches the URL "url"
    When User enters the UserID "userID"
    And User enters the Password "password"
    And user checks the remember me checkbox
    And user clicks the sign on button
    Then user log in successfully
    