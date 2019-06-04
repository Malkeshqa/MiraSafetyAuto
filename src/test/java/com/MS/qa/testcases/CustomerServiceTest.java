package com.MS.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MS.qa.base.TestBase;
import com.MS.qa.pages.CustomerServicePage;
import com.MS.qa.pages.LoginPage;
import com.MS.qa.pages.MyAccountPage;
import com.google.common.base.Verify;

public class CustomerServiceTest extends TestBase {
	LoginPage loginpage;
	MyAccountPage myaccountpage;
	CustomerServicePage customerservicespage;

	public CustomerServiceTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		customerservicespage = new CustomerServicePage();
		loginpage = new LoginPage();
		myaccountpage = loginpage.login(prop.getProperty("email"), prop.getProperty("pass"));
		customerservicespage = myaccountpage.clickOnCustomerServiceLink();

	}

	@Test(priority = 1)
	public void ValidateTitle() {
		Assert.assertEquals(customerservicespage.validateCustomerServiceTitle(), "Contact Us");
	}

	@Test(priority = 2)
	public void validatecustomerServiceHeader() {
		customerservicespage.validateHeader();
	}

	@Test(priority = 3)
	public void validateContactUs() {

		Assert.assertTrue(customerservicespage.validateContactUs());
		Assert.assertEquals(customerservicespage.validateContactUstitle(), "WE WANT TO HEAR FROM YOU!",
				"Contactus Title not matched");

	}

	@Test(priority = 4)
	public void ValidateshippintTabTest() {
		customerservicespage.clickOnShipping();
		Assert.assertEquals(customerservicespage.validateShippingTitle(), "Domestic Shipping",
				"Shippint Title not Matched");
	}

	@Test(priority = 5)
	public void validateInternationShippintTest() {
		customerservicespage.clickOnInternationShipping();
		Assert.assertEquals(customerservicespage.validateInternationShippingTitle(), "International Orders",
				"Internation Shipping Title not Matched");
	}

	@Test(priority = 6)
	public void validateReturnsTest() {
		customerservicespage.clickOnReturns();
		Assert.assertEquals(customerservicespage.validateReturnsTitle(), "Return Policy",
				"Internation Shipping Title not Matched");
	}

	@Test(priority = 7)
	public void validateWarrantyClaimsTest() {
		customerservicespage.clickOnWarrantyClaims();
		Assert.assertEquals(customerservicespage.validateWarrantyClaimsTitle(), "WARRANTY CLAIMS",
				"Internation Shipping Title not Matched");
	}

	@Test(priority = 8)
	public void validateWarrantyRegistrationTest() {
		customerservicespage.clickOnwarrantyRegistration();
		Assert.assertEquals(customerservicespage.validatewarrantyRegistrationTitle(), "Warranty Registration",
				"Warranty Registration Title not Matched");
	}

	@Test(priority = 9)
	public void validateFaqTest() {
		customerservicespage.clickOnfaq();
		Assert.assertEquals(customerservicespage.validateFaqTitle(), "FREQUENTLY ASKED QUESTIONS",
				"FAQ Title not Matched");
	}

	@Test(priority = 10)
	public void validateMilitaryDiscountTest() {
		customerservicespage.clickOnMilitaryDiscount();
		Assert.assertEquals(customerservicespage.validateMilitaryDiscountTitle(), "Military & First Responder Discount",
				"Military Discount Title not Matched");
	}

	@Test(priority = 11)
	public void validateTermsOfUseTest() {
		customerservicespage.clickOnTermsOfUse();
		Assert.assertEquals(customerservicespage.validatetermsOfUseTitle(), "Terms of Use",
				"Terms of Use Title not Matched");
	}

	
	public void validatePrivacyPolicyTest() {
		customerservicespage.clickOnPrivacyPolicy();
		Assert.assertEquals(customerservicespage.validateprivacyPolicyTitle(), "Privacy Policy",
				"Privacy Policy Title not Matched");
		driver.navigate().back();
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
