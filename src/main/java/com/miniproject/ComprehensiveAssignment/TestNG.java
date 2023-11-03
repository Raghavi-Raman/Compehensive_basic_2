package com.miniproject.ComprehensiveAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	WebDriver driver;
	
	@BeforeTest
	public void browser() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Z00530863\\eclipse-workspace\\ComprehensiveAssignment\\chdriver\\chromedriver.exe");
		
	driver = new ChromeDriver();
	}
	
	@Test (enabled=true)
	public void logo() {
	driver.get("https://www.automationanywhere.com/");	
	driver.manage().window().maximize();
	WebElement logo = driver.findElement(By.xpath("//img[@src='/sites/default/files/images/default-images/logo-aa-new.svg']"));
	
	if (logo.isDisplayed()) {
	System.out.println("Automation Anywhere logo is present");
	}
	
	else {
	System.out.println("Automation Anywhere logo is not present");
	}
	}
	
	@Test (priority=0, timeOut=10000)
	public void click() {
	driver.get("https://www.automationanywhere.com/");	
	driver.manage().window().maximize();
	WebElement Reqdemo = driver.findElement(By.xpath("//a[text()='Request Demo']"));
	
	if (Reqdemo.isEnabled()) {
	System.out.println("Request Demo is clickable");
		}
		
	else {
	System.out.println("Request Demo is not clickable");
	}
	}
	
	@Test
	public void elementclickable() {
		driver.get("https://www.automationanywhere.com/");	
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement Products = driver.findElement(By.xpath("//a[text()='Products']"));

		js.executeScript("arguments[0].click()", Products);	
		
		WebElement Solutions = driver.findElement(By.xpath("//a[text()='Solutions']"));
		
		js.executeScript("arguments[0].click()", Solutions);	
		
		WebElement Resources = driver.findElement(By.xpath("//a[text()='Resources']"));
		
		js.executeScript("arguments[0].click()", Resources);	
		
		WebElement Beyond_RPA = driver.findElement(By.xpath("//a[text()='Beyond RPA']"));
		
		js.executeScript("arguments[0].click()", Beyond_RPA);	
		
		WebElement Company = driver.findElement(By.xpath("//a[text()='Company']"));
		
		js.executeScript("arguments[0].click()", Company);
		
	}
	@AfterTest
	public void close() {
		driver.close();
	}
	
	}

