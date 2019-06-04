package com.MS.qa.testcases;

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
	public void setup() {
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
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
