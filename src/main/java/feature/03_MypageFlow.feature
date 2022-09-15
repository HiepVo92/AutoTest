@Debug
Feature: Mypage page flow
  Scenario: Check mypage page flow when user do not have data HC
    Given Navigate to landing page
    When Click login button in landing page
    Then Go to login page successfully
    And Input email and pw of user do not have data HC
    And Click submit button in login page
    Then Go to no data health check page successfully
    When Click icon account in healcheck page
    Then Go to mypage page successfully
    And Click btn logout in mypage page

  Scenario: Check mypage page flow when user has data HC
    When Go to landing page successfully
    And Click login button in landing page
    Then Go to login page successfully
    And Input email and pw of user has data HC
    And Click submit button in login page
    Then Go to heal check top page successfully
    When Click icon account in health check page
    Then Go to mypage page successfully


  Scenario: Check mypage when user has verify email
    When Go to mypage page successfully
    And Icon wanning not display
    And Click confirm cognito button in mypage page
    Then Go to calo id detail page successfully
    When Click back button in calo id detail page
    Then Go to mypage page successfully
    When Click add supporter button in mypage page
    Then Go to supporter company input invitation code page successfully
    When Click back button in supporter company input invitation code page
    Then Quit browser

  Scenario: Check mypage when user do not verify email
    Given Navigate to landing page
    When Click login button in landing page
    Then Go to login page successfully
    And Input email and pw of user do not verify email
    And Click submit button in login page
    Then Go to no data health check page successfully
    When Click icon account in health check page
    Then Go to mypage page successfully
    And Icon wanning display
    And Quit browser
