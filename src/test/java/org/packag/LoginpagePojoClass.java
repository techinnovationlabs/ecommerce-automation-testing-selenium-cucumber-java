package org.packag;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.stepdefenition.BaseClass1;

public class LoginpagePojoClass extends BaseClass1{

	public LoginpagePojoClass() {
		PageFactory.initElements(driver, this);
	}
	//sign inlink
	@FindBy(linkText="Sign in")
	private WebElement signin;
	
	//signin email
	public WebElement getUserName() {
		return userName;
	}
	@FindBy(id ="email")
	private WebElement userName;
	
	//signin password
	@FindBy(xpath = "//*[@id='passwd']")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	//Signin submit button
	@FindBy(id = "SubmitLogin")
	private WebElement btn;
	public WebElement getBtn() {
		return btn;
	}
	
	//signup email
		public WebElement getsignupemail() {
			return signupemail;
		}
		@FindBy(xpath="//*[@id='email_create']")
		private WebElement signupemail;
	
	//sign up create an account button
		@FindBy(xpath="//*[@id='SubmitCreate']")
		private WebElement createsignupbtn;
		public WebElement getcreateBtn() {
			return createsignupbtn;
		}

		
		//reg firstname
		public WebElement getregFirstname() {
			return reguserName;
		}
		@FindBy(xpath="//*[@id='customer_firstname']")
		private WebElement reguserName;
		
		
	//reg lastname
		public WebElement getregLastname() {
			return reglastName;
		}
		@FindBy(xpath="//*[@id='customer_lastname']")
		private WebElement reglastName;
		
		
	//reg password
		public WebElement getregpassword() {
			return regpasswdName;
		}
		@FindBy(xpath="//*[@id='passwd']")
		private WebElement regpasswdName;
		
	//reg Address
		public WebElement getregaddress() {
			return regaddress;
		}
		@FindBy(xpath="//*[@id='address1']")
		private WebElement regaddress;
		
	//reg city
		public WebElement getregcity() {
			return regcity;
		}
		@FindBy(xpath="//*[@id='city']")
		private WebElement regcity;	
		
	//reg state
		public WebElement getstate() {
			return regstate;
		}
		@FindBy(xpath = "//select[contains(@name,'id_state')]")
		private WebElement regstate;
		
	//reg zip
		public WebElement getregzip() {
			return regzip;
		}
		@FindBy(xpath="//*[@id='postcode']")
		private WebElement regzip;	
		
	//reg country
		public WebElement getregcountry() {
			return regcountry;
		}
		@FindBy(xpath="//*[@id='id_country']")
		private WebElement regcountry;	

		
	//reg mobileno
		public WebElement getregmobileno() {
			return regmobileno;
		}
		@FindBy(xpath="//*[@id='phone_mobile']")
		private WebElement regmobileno;	
		
	//reg Address1
		public WebElement getregaddress1() {
			return regaddress1;
		}
		@FindBy(xpath="//*[@id='alias']")
		private WebElement regaddress1;
		
	//click on register button
			@FindBy(xpath="//*[@id='authentication']")
			private WebElement regbtn;
			public WebElement getSubmitregbtn() {
				return regbtn;
			}		
		
	//Select Dresses Menu
			@FindBy(xpath="//*[@id='block_top_menu']/ul/li[2]/a")
			private WebElement dressmenubtn;
			public WebElement selectdressmenubtn() {
			return dressmenubtn;
						}	
		
	//Mouse Hover the dress image
			@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")
			private WebElement addcartbtn;
			public WebElement addtocartbtn() {
			return addcartbtn;
						}		
			
   //Mouse Hover the dress image
			@FindBy(xpath="//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]")
			private WebElement clickcartbtn;
			public WebElement clickaddtocart() {
			return clickcartbtn;
						}
		
	//Select proceed to checkout btn from pop up page
			@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
			private WebElement proceedcheckoutbtn;
			public WebElement successproceedcheckoutbtn() {
			return proceedcheckoutbtn;
			}
			
	//Click on Proceed to check out from summary page
			@FindBy(xpath="//*[@id='center_column']/p[2]/a[1]")
			private WebElement summary_pchkutbtn;
				public WebElement get_summary_pchckotbtn() {
				return summary_pchkutbtn;			
				}			
	//Click on Proceed to check out from address page
				@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button")
				private WebElement address_pchkutbtn;
							public WebElement get_address_pchckotbtn() {
								return address_pchkutbtn;
							}	
							
	//Click on check box  from shipping page
				@FindBy(xpath="//*[@id=\"uniform-cgv\"]")
				private WebElement shippingcheckbx;
					public WebElement get_shipping_chkbx() {
							return shippingcheckbx;		
					}					
				
	//Click on Proceed to check out from payment page
			@FindBy(xpath="//*[@id='form']/p/button")
			private WebElement payment_pchkutbtn;
				public WebElement get_payment_pchckotbtn() {
						return payment_pchkutbtn;		
				}
		
	//Click on Proceed to check out from payment type page
				@FindBy(xpath="//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")
				private WebElement payment_bankbtn;
							public WebElement get_paymentbank_btn() {
								return payment_bankbtn;
							}		
  //Click on confirm my order
							@FindBy(xpath="//*[@id=\"cart_navigation\"]/button")
							private WebElement payment_cnfbtn;
										public WebElement get_cnfpay_btn() {
											return payment_cnfbtn;
										}
	
		
//Click on signout button
						@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[2]/a")
						private WebElement signout;
							public WebElement get_signoutbtn() {
											return signout;
													}		
//click on signin button
	public WebElement sigin() {
		// TODO Auto-generated method stub
		return signin;
	}

}
