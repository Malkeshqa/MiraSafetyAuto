package com.MS.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.MS.qa.base.TestBase;
import com.google.common.base.Verify;

public class AboutPage extends TestBase {

	@FindBy(xpath = "/html/body/div[3]/main/div/div[1]/div[2]/div/div")
	WebElement aboutsection;

	@FindBy(xpath = "/html/body/div[3]/main/div/div[4]/div")
	WebElement agencieSection;

	@FindBy(id = "shopify-section-about-core-values")
	WebElement coresection;

	@FindBy(id = "shopify-section-about-team")
	WebElement teamSection;

	@FindBy(xpath = "/html/body/div[3]/main/div/div[1]/div[2]/div/div/div[1]")
	WebElement aboutTitle;

	public AboutPage() {
		PageFactory.initElements(driver, this);
	}

	public String validateTitle() {
		return driver.getTitle();
	}

	public void validatesSection() {
		String aboutHeader = aboutTitle.getText();

		if (aboutHeader.equals("ABOUT US")) {
			System.out.println("About Section Available");
		} else {
			System.out.println("About Section not Avilable");
		}

	}

	public void validatecoreSection() {
		if (coresection.isDisplayed()) {
			System.out.println("CoreSection Display");
		} else {
			System.out.println("Core Section not Display");
		}
	}

	public void validateTeamSection() {
		if (teamSection.isDisplayed()) {
			System.out.println("TeamSection Display");
		} else {
			System.out.println("TeamSection not Display");
		}
	}

}
