package com.MS.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MS.qa.base.TestBase;
import com.MS.qa.pages.LoginPage;
import com.MS.qa.pages.MyAccountPage;
import com.MS.qa.pages.ProductPage;

public class ProductTest extends TestBase {
	LoginPage loginpage;
	MyAccountPage myaccountpage;
	ProductPage productpage;

	public ProductTest() {
		super();
	}

	@BeforeMethod
	public void setUp() {

		initialization();

		productpage = new ProductPage();
		loginpage = new LoginPage();
		myaccountpage = loginpage.login(prop.getProperty("email"), prop.getProperty("pass"));
		productpage = myaccountpage.clickOnProductPage();

	}

	@Test
	public void productCheckOutTest() throws InterruptedException {
		productpage.clickOnShopNowBtn();
		productpage.clickOnAddCartButton();
		productpage.checkOutproduct("Note");
		Assert.assertEquals(productpage.verifyCheckoutPageTitle(), "Information - MIRA Safety - Checkout",
				"Checkout Page Title not Verify");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
