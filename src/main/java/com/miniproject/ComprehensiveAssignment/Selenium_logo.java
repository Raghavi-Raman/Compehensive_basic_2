package com.miniproject.ComprehensiveAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_logo {
		public static void main (String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Z00530863\\eclipse-workspace\\ComprehensiveAssignment\\chdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.automationanywhere.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2);
		
		WebElement logo = driver.findElement(By.xpath("//img[@src='/sites/default/files/images/default-images/logo-aa-new.svg']"));
		
		if (logo.isDisplayed()) {
		System.out.println("Automation Anywhere logo is present");
		}
		
		else {
		System.out.println("Automation Anywhere logo is not present");
		}
		
		WebElement Reqdemo = driver.findElement(By.xpath("//a[text()='Request Demo']"));
		
		if (Reqdemo.isEnabled()) {
		System.out.println("Request Demo is clickable");
			}
			
		else {
		System.out.println("Request Demo is not clickable");
		
			}
		driver.close();
		}
		
		
}
