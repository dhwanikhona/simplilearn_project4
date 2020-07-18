package com.test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void loginTest() {
	  
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
	    String actualUrl= "http://automationpractice.com/index.php?controller=my-account";
	    String expectedUrl= driver.getCurrentUrl();
	    if(actualUrl.equalsIgnoreCase(expectedUrl))
	    {
	    System.out.println("Test passed");
	    }
	    else
	    {
	    System.out.println("Test failed!! Wrong Email id or Password!");
	    }
	    driver.close();
	    driver.quit();		 
	  
  }
}
