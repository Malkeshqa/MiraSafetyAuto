package com.MS.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MS.qa.base.TestBase;
import com.MS.qa.pages.LoginPage;
import com.MS.qa.pages.MyAccountPage;
import com.MS.qa.pages.ProductPage;

public class CalculateQtyTest extends TestBase {
	LoginPage loginpage;
	MyAccountPage myaccountpage;
	ProductPage productpage;

	public CalculateQtyTest() {
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
	public void validateTitle() {
		Assert.assertEquals(productpage.validateProductTitle(), "Home page", "Product Page title not verify");
		productpage.clickOnShopNowBtn();
		productpage.clickOnAddCartButton();

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@class,'cart-header__title')]")))
				.isDisplayed();
		productpage.calculateQty();
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
