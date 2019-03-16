package com.first.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\New\\NewPrjct\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement nm = driver.findElement(By.id("email"));
		nm.sendKeys("rkrajrock@gmail.com");
		WebElement ps = driver.findElement(By.id("pass"));
		ps.sendKeys("4321425354345");
		
		
		
		
	}

}
