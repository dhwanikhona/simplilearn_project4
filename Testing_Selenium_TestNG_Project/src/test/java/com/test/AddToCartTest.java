package com.test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddToCartTest {
	@Test
  public void addToCartTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Desktop\\Tools\\chromedriver_win32/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://automationpractice.com/");
		 driver.findElement(By.linkText("Sign in")).click();
		 driver.findElement(By.id("email")).sendKeys("dhwanikhonadk@gmail.com");
		 driver.findElement(By.id("passwd")).sendKeys("12345");
		 try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    driver.findElement(By.id("SubmitLogin")).click();
    
		    driver.findElement(By.id("search_query_top")).sendKeys("dresses");
			driver.findElement(By.cssSelector("button[type=submit]")).click();
			driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img")).click();
			driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")).click();
			//driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")).click();
			//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")));
		   // driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[3]/div/a")).click();
		   // driver.findElement(By.xpath("[@id=\"header\"]/div[3]/div/div/div[3]/div/a")).click();
			
	        try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        driver.close();
		    driver.quit();
			
		 
  }
}
