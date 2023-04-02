Feature: This feature tests Trello API

  Scenario: Add a new list to the test board after changing title
    Given The board exists and contains the correct information
    When User changes the board title to "New title"
    And User check that the board name was updates to "New title"
    Then User adds a list with title "Example List" to the board