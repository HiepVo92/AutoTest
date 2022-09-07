
Feature: register cognito flow
  Scenario: Check register cognito
    Given Navigate to landing page
    When Click Register button in landing page
    Then Go to check code page successfully
      #Check back button
    When Click back button in check code page
    Then Go to landing page successfully
      #Check code page
    When Click Register button in landing page
    Then Go to check code page successfully
    And Check select box of invitation code and pass code
    And Check submit button enable/disable in check code page
    And Click submit button in check code page
    Then Go to Handling of personal information page successfully

  Scenario: Check Handling of personal information page
    When Go to Handling of personal information page successfully
    When Click back button in Handling of personal information page
    Then Go to check code page successfully

  Scenario: Check Terms of user page
      When Go to check code page successfully
      Then Click submit button in check code page
      And Click submit button in Handling of personal information page
      Then Go to Terms of user page successfully
      When Click back button in Terms of user page
      Then Go to Handling of personal information page successfully

  Scenario: Check ui register page
    When Click submit button in Handling of personal information page
    And Click submit button in terms of user page
    Then Go to signup page successfully
    And Check UI and placeholder signup page
    And Check submit button enable/disable in signup page
  Scenario Outline: Check validation email text box in signup page
    When Input <text> in email text box on signup page
    When Click out focus in signup page
    And Show <error> error msg email on signup page
    Examples:
      | text  | error               |
      | focus | null                |
      | abc   | 正しいメールアドレスを入力してください |
      | null  | メールアドレスを入力してください。   |
    Scenario Outline: Check validation passsword text box in signup page
      When Input <text> in password text box on signup page
      When Click out focus in signup page
      And Show <error> error msg password on signup page
    Examples:
      | text                               | error                                |
      | focus                              | null                                 |
      | passwo                             | ８文字以上のパスワードを入力してください。                |
      | PASSWORD                           | 英小文字、数字を含むパスワードを入力してください。            |
      | password                           | 英大文字、数字を含むパスワードを入力してください。            |
      | 12345678                           | 英大文字、英小文字を含むパスワードを入力してください。          |
      | Password                           | 数字を含むパスワードを入力してください。                 |
      | PASS1234                           | 小文字を含むパスワードを入力してください。                |
      | pass1234                           | 大文字を含むパスワードを入力してください。                |
      | character with space in beginining | パスワードに無効な文字が入っております。他のパスワードをお試しください。 |
      | character with space at the end    | パスワードに無効な文字が入っております。他のパスワードをお試しください。 |
      | character with space in between    | null                                 |

  Scenario: Check input correct signup flow
    When Input email and pw correct




