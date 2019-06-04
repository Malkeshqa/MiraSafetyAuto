package com.MS.qa.testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestQA {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Test\\MiraSafety\\browserdriver\\chromedriver74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mirasafety.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/header/div[1]/div[1]/div/div[2]/a[1]/span")).click();
		driver.findElement(By.id("CustomerEmail")).sendKeys("demo001@mailinator.com");
		driver.findElement(By.id("CustomerPassword")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[3]/main/div/div/div/div[2]/form/div/p[2]/button")).click(); // Click on Sign in Button
		driver.findElement(By.xpath("/html/body/div[2]/div/header/div[2]/div/nav/ul/li[3]")).click(); // Click on Product Btn
		driver.findElement(
				By.xpath("/html/body/div[3]/main/div[2]/div/div[1]/ul/li[1]/div/div[2]/div[4]/div[2]/form/a")).click(); // Click on AddTocart Button
		driver.findElement(By.xpath("//*[@id='AddToCartText-product-template']")).click();
		Thread.sleep(3000L);
		assert driver.findElement(By.xpath("//*[@id='CartSpecialInstructions']")).isDisplayed();
		driver.findElement(By.xpath("//*[@id='CartSpecialInstructions']")).sendKeys("test");
		System.out.println("text entered");
		Thread.sleep(3000L);
		assert driver.findElement(By.xpath("/html/body/div[3]/main/div/div/form/div/div[2]/div/div[3]/button"))
				.isDisplayed();
		driver.findElement(By.xpath("/html/body/div[3]/main/div/div/form/div/div[2]/div/div[3]/button")).click();

	}
	// *[@id="AddToCartText-product-template"]

}
