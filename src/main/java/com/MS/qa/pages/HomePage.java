package com.MS.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MS.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "/html/body/div[2]/div/header/div[2]/div/nav/ul/li[1]/a")
	WebElement home;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnHomeButton() {
		home.click();

	}

	public String validateHomePageTitle() {
		return driver.getTitle();
	}

}
