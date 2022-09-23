Feature: CalomanaID page flow
  Scenario: Check CalomanaID page when user do not have phone number
    Given Navigate to landing page
    When Click login button in landing page
    Then Go to login page successfully
    And Input email and pw of user do not have phone number
    And Click submit button in login page
    Then Go to no data health check page successfully
    When Click icon account in health check page
    Then Go to mypage page successfully
    When Click confirm cognito button in mypage page
    Then Go to calo id detail page successfully
    When Click back button in calo id detail page
    Then Go to mypage page successfully
    And Click btn logout in mypage page

  Scenario: Check CalomanaID page when user has register phone number
    When Go to landing page successfully
    And Click login button in landing page
    Then Go to login page successfully
    And Input email and pw of user has register phone number
    And Click submit button in login page
    Then Go to MFA page successfully
    When Input phone number MFA
    Then Go to no data health check page successfully
    When Click icon account in health check page
    Then Go to mypage page successfully
    When Click confirm cognito button in mypage page
    Then Go to calo id detail page successfully