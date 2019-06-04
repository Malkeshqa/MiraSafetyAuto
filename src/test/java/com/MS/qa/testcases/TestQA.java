package com.MS.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.MS.qa.base.TestBase;
import com.MS.qa.pages.ProductPage;

public class TestQA extends TestBase {
	ProductPage productpage;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium1\\MiraSafety2\\MiraSafetyAuto\\browserdriver\\chromedriver74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mirasafety.com/collections/frontpage/products/cm-7m-military-gas-mask");
		driver.findElement(By.xpath("//*[@id='AddToCartText-product-template']")).click();
		Thread.sleep(3000L);
		assert driver.findElement(By.xpath("//*[@id='CartSpecialInstructions']")).isDisplayed();
		driver.findElement(By.xpath("//*[@id='CartSpecialInstructions']")).sendKeys("test");
		System.out.println("text entered");

		Thread.sleep(3000L);
		assert driver.findElement(By.xpath("/html/body/div[3]/main/div/div/form/div/div[2]/div/div[3]/button"))
				.isDisplayed();
		driver.findElement(By.xpath("/html/body/div[3]/main/div/div/form/div/div[2]/div/div[3]/button")).click();
		Thread.sleep(3000);
		String title = "Information - MIRA Safety - Checkout";
		if (title.equals("Information - MIRA Safety - Checkout")) {
			System.out.println("CheckOut Page displays");
		} else {
			System.out.println("Checkout page not displays");
		}

	}
	// *[@id="AddToCartText-product-template"]

}
