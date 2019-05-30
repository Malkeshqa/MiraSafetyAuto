package com.MS.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MS.qa.base.TestBase;

public class CartClearPage extends TestBase {

	@FindBy(xpath = "//*[contains(@class,'cart_remove')]")
	WebElement deleteBtn;

	@FindBy(xpath = "//*[contains(@class,'cart--empty-message')]")
	WebElement verifyemptyMess;

	@FindBy(xpath = "//*[contains(@class,'cart__continue-btn')]")
	WebElement continueShoppintBtn;

	public CartClearPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnDeleteBtn() {
		deleteBtn.click();
	}

	public String validateEmptyMess() {
		return verifyemptyMess.getText();
	}

	public boolean validateContinueShoppintBtn() {
		return continueShoppintBtn.isDisplayed();
	}

}
