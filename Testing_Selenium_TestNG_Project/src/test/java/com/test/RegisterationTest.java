package com.test;

import org.testng.annotations.Test;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterationTest {
	
  
@Test
  public void registerationTest() {
	  
   	  	 WebDriver webdriver = null;
	  
   	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP-PC\\Desktop\\Tools\\chromedriver_win32/chromedriver.exe");
		 webdriver= new ChromeDriver();
		 webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 String actualUrl = "http://automationpractice.com/";
		 webdriver.get(actualUrl);
		 webdriver.findElement(By.linkText("Sign in")).click();
		 webdriver.findElement(By.id("email_create")).sendKeys("dkkhona123@gmail.com");
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 webdriver.findElement(By.id("SubmitCreate")).click();

		 String valueOfGender = "2"; //in this case, value is integer, it can be String in most of the cases.
		  
		 List<WebElement> RadioButtonList = webdriver.findElements(By.name("id_gender"));
		  
		 System.out.println("Total numer of Radio Buttons for gender field is: " +RadioButtonList.size());
		  
		  for (int i = 0; i < RadioButtonList.size(); i++){
		   String gend = RadioButtonList.get(i).getAttribute("value");
		   if (gend.equalsIgnoreCase((valueOfGender))){
		    RadioButtonList.get(i).click();
		    break;
		   }
		   
		  }
		 webdriver.findElement(By.id("customer_firstname")).sendKeys("Dhwani");
		 webdriver.findElement(By.id("customer_lastname")).sendKeys("Khona");
		 webdriver.findElement(By.id("passwd")).sendKeys("12345");
		 WebElement days = webdriver.findElement(By.id("days"));
		 days.click();
		 webdriver.findElement(By.xpath("//*[@id=\"days\"]/option[19]")).click();
		 WebElement months = webdriver.findElement(By.id("months"));
	   	 months.click();
		 webdriver.findElement(By.xpath("//*[@id=\"months\"]/option[5]")).click();
		 WebElement years = webdriver.findElement(By.id("years"));
		 years.click();
		 webdriver.findElement(By.xpath("//*[@id=\"years\"]/option[24]")).click();
		 webdriver.findElement(By.id("firstname")).sendKeys("Dhwani");
		 webdriver.findElement(By.id("lastname")).sendKeys("Khona");
		 webdriver.findElement(By.id("address1")).sendKeys("BNP Paribas");
		 webdriver.findElement(By.id("city")).sendKeys("Mumbai");
		 //webdriver.findElement(By.id("id_state")).sendKeys("Indiana");
		 WebElement id_state = webdriver.findElement(By.id("id_state"));
		 id_state.click();
		 webdriver.findElement(By.xpath("//*[@id=\"id_state\"]/option[10]")).click();
		 webdriver.findElement(By.id("postcode")).sendKeys("45637");
		 webdriver.findElement(By.id("id_country")).sendKeys("United States");
		 webdriver.findElement(By.id("phone_mobile")).sendKeys("8850107859");
		 webdriver.findElement(By.id("alias")).sendKeys("BNP Paribas");
		 webdriver.findElement(By.id("submitAccount")).click();
		 webdriver.close();
		 webdriver.quit();
	  	  
	 }

    }
  
