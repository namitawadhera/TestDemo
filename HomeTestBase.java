package com.flower.TestCases;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.flower.base.TestBase;

public class HomeTestBase extends TestBase{
	
	 
		
	
	  
	
    //Method for selecting city from popup
	 
	  @Test(priority =1)
	  
	  public void launchApplication() throws InterruptedException {
		  setup();
		  maximizeBrowser();
		  Thread.sleep(8000);
	  }
	  
	  @Test(priority=2)
	  public void selectCity() throws InterruptedException {
		  
		  
		  
		  WebElement cityInput = driver.findElement(By.xpath("//*[@id='user-selected-city-input']"));
		 
		  setExplicitWait(cityInput);
		  
		  cityInput.click();
		  Thread.sleep(8000);
		  
		  //Alert popup window is opened. Switch to that window
		// Alert myalert = driver.switchTo().alert();
		  WebElement cityText = driver.findElement(By.xpath("//*[text()='Popular Cities']"));
		 
		  String textCity= cityText.getText();
		  System.out.println("Heading is:::"+textCity);
		  
		  assertEqualValidation("Popular Cities", textCity);
		   
			 System.out.println("Popular cities dropdown is displayed");
			 
			 List <WebElement> cityList= driver.findElements(By.xpath("//*[contains(@class,'city-list')]//p"));
			 Thread.sleep(2000);
			 //System.out.println("name of cities present on same page::: "+cityList);
		  
			 
		 for (WebElement we : cityList) {
			  
			 System.out.println("name of cities present on same page::: "+we.getText());
			  if(we.getText().equalsIgnoreCase("Gurgaon")) {
			    we.click();
			    break;
			  }
			  
			  else {
				  System.out.println("Selected city is NOT present... Try again");
			  }
		 }
			  
		
		 
		 
		  
	  }
}

