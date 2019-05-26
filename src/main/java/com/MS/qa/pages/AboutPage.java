package com.MS.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.MS.qa.base.TestBase;
import com.google.common.base.Verify;

public class AboutPage extends TestBase {

	@FindBy(xpath = "/html/body/div[3]/main/div/div[1]/div[2]/div/div")
	WebElement aboutSection;

	@FindBy(xpath = "/html/body/div[3]/main/div/div[2]/div")
	WebElement coreSection;

	@FindBy(xpath = "/html/body/div[3]/main/div/div[3]/div")
	WebElement teamSection;

	@FindBy(xpath = "/html/body/div[3]/main/div/div[4]/div")
	WebElement agencieSection;

	@FindBy(id = "shopify-section-about-core-values")
	WebElement coresection;

	@FindBy(xpath = "/html/body/div[3]/main/div/div[1]/div[2]/div/div/div[1]/h2")
	WebElement aboutTitle;

	public String validateTitle() {
		return driver.getTitle();
	}

	public void validatesSection() {
		String aboutHeader = "About us";
		if (aboutHeader.equals("About us")) {
			System.out.println("About Section Available");
		} else {
			System.out.println("About Section not Avilable");
		}

	}

}
