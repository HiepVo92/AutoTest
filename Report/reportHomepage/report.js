$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("00_LandingPageFLow.feature");
formatter.feature({
  "line": 2,
  "name": "Landing page",
  "description": "",
  "id": "landing-page",
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
  "name": "Check landing page",
  "description": "",
  "id": "landing-page;check-landing-page",
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
  "location": "step_00_landingPage.navigate_to_landing_page()"
});
formatter.result({
  "duration": 10801455458,
  "status": "passed"
});
formatter.match({
  "location": "step_00_landingPage.check_UI_landing_page()"
});
formatter.result({
  "duration": 1475397583,
  "status": "passed"
});
formatter.match({
  "location": "step_00_landingPage.click_login_button_in_landing_page()"
});
formatter.result({
  "duration": 1959241583,
  "status": "passed"
});
formatter.match({
  "location": "step_00_landingPage.go_to_login_page_successfully()"
});
formatter.result({
  "duration": 1290239542,
  "status": "passed"
});
formatter.match({
  "location": "step_00_landingPage.click_back_button_in_login_page()"
});
formatter.result({
  "duration": 643905167,
  "status": "passed"
});
formatter.match({
  "location": "step_00_landingPage.go_to_landing_page_successfully()"
});
formatter.result({
  "duration": 1062736500,
  "status": "passed"
});
formatter.match({
  "location": "step_00_landingPage.click_login_link_in_landing_page()"
});
formatter.result({
  "duration": 487090000,
  "status": "passed"
});
formatter.match({
  "location": "step_00_landingPage.go_to_login_page_successfully()"
});
formatter.result({
  "duration": 1260336292,
  "status": "passed"
});
formatter.match({
  "location": "step_00_landingPage.click_back_button_in_login_page()"
});
formatter.result({
  "duration": 328229041,
  "status": "passed"
});
formatter.match({
  "location": "step_00_landingPage.go_to_landing_page_successfully()"
});
formatter.result({
  "duration": 1088978958,
  "status": "passed"
});
formatter.match({
  "location": "step_00_landingPage.click_Register_button_in_landing_page()"
});
formatter.result({
  "duration": 437674750,
  "status": "passed"
});
formatter.match({
  "location": "step_00_landingPage.go_to_check_code_page_successfully()"
});
formatter.result({
  "duration": 331092333,
  "status": "passed"
});
formatter.match({
  "location": "step_00_landingPage.click_back_button_in_check_code_page()"
});
formatter.result({
  "duration": 319555917,
  "status": "passed"
});
formatter.match({
  "location": "step_00_landingPage.go_to_landing_page_successfully()"
});
formatter.result({
  "duration": 1069869459,
  "status": "passed"
});
formatter.match({
  "location": "step_00_landingPage.quit_browser()"
});
formatter.result({
  "duration": 1200308125,
  "status": "passed"
});
});