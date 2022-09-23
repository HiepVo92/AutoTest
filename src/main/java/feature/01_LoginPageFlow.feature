
Feature: Login cognito flow
  Scenario: Check Login cognito flow add new supporter
      Given Navigate to landing page
      When Click login button in landing page
      Then Go to login page successfully

  Scenario: Check Back button in login page
      When Click back button in login page
      Then Go to landing page successfully
      And Click login link in landing page
      Then Go to login page successfully

  Scenario: Check forgot password button in login page
      When Click forgot password button in login page
      Then Go to forgot password page successfully
      And Click back button in forgot password page
      Then Go to login page successfully
  Scenario: Check placeholder, label in email and password text box
      When Go to login page successfully
      Then Label and placeholder display correct
  Scenario: Check submit button enable/disable
      And Submit button is disable when not input email or pw
      And Submit button is enable when input email and pw

  Scenario Outline: Check validation email login page
      When Go to login page successfully
      When Input email is <data>
      And Click out focus in login page
      Then <expected> email result is shown correctly
        Examples:
          | data                 | expected             |
          | test                 | 正しいメールアドレスを入力してください。 |
          | cleartext            | メールアドレスを入力してください。                     |
          | hieptest@yopmail.com |                      |


  Scenario Outline: Check validation pw login page
    When Go to login page successfully
      When Input pw is <data>
      And Click out focus in login page
      Then <expected> pw result is shown correctly
      Examples:
        | data      | expected        |
        | Test      |                 |
        | cleartext | パスワードを入力してください。 |


  Scenario: Login page when input email and pass incorrect
    When Go to login page successfully
    And Input email and pw incorrect in login page
    And Click submit button in login page
    Then Show error msg login

  Scenario: Login page successfully
    When Go to login page successfully
    And Input email and pw correct in login page
    And Click submit button in login page
    And Quit browser




