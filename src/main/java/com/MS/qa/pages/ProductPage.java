package com.MS.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MS.qa.base.TestBase;

public class ProductPage extends TestBase {

	// Page Factory
	@FindBy(xpath = "/html/body/div[3]/main/div[2]/div/div[1]/ul/li[1]/div/div[2]/div[4]/div[2]/form/a")
	WebElement clickOnShopNowBtn;

	@FindBy(id = "AddToCartText-product-template")
	WebElement clickOnAddTOCartBtn;

	@FindBy(name = "checkout")
	WebElement clickOnCheckOutBtn;

	public void init() {
		PageFactory.initElements(driver, this);
	}

	public String validateProductPageTitle() {
		return driver.getTitle();
	}

	public void checkOutProduct() {
		clickOnShopNowBtn.click();
		clickOnAddTOCartBtn.click();
		clickOnCheckOutBtn.click();
	}

}
