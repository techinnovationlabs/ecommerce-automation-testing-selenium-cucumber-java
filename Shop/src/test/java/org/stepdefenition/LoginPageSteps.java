package org.stepdefenition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.packag.LoginpagePojoClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps extends BaseClass1{

	

@Given("User is in landing page")
public void user_is_in_loginpage() {
    LaunchBrowser();
    goToUrl("http://automationpractice.com/index.php");    
}

@When("User has to click the Signin button")
public void User_has_to_click_the_Signin_button() {
	LoginpagePojoClass l = new LoginpagePojoClass();
	l.sigin().click();
}

@Then("Signin button navigate to open the  Authentication page")
public void signin_button_navigate_to_open_the_Authentication_page() {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue(driver.getTitle().contains("My Store"));
	System.out.println("the title of the page when open Authentication page" +driver.getTitle());
}


@When("User has to enter the invalid {string},{string} and click the login button")
public void user_enter_invalid_username_and_password(String s1,String s2) {
    // Write code here that turns the phrase above into concrete actions
	 LoginpagePojoClass l =new LoginpagePojoClass();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  insertValues(l.getUserName(),s1);
	  insertValues(l.getPassword(),s2);
	  l.getBtn().click();
}

@Then("promopt the error message")
public void promopt_the_error_message1() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("the title of the page when open Authentication page" +driver.getTitle());
}


@Given("User is in Signinpage and verify tiltle")
public void user_is_in_Signinpage_and_verify_tiltle() {
    // Write code here that turns the phrase above into concrete actions
	 Assert.assertTrue(driver.getTitle().contains("Login - My Store"));
}

@When("User has to enter the valid {string},{string} and click the login button")
public void user_enter_valid_username_and_password(String s1,String s2) {
    // Write code here that turns the phrase above into concrete actions
	 LoginpagePojoClass l =new LoginpagePojoClass();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  insertValues(l.getUserName(),s1);
	  insertValues(l.getPassword(),s2);
	  l.getBtn().click();
}

@Then("Navigate to open the Home page")
public void promopt_the_error_message() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("The title of the page  when navigate to open Home page is " + driver.getTitle());
}

    
@When("User has to enter the invalid {string} {string},{string},{string},{string},{string},{string},{string},{string},{string},{string} and click the register button and click the register button")
public void signupinvalid(String s0,String s1,String s2, String s3, String s4, String s5, String s6, String s7,String s8, String s9, String s10) {
    // Write code here that turns the phrase above into concrete actions
	LoginpagePojoClass l =new LoginpagePojoClass();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  insertValues(l.getsignupemail(),s0);
	  l.getcreateBtn().click();
	  insertValues(l.getregFirstname(),s1);
      insertValues(l.getregLastname(),s2);
      insertValues(l.getregpassword(),s3);
      insertValues(l.getregaddress(),s4);
      insertValues(l.getregcity(),s5);
      System.out.println("s6 is" +s6);
      System.out.println((l.getstate()));
      dropdown1(l.getstate(),s6);
       insertValues(l.getregzip(), s7);
	   dropdown2(l.getregcountry(),s8);
	   insertValues(l.getregmobileno(), s9);
	   insertValues(l.getregaddress1(), s10);
      l.getSubmitregbtn().click();
}

@Then("Prompt the error")
public void signupinvalidemail() {
    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue(driver.getTitle().contains("Invalid email address"));
}


@When("User has to enter the valid {string} {string},{string},{string},{string},{string},{string},{string},{string},{string},{string} and click the register button and click the register button")
public void registrationvalid(String s0,String s1, String s2, String s3, String s4, String s5, String s6, String s7,String s8, String s9, String s10) {
	 LoginpagePojoClass l =new LoginpagePojoClass();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  insertValues(l.getsignupemail(),s0);
	  l.getcreateBtn().click();
	  insertValues(l.getregFirstname(),s1);
      insertValues(l.getregLastname(),s2);
      insertValues(l.getregpassword(),s3);
      insertValues(l.getregaddress(),s4);
      insertValues(l.getregcity(),s5);
      dropdown1(l.getstate(),s6);
       insertValues(l.getregzip(), s7);
	   dropdown2(l.getregcountry(),s8);
	   insertValues(l.getregmobileno(), s9);
	   insertValues(l.getregaddress1(), s10);
      l.getSubmitregbtn().click();
}


@When("select dresses menu")
public void select_dress_menu() {
	 LoginpagePojoClass l =new LoginpagePojoClass();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  l.selectdressmenubtn().click();
}

@Then("Allow to navigate to open the dress page and verify the title of the page")
public void verifydresstitlepage() {
Assert.assertTrue(driver.getTitle().contains("Dresses - My Store"));
System.out.println("the title of the page when navigate to open the dress page " +driver.getTitle());
}


@When("select the dress and click on add to cart button")
public void registrationvalid() {
	System.out.println("Enter in to register");
	 LoginpagePojoClass l =new LoginpagePojoClass();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 System.out.println(l.addtocartbtn());
	 moveToElement(l.addtocartbtn());
	 l.clickaddtocart().click();
}

@Then("pop up should show to proceed  to check out")
public void selectpar_dress() {
System.out.println("the title of the page from the pop up page" +driver.getTitle());
}


@When("user click on proceedtocheckout button from product successfully added page")
public void success_proceedcheckout() {
	 LoginpagePojoClass l =new LoginpagePojoClass();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 l.successproceedcheckoutbtn().click();
}

@Then("Allow to navigate to open the SHOPPING-CART SUMMARY page and verify the title of the page")
public void verifysumarytitlepage() {
System.out.println("the title of the page when navigate to open the SHOPPING-CART SUMMARY page" + driver.getTitle());
}


@When("user click on proceed to checkout button from summary page")
public void get_summary_pchckotbtn()  {
 LoginpagePojoClass l =new LoginpagePojoClass();
 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  l.get_summary_pchckotbtn().click();
}

@Then("Allow to navigate to Address page to proceed to checkout and get title of the page")
public void verifyaddresstitlepage() {
Assert.assertTrue(driver.getTitle().contains("Order - My Store"));
System.out.println("The title of the page when navigate to Address page to proceed to checkout" + driver.getTitle());
}


@When("user click on proceed to checkout button from Address page")
public void get_address_pchckotbtn() {
	 LoginpagePojoClass l =new LoginpagePojoClass();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 l.get_address_pchckotbtn().click();
}

@Then("Allow to navigate to Shipping page to proceed to checkout and get title of the page")
public void verifyshippingtitlepage() {
Assert.assertTrue(driver.getTitle().contains("Order - My Store"));
System.out.println("The title of the page when navigate to shipping page to proceed to checkout" + driver.getTitle());
}


@When("user select the agree and click on proceed to checkout button from shipping page")
public void get_shipping_chkbx() {
	 LoginpagePojoClass l =new LoginpagePojoClass();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  l.get_shipping_chkbx().click();
	  l.get_payment_pchckotbtn().click();
}

@Then("Allow to navigate to payment page to proceed to checkout and get title of the page")
public void verifypaymenttitlepage() {
Assert.assertTrue(driver.getTitle().contains("Order - My Store"));
System.out.println("The title of the page when navigate to payment page to proceed to checkout" + driver.getTitle());
}


@When("user allow to click on i confirm my order")
public void get_cnfpay_btn() {
	 LoginpagePojoClass l =new LoginpagePojoClass();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  l.get_cnfpay_btn().click();
}

@When("user allow to select the card type pay by bank wire")
public void payment_cardbybank() {
	 LoginpagePojoClass l =new LoginpagePojoClass();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  l.get_paymentbank_btn().click();
}

@When("user click on Signout menu")
public void signout() {
	 LoginpagePojoClass l =new LoginpagePojoClass();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  l.get_signoutbtn().click();
}

@Then("close the browser")
public void close_the_browser() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
  
}

}