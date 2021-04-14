package com.flower.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.flower.base.TestBase;

public class MyCart extends TestBase {
	
	@Test
	public void validateMyCartPage() {
	WebElement myCart = driver.findElement(By.xpath("//*[text()=\"My Cart\"]"));
	  String welcomeHeader = myCart.getText();
	  
	  if(welcomeHeader.equalsIgnoreCase("My Cart")) {
		  System.out.println("User is on My Cart Page");
	  }
	  
	  
	  else {
		  System.out.println("User is on different page");	  }
	  
	  
	  
}
}
