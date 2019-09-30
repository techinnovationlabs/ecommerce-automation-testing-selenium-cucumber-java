$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/login.feature");
formatter.feature({
  "name": "Login Action",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify signin page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is in landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_in_loginpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click the Signin button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.User_has_to_click_the_Signin_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Signin button navigate to open the  Authentication page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.signin_button_navigate_to_open_the_Authentication_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify signin page valid input",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is in Signinpage and verify tiltle",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to enter the valid \"\u003cuserName\u003e\",\"\u003cpassword\u003e\" and click the login button",
  "keyword": "When "
});
formatter.step({
  "name": "Navigate to open the Home page",
  "keyword": "Then "
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ]
    },
    {
      "cells": [
        "sasireka@mail.asahitechnologies.com",
        "Asahi@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify signin page valid input",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is in Signinpage and verify tiltle",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_in_Signinpage_and_verify_tiltle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to enter the valid \"sasireka@mail.asahitechnologies.com\",\"Asahi@123\" and click the login button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_enter_valid_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to open the Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.promopt_the_error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.close_the_browser()"
});
formatter.result({
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat org.stepdefenition.LoginPageSteps.close_the_browser(LoginPageSteps.java:236)\r\n\tat ✽.close the browser(src/test/resources/Feature/login.feature:22)\r\n",
  "status": "pending"
});
formatter.scenarioOutline({
  "name": "Verify signup page valid input",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter the valid \"\u003cemail\u003e\" \"\u003cfirstname\u003e\",\"\u003clastname\u003e\",\"\u003cpassword\u003e\",\"\u003cAddress\u003e\",\"\u003ccity\u003e\",\"\u003cstate\u003e\",\"\u003cZip\u003e\",\"\u003ccountry\u003e\",\"\u003cmobileno\u003e\",\"\u003cAddress1\u003e\" and click the register button and click the register button",
  "keyword": "When "
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "firstname",
        "lastname",
        "password",
        "Address",
        "city",
        "state",
        "Zip",
        "country",
        "mobileno",
        "Address1"
      ]
    },
    {
      "cells": [
        "ss12345@mail.com",
        "ram",
        "sita",
        "Asahi@123",
        "Asahi,46 Fanepet 2nd Street",
        "chennai",
        "32",
        "600091",
        "United States",
        "9944021254",
        "address1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify signup page valid input",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User has to enter the valid \"ss12345@mail.com\" \"ram\",\"sita\",\"Asahi@123\",\"Asahi,46 Fanepet 2nd Street\",\"chennai\",\"32\",\"600091\",\"United States\",\"9944021254\",\"address1\" and click the register button and click the register button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.registrationvalid(String,String,String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\u0027email_create\u0027]\"}\n  (Session info: chrome\u003d77.0.3865.90)\n  (Driver info: chromedriver\u003d2.44.609538 (b655c5a60b0b544917107a59d4153d4bf78e1b90),platform\u003dWindows NT 6.1.7601 SP1 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PC-PC\u0027, ip: \u0027192.168.2.3\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.44.609538 (b655c5a60b0b54..., userDataDir: C:\\Users\\PC\\AppData\\Local\\T...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:63823}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 77.0.3865.90, webStorageEnabled: true}\nSession ID: 89c2f0c6b2ffda876566d375d73fa4c7\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\u0027email_create\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy14.sendKeys(Unknown Source)\r\n\tat org.stepdefenition.BaseClass1.insertValues(BaseClass1.java:45)\r\n\tat org.stepdefenition.LoginPageSteps.registrationvalid(LoginPageSteps.java:110)\r\n\tat ✽.User has to enter the valid \"ss12345@mail.com\" \"ram\",\"sita\",\"Asahi@123\",\"Asahi,46 Fanepet 2nd Street\",\"chennai\",\"32\",\"600091\",\"United States\",\"9944021254\",\"address1\" and click the register button and click the register button(src/test/resources/Feature/login.feature:42)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.close_the_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Verify Home page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "select dresses menu",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.select_dress_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Allow to navigate to open the dress page and verify the title of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.verifydresstitlepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Dress page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "select the dress and click on add to cart button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.registrationvalid()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "pop up should show to proceed  to check out",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.selectpar_dress()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify product sucessfully added page to proceed to checkout",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on proceedtocheckout button from product successfully added page",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.success_proceedcheckout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Allow to navigate to open the SHOPPING-CART SUMMARY page and verify the title of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.verifysumarytitlepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify proceed to checkout from summary page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on proceed to checkout button from summary page",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.get_summary_pchckotbtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Allow to navigate to Address page to proceed to checkout and get title of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.verifyaddresstitlepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify proceed to checkout from Address page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on proceed to checkout button from Address page",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.get_address_pchckotbtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Allow to navigate to Shipping page to proceed to checkout and get title of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.verifyshippingtitlepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify proceed to checkout from shipping page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user select the agree and click on proceed to checkout button from shipping page",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.get_shipping_chkbx()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Allow to navigate to payment page to proceed to checkout and get title of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.verifypaymenttitlepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify proceed to checkout from payment page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user allow to select the card type pay by bank wire",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.payment_cardbybank()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify confirm the oder from payment page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user allow to click on i confirm my order",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.get_cnfpay_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify signout",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on Signout menu",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.signout()"
});
formatter.result({
  "status": "passed"
});
});