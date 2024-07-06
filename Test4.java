package com.qa.project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
	
	@Test
	public void method1() throws Exception {
		Reporter.log("Testcase ID= TC04");
		RemoteWebDriver driver= new ChromeDriver();
		Reporter.log("The browser is opened now.");
		driver.get("http://dev-ec-web-admin.s3-website.ap-south-1.amazonaws.com");
		Thread.sleep(3000);
		Reporter.log("The application website is opened.");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Reporter.log("The browser is maximized.");
		
		driver.findElement(By.xpath("//a[@href='/enroll-now'][@id='testBtn']")).click();
		Thread.sleep(3000);
		Reporter.log("Enroll Now Button has been clicked.");
		WebElement classDropdown=driver.findElement(By.xpath("//select[@class='form-group validate[required]'][@name='classId']")); 
		Thread.sleep(10000);
		Reporter.log("Dropdown has been located.");
		Select className=new Select(classDropdown);
		List<String> CompareOptions = new ArrayList<>(Arrays.asList("Nursery", "Day Care", "Play Group", "Junior KG", "Senior KG"));
		List<WebElement> allOptions = className.getOptions();
		List<String> dropdownOptions = new ArrayList<>();
		
		for(WebElement itr:allOptions) {
			dropdownOptions.add(itr.getText());
					
		}
		
		Collections.sort(CompareOptions);
		Collections.sort(dropdownOptions);
		
		boolean listisequal;
		listisequal= CompareOptions.equals(dropdownOptions);
		Assert.assertEquals(listisequal, true);
		
		driver.quit();
		Reporter.log("The browser has been closed.");
		//WebElement firstValue=className.getFirstSelectedOption();
		//String ActualValue=firstValue.getText();
		//String ExpectedValue="Daycare";
		//Reporter.log("First value of the dropdown has been obtained.");
		//Assert.assertEquals(ActualValue, ExpectedValue);
		
		
	}

}
