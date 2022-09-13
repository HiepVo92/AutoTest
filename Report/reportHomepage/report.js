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
  "line": 3,
  "name": "Check mypage page flow",
  "description": "",
  "id": "mypage-page-flow;check-mypage-page-flow",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Navigate to landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click login button in landing page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Input email and pw correct in login page",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Click submit button in login page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Go to mypage page successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "step_00_landingPage.navigate_to_landing_page()"
});
formatter.result({
  "duration": 8706332500,
  "status": "passed"
});
formatter.match({
  "location": "step_00_landingPage.click_login_button_in_landing_page()"
});
formatter.result({
  "duration": 1263833084,
  "status": "passed"
});
formatter.match({
  "location": "step_01_loginPage.Input_email_and_pw_correct_in_login_page()"
});
formatter.result({
  "duration": 3891628542,
  "status": "passed"
});
formatter.match({
  "location": "step_01_loginPage.Click_submit_button_in_login_page()"
});
formatter.result({
  "duration": 3441780458,
  "status": "passed"
});
formatter.match({
  "location": "step_03_Mypage.go_to_mypage_page_successfully()"
});
formatter.result({
  "duration": 4254683250,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".mfa-head-text.bold-arial\"}\n  (Session info: chrome\u003d105.0.5195.102)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.4.0\u0027, revision: \u0027e5c75ed026a\u0027\nSystem info: host: \u0027MBA020473.local\u0027, ip: \u0027fe80:0:0:0:c5b:15c6:30b8:14b%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002712.5.1\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [30337f8f9e79a5094a1ea45e0c389d61, findElement {using\u003dcss selector, value\u003d.mfa-head-text.bold-arial}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 105.0.5195.102, chrome: {chromedriverVersion: 105.0.5195.52 (412c95e51883..., userDataDir: /var/folders/jh/th1hf7kj7qb...}, goog:chromeOptions: {debuggerAddress: localhost:65217}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: MAC, proxy: Proxy(), se:cdp: ws://localhost:65217/devtoo..., se:cdpVersion: 105.0.5195.102, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 30337f8f9e79a5094a1ea45e0c389d61\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:547)\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:365)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:357)\n\tat Commons.SetupHelp.verifyElementText(SetupHelp.java:124)\n\tat stepDefinition.step_03_Mypage.go_to_mypage_page_successfully(step_03_Mypage.java:13)\n\tat ✽.Then Go to mypage page successfully(03_MypageFlow.feature:8)\n",
  "status": "failed"
});
formatter.scenario({
  "line": 9,
  "name": "Check confirm warning button enable/disable",
  "description": "",
  "id": "mypage-page-flow;check-confirm-warning-button-enable/disable",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Go to mypage page successfully",
  "keyword": "When "
});
formatter.match({
  "location": "step_03_Mypage.go_to_mypage_page_successfully()"
});
formatter.result({
  "duration": 4039683250,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".mfa-head-text.bold-arial\"}\n  (Session info: chrome\u003d105.0.5195.102)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.4.0\u0027, revision: \u0027e5c75ed026a\u0027\nSystem info: host: \u0027MBA020473.local\u0027, ip: \u0027fe80:0:0:0:c5b:15c6:30b8:14b%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002712.5.1\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [30337f8f9e79a5094a1ea45e0c389d61, findElement {using\u003dcss selector, value\u003d.mfa-head-text.bold-arial}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 105.0.5195.102, chrome: {chromedriverVersion: 105.0.5195.52 (412c95e51883..., userDataDir: /var/folders/jh/th1hf7kj7qb...}, goog:chromeOptions: {debuggerAddress: localhost:65217}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: MAC, proxy: Proxy(), se:cdp: ws://localhost:65217/devtoo..., se:cdpVersion: 105.0.5195.102, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 30337f8f9e79a5094a1ea45e0c389d61\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:547)\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:365)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:357)\n\tat Commons.SetupHelp.verifyElementText(SetupHelp.java:124)\n\tat stepDefinition.step_03_Mypage.go_to_mypage_page_successfully(step_03_Mypage.java:13)\n\tat ✽.When Go to mypage page successfully(03_MypageFlow.feature:10)\n",
  "status": "failed"
});
formatter.scenario({
  "comments": [
    {
      "line": 11,
      "value": "#asdfasdfasdfasdfasdfasdfasdf wwaiiittttt"
    }
  ],
  "line": 13,
  "name": "Check mypage element",
  "description": "",
  "id": "mypage-page-flow;check-mypage-element",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "Go to mypage page successfully",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Click confirm cognito button in mypage page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Go to calo id detail page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Click back button in calo id detail page",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "Go to mypage page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Click add supporter button in mypage page",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Go to supporter company input invitation code page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Click back button in supporter company input invitation code page",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Go to mypage page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "Click back button in mypage page",
  "keyword": "When "
});
formatter.match({
  "location": "step_03_Mypage.go_to_mypage_page_successfully()"
});
formatter.result({
  "duration": 4030446000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\".mfa-head-text.bold-arial\"}\n  (Session info: chrome\u003d105.0.5195.102)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.4.0\u0027, revision: \u0027e5c75ed026a\u0027\nSystem info: host: \u0027MBA020473.local\u0027, ip: \u0027fe80:0:0:0:c5b:15c6:30b8:14b%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002712.5.1\u0027, java.version: \u002715.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [30337f8f9e79a5094a1ea45e0c389d61, findElement {using\u003dcss selector, value\u003d.mfa-head-text.bold-arial}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 105.0.5195.102, chrome: {chromedriverVersion: 105.0.5195.52 (412c95e51883..., userDataDir: /var/folders/jh/th1hf7kj7qb...}, goog:chromeOptions: {debuggerAddress: localhost:65217}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: MAC, proxy: Proxy(), se:cdp: ws://localhost:65217/devtoo..., se:cdpVersion: 105.0.5195.102, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 30337f8f9e79a5094a1ea45e0c389d61\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:547)\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:365)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:357)\n\tat Commons.SetupHelp.verifyElementText(SetupHelp.java:124)\n\tat stepDefinition.step_03_Mypage.go_to_mypage_page_successfully(step_03_Mypage.java:13)\n\tat ✽.When Go to mypage page successfully(03_MypageFlow.feature:14)\n",
  "status": "failed"
});
formatter.match({
  "location": "step_03_Mypage.click_confirm_cognito_button_in_mypage_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "step_03_Mypage.go_to_calo_id_detail_page_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "step_03_Mypage.click_back_button_in_calo_id_detail_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "step_03_Mypage.go_to_mypage_page_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "step_03_Mypage.click_add_supporter_button_in_mypage_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "step_03_Mypage.go_to_supporter_company_input_invitation_code_page_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "step_03_Mypage.click_back_button_in_supporter_company_input_invitation_code_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "step_03_Mypage.go_to_mypage_page_successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "step_03_Mypage.click_back_button_in_mypage_page()"
});
formatter.result({
  "status": "skipped"
});
});