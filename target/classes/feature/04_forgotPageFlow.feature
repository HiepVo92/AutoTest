Feature: Forgot password page flow
  Scenario: Go to forgot password page
    Given Navigate to landing page
    When Click login button in landing page
    And Click forgot password button in login page
    Then Go to forgot password page successfully
  Scenario: Check placeholder and label text box
    When Go to forgot password page successfully
    And Check label text box forgot
    And Check placeholder text box forgot
  Scenario Outline: Check validation forgot text box
    When Go to forgot password page successfully
    And Input <text> in forgot password text box
    And Click Out focus in forgot password page
    Then Show <error> msg forgot page
    Examples:
      | text  | error               |
      | null  | null                 |
      | abc   | 正しいメールアドレスを入力してください |
      | null1 | メールアドレスを入力してください。   |

  Scenario: Go to confirm forgot password page
      When Input email correct in forgot password text box
      And Click submit button in forgot password page
      Then Go to confirm code forgot password page successfully

  Scenario Outline: Check verify code text box in confirm forgot password  page
    When Go to confirm code forgot password page successfully
    When Input <text> in confirm code forgot password text box
    And Click out focus in confirm forgot password page
    Then Show <error> msg confirm forgot pw text box
    Examples:
      | text   | error     |
      | 123456 | null      |
      | null   | msgerrorA |
      | 12345  | msgerrorB |

  Scenario: Check placeholder, label in
  Scenario Outline: Check new password text box in confirm forgot password  page
    When Go to confirm code forgot password page successfully
    When Input <text> in new password text box
    And Click submit button in confirm forgot password page
    Then Show <error> msg new password text box
    Examples:
      | text      | error                       |
      | Pass@12#* | null                        |
      | pass1234  | 大文字を含むパスワードを入力してください。       |
      | PASS1234  | 小文字を含むパスワードを入力してください。       |
      | Password  | 数字を含むパスワードを入力してください。        |
      | 12345678  | 英大文字、英小文字を含むパスワードを入力してください。 |
      | password  | 英大文字、数字を含むパスワードを入力してください。   |
      | PASSWORD  | 英小文字、数字を含むパスワードを入力してください。   |
      | pass567   | ８文字以上のパスワードを入力してください。       |
      |           | 新しいパスワードを入力してください。          |

  Scenario: Forgot password successfully
    When Go to confirm code forgot password page successfully
    When Input verify code in text box
    And Input new password in text box
    And Click submit button in confirm forgot password page
    Then Show popup reset password successfully
    And Click submit button in popup forgot pw successfully
    Then Go to login page successfully
    And Quit browser




