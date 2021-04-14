package com.flower.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.flower.base.TestBase;

public class AddOns extends TestBase{
  
	
	@Test (priority=8)
  public void clickOnAddOns() throws InterruptedException {
	  
	  WebElement candlesAddOn = driver.findElement(By.xpath("//*[contains(@class,'rt01paginner desktop-list rt01hfit selected-0')]//div[2]"));
	  setExplicitWait(candlesAddOn);
	  System.out.println("Magic candles are selected");
	  candlesAddOn.click();
	  System.out.println("candles selected....");
	  
	  Thread.sleep(1000);
	  
	  //Validate the msg displayed at bottom
	  
	  WebElement msgDisplayAtBottom = driver.findElement(By.xpath("//*[@class=\"addon-count\"]"));
	  String msg = msgDisplayAtBottom.getText();
	  System.out.println("Msg is displayed as:::");
	  
	  WebElement downArrow = driver.findElement(By.xpath("//*[@class=\"addon-count-desktop\"]//span"));
	  downArrow.click();
	  
	  //Delete the add-on
	  
	  deleteAddOn();
	  
	  //Again select magic candles add on.
	  
	  candlesAddOn.click();
	  
	  
	  WebElement continueBtn = driver.findElement(By.xpath("//*[@id=\"addon-form-submit\"]"));
	  continueBtn.click();
	  
	  System.out.println("User is directed to payment page");
	  Thread.sleep(3000);
	  
	  WebElement myCart = driver.findElement(By.xpath("//*[text()=\"My Cart\"]"));
	  String welcomeHeader = myCart.getText();
	  
	  if(welcomeHeader.equalsIgnoreCase("My Cart")) {
		  System.out.println("User is on My Cart Page");
	  }
	  
	  
	  else {
		  System.out.println("User is on different page");	  }
	  
	  
	  
  }
	
	public void deleteAddOn() {
		WebElement deleteAddOn = driver.findElement(By.xpath("//span[@class=\"toggle-remove-addon\"]"));
		  deleteAddOn.click();		
	}
}
