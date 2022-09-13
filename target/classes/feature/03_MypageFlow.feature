@Debug
Feature: Mypage page flow
  Scenario: Check mypage page flow
    Given Navigate to landing page
    When Click login button in landing page
    And Input email and pw correct in login page
    And Click submit button in login page
    Then Go to healcheck page successfully
    When Click
    Then Go to mypage page successfully
  Scenario: Check confirm warning button enable/disable
    When Go to mypage page successfully
    #asdfasdfasdfasdfasdfasdfasdf wwaiiittttt

  Scenario: Check mypage element
    When Go to mypage page successfully
    And Click confirm cognito button in mypage page
    Then Go to calo id detail page successfully
    When Click back button in calo id detail page
    Then Go to mypage page successfully
    When Click add supporter button in mypage page
    Then Go to supporter company input invitation code page successfully
    When Click back button in supporter company input invitation code page
    Then Go to mypage page successfully
    When Click back button in mypage page
