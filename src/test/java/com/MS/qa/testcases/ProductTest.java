package com.MS.qa.testcases;

import java.text.ParseException;

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
	public void setup() {
		initialization();
		productpage = new ProductPage();
		loginpage = new LoginPage();
		myaccountpage = loginpage.login(prop.getProperty("email"), prop.getProperty("pass"));
		productpage = myaccountpage.clickOnProductPage();
		driver.get("https://www.mirasafety.com/collections/frontpage/products/cm-7m-military-gas-mask");

	}

	@Test()
	public void ProductpageTtitleTest() throws ParseException, InterruptedException {
		//Assert.assertEquals(productpage.validateProductTitle(), "Home page", "Product Page Title not Matched");

		// Click on Shop Now Button
		//productpage.clickOnShopNowBtn();

		// Click on AddToCart Button
		productpage.clickOnAddCartButton();
		Thread.sleep(3000);
		assert driver.findElement(By.xpath("/html/body/div[3]/main/div/div/form/div/div[2]/div/div[3]/button")).isDisplayed();
		driver.findElement(By.xpath("/html/body/div[3]/main/div/div/form/div/div[2]/div/div[3]/button")).click();

		// Check Min Qty
		productpage.Calculate();

		// productpage.format();

	}

	/*
	 * @AfterMethod public void teardown() { driver.quit(); }
	 */

}
