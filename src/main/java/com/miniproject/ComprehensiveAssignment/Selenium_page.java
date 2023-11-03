package com.miniproject.ComprehensiveAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_page {
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Z00530863\\eclipse-workspace\\ComprehensiveAssignment\\chdriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
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
		
		driver.close();
	
			}
		}
	


