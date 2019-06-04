package com.MS.qa.testcases;

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

	@BeforeMethod
	public void setUp() {
		initialization();
		productpage = new ProductPage();
		loginpage = new LoginPage();
		myaccountpage = loginpage.login(prop.getProperty("email"), prop.getProperty("pass"));
		productpage = myaccountpage.clickOnProductPage();
	}

	@Test
	public void checkOutProduct() {
		// Assert.assertEquals(productpage.validateProductPageTitle(), "Home page",
		// "Product Page Title not Verified");
		productpage.checkOutProduct();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
