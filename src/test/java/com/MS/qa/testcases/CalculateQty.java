package com.MS.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MS.qa.base.TestBase;
import com.MS.qa.pages.LoginPage;
import com.MS.qa.pages.MyAccountPage;
import com.MS.qa.pages.ProductPage;

public class CalculateQty extends TestBase {
	LoginPage loginpage;
	ProductPage productpage;
	MyAccountPage myaccoupage;

	@BeforeMethod
	public void setup() {
		initialization();
		productpage = new ProductPage();
		loginpage = new LoginPage();
		myaccoupage = loginpage.login(prop.getProperty("email"), prop.getProperty("pass"));
		productpage = myaccoupage.clickOnProductPage();
	}

	@Test
	public void CalculateQtyPerPrice() {
		Assert.assertEquals(productpage.validateProductTitle(), "Home page", "Product Page Title not Matched");
		productpage.clickOnShopNowBtn();
		productpage.clickOnAddCartButton();
		productpage.CalculateQty();
	}

	/*@AfterMethod
	public void tearDown() {
		driver.quit();
	}*/

}
