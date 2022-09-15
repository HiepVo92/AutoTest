$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("00_LandingPageFLow.feature");
formatter.feature({
  "line": 2,
  "name": "Landing page",
  "description": "",
  "id": "landing-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Check landing page",
  "description": "",
  "id": "landing-page;check-landing-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Navigate to landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Check UI landing page",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 7,
      "value": "#check login button"
    }
  ],
  "line": 8,
  "name": "Click login button in landing page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Go to login page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Click back button in login page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Go to landing page successfully",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 12,
      "value": "#check login link"
    }
  ],
  "line": 13,
  "name": "Click login link in landing page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Go to login page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "Click back button in login page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Go to landing page successfully",
  "keyword": "Then "
});
formatter.step({
  "comments": [
    {
      "line": 17,
      "value": "#check register button"
    }
  ],
  "line": 18,
  "name": "Click Register button in landing page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Go to check code page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "Click back button in check code page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Go to landing page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Quit browser",
  "keyword": "And "
});
formatter.match({
  "location": "Step_00_landingPage.navigate_to_landing_page()"
});
formatter.result({
  "duration": 18954411125,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.check_UI_landing_page()"
});
formatter.result({
  "duration": 1483648583,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.click_login_button_in_landing_page()"
});
formatter.result({
  "duration": 1095379375,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.go_to_login_page_successfully()"
});
formatter.result({
  "duration": 1265914625,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.click_back_button_in_login_page()"
});
formatter.result({
  "duration": 520145625,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.go_to_landing_page_successfully()"
});
formatter.result({
  "duration": 1042691625,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.click_login_link_in_landing_page()"
});
formatter.result({
  "duration": 450768125,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.go_to_login_page_successfully()"
});
formatter.result({
  "duration": 1277956625,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.click_back_button_in_login_page()"
});
formatter.result({
  "duration": 338176000,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.go_to_landing_page_successfully()"
});
formatter.result({
  "duration": 1054254709,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.click_Register_button_in_landing_page()"
});
formatter.result({
  "duration": 572767875,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.go_to_check_code_page_successfully()"
});
formatter.result({
  "duration": 368331125,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.click_back_button_in_check_code_page()"
});
formatter.result({
  "duration": 310150875,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.go_to_landing_page_successfully()"
});
formatter.result({
  "duration": 1032119667,
  "status": "passed"
});
formatter.match({
  "location": "Step_00_landingPage.quit_browser()"
});
formatter.result({
  "duration": 1240683791,
  "status": "passed"
});
});