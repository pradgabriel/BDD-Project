Feature: FinalAssignment

@FinalAssignment
Scenario: zoomcar
    Given User launches the ZoomcarURL "zoomcarurl"
    When User clicks on Start Your Wonderful Journey
    And User clicks Porur as the pick up Point
    And user clicks the next button
    And use selects next date
    And user clicks on next button again
    And user clicks on last date
    And user clicks on Done button  
    Then user gets the price of the highest priced car