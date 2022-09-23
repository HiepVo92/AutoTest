$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("03_MypageFlow.feature");
formatter.feature({
  "line": 2,
  "name": "Mypage page flow",
  "description": "",
  "id": "mypage-page-flow",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Debug"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Check flow mypage page when user do not have data HC",
  "description": "",
  "id": "mypage-page-flow;check-flow-mypage-page-when-user-do-not-have-data-hc",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Navigate to landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click login button in landing page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Go to login page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Input email and pw of user do not have data HC",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Click submit button in login page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Go to no data health check page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click icon account in health check page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Go to mypage page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Click btn logout in mypage page",
  "keyword": "And "
});
formatter.match({
  "location": "Step_00_landingPage.navigate_to_landing_page()"
});
formatter.result({
  "duration": 14287161167,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.click_login_button_in_landing_page()"
});
formatter.result({
  "duration": 1313962375,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.go_to_login_page_successfully()"
});
formatter.result({
  "duration": 1336821625,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.input_email_and_pw_of_user_do_not_have_data_HC()"
});
formatter.result({
  "duration": 454876167,
  "status": "passed"
});
formatter.match({
  "location": "Step_01_loginPage.Click_submit_button_in_login_page()"
});
formatter.result({
  "duration": 8251780583,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.go_to_no_data_health_check_page_successfully()"
});
formatter.result({
  "duration": 3244218333,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.Click_icon_account_in_health_check_page()"
});
formatter.result({
  "duration": 525168416,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.go_to_mypage_page_successfully()"
});
formatter.result({
  "duration": 4213714750,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.click_btn_logout_in_mypage_page()"
});
formatter.result({
  "duration": 57505625,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Check flow mypage page when user has data HC",
  "description": "",
  "id": "mypage-page-flow;check-flow-mypage-page-when-user-has-data-hc",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "Go to landing page successfully",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Click login button in landing page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Go to login page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Input email and pw of user has data HC",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Click submit button in login page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Go to heal check top page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Click icon account in health check page",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Go to mypage page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_00_landingPage.go_to_landing_page_successfully()"
});
formatter.result({
  "duration": 1081645666,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.click_login_button_in_landing_page()"
});
formatter.result({
  "duration": 477522625,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.go_to_login_page_successfully()"
});
formatter.result({
  "duration": 1237664709,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.input_email_and_pw_of_user_has_data_HC()"
});
formatter.result({
  "duration": 133809750,
  "status": "passed"
});
formatter.match({
  "location": "Step_01_loginPage.Click_submit_button_in_login_page()"
});
formatter.result({
  "duration": 6324296416,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.go_to_heal_check_top_page_successfully()"
});
formatter.result({
  "duration": 10769861458,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.Click_icon_account_in_health_check_page()"
});
formatter.result({
  "duration": 508663208,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.go_to_mypage_page_successfully()"
});
formatter.result({
  "duration": 4172404542,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Check flow mypage when user has verify email",
  "description": "",
  "id": "mypage-page-flow;check-flow-mypage-when-user-has-verify-email",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "Go to mypage page successfully",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Icon warning not display",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "Click confirm cognito button in mypage page",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Go to calo id detail page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "Click back button in calo id detail page",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "Go to mypage page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "Click add supporter button in mypage page",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Go to supporter company input invitation code page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Click back button in supporter company input invitation code page",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Quit browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_03_Mypage.go_to_mypage_page_successfully()"
});
formatter.result({
  "duration": 4331155750,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.icon_warning_not_display()"
});
formatter.result({
  "duration": 21569958,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.click_confirm_cognito_button_in_mypage_page()"
});
formatter.result({
  "duration": 1781372500,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.go_to_calo_id_detail_page_successfully()"
});
formatter.result({
  "duration": 116359583,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.click_back_button_in_calo_id_detail_page()"
});
formatter.result({
  "duration": 1705874417,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.go_to_mypage_page_successfully()"
});
formatter.result({
  "duration": 4139837750,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.click_add_supporter_button_in_mypage_page()"
});
formatter.result({
  "duration": 5911398375,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.go_to_supporter_company_input_invitation_code_page_successfully()"
});
formatter.result({
  "duration": 5592027084,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.click_back_button_in_supporter_company_input_invitation_code_page()"
});
formatter.result({
  "duration": 29651458,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.quit_browser()"
});
formatter.result({
  "duration": 1194780625,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "Check flow mypage when user do not verify email",
  "description": "",
  "id": "mypage-page-flow;check-flow-mypage-when-user-do-not-verify-email",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 39,
  "name": "Navigate to landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "Click login button in landing page",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "Go to login page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "Input email and pw of user do not verify email",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "Click submit button in login page",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "Go to no data health check page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "Click icon account in health check page",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "Go to mypage1 page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 47,
  "name": "Icon warning display",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "Quit browser",
  "keyword": "And "
});
formatter.match({
  "location": "Step_00_landingPage.navigate_to_landing_page()"
});
formatter.result({
  "duration": 10905301875,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.click_login_button_in_landing_page()"
});
formatter.result({
  "duration": 1294329250,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.go_to_login_page_successfully()"
});
formatter.result({
  "duration": 1242719459,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.input_email_and_pw_of_user_do_not_verify_email()"
});
formatter.result({
  "duration": 426824292,
  "status": "passed"
});
formatter.match({
  "location": "Step_01_loginPage.Click_submit_button_in_login_page()"
});
formatter.result({
  "duration": 7821719417,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.go_to_no_data_health_check_page_successfully()"
});
formatter.result({
  "duration": 3176163666,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.Click_icon_account_in_health_check_page()"
});
formatter.result({
  "duration": 647273084,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.go_to_mypage1_page_successfully()"
});
formatter.result({
  "duration": 4180808500,
  "status": "passed"
});
formatter.match({
  "location": "Step_03_Mypage.icon_warning_display()"
});
formatter.result({
  "duration": 31097542,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.quit_browser()"
});
formatter.result({
  "duration": 1174193209,
  "status": "passed"
});
});