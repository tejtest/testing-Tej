package com.qa.project1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void method1() throws Exception {
		Reporter.log("Testcase ID= TC02");
		RemoteWebDriver driver= new ChromeDriver();
		Reporter.log("The browser is opened now.");
		driver.get("http://dev-ec-web-admin.s3-website.ap-south-1.amazonaws.com");
		Thread.sleep(3000);
		Reporter.log("The application website is opened.");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Reporter.log("The browser is maximized.");
		driver.findElement(By.xpath("//a[@class='readTitle'][text()='Contact']")).click();
		Thread.sleep(3000);
		Reporter.log("Contact Tab at the top of the page has been clicked.");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Abcd");
		Thread.sleep(3000);
		Reporter.log("Entry made in the name field");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Abcd@gmail.com");
		Thread.sleep(3000);
		Reporter.log("Entry made in the email field");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234567890");
		Thread.sleep(3000);
		Reporter.log("Entry made in the phone field");
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Hello");
		Thread.sleep(3000);
		Reporter.log("Entry made in the Subject field");
		driver.findElement(By.xpath("//textarea[@placeholder='Write message']")).sendKeys("Hello");
		Thread.sleep(3000);
		Reporter.log("Entry made in the Message field");
		driver.findElement(By.xpath("//button[text()='Send Message']")).click();
		Thread.sleep(3000);
		Reporter.log("Send Message button clicked");
		driver.quit();
		Reporter.log("The browser has been closed.");
		
	}

}
