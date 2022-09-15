
Feature: Landing page
@Test
  Scenario: Check landing page
    Given Navigate to landing page
    Then Check UI landing page
    #check login button
    When Click login button in landing page
    Then Go to login page successfully
    And Click back button in login page
    Then Go to landing page successfully
    #check login link
    When Click login link in landing page
    Then Go to login page successfully
    And Click back button in login page
    Then Go to landing page successfully
    #check register button
    When Click Register button in landing page
    Then Go to check code page successfully
    And Click back button in check code page
    Then Go to landing page successfully
    And Quit browser



