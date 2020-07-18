package com.test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchTest {
  @Test
  public void searchTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Desktop\\Tools\\chromedriver_win32/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://automationpractice.com/");
		 
		 driver.findElement(By.id("search_query_top")).sendKeys("dresses");
		 driver.findElement(By.cssSelector("button[type=submit]")).click();
		 driver.close();
		 driver.quit();
  }
}
