package com.MS.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MS.qa.base.TestBase;
import com.MS.qa.pages.CartClearPage;
import com.MS.qa.pages.LoginPage;
import com.MS.qa.pages.MyAccountPage;
import com.MS.qa.pages.ProductPage;

public class CartClearTest extends TestBase {
	LoginPage loginpage;
	MyAccountPage myaccountpage;
	ProductPage productpage;
	CartClearPage cartclearpage;

	public CartClearTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		cartclearpage = new CartClearPage();
		loginpage = new LoginPage();
		myaccountpage = loginpage.login(prop.getProperty("email"), prop.getProperty("pass"));
		productpage = myaccountpage.clickOnProductPage();

	}

	@Test
	public void CartClearTest() {
		Assert.assertEquals(productpage.validateProductTitle(), "Home page", "Product Page Title not Matched");

		productpage.clickOnShopNowBtn();
		productpage.clickOnAddCartButton();
		cartclearpage.clickOnDeleteBtn();
		Assert.assertEquals(cartclearpage.validateEmptyMess(), "Your cart is currently empty.",
				"Clear Cart Message not Verified");
		Assert.assertTrue(cartclearpage.validateContinueShoppintBtn());
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
