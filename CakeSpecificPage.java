package com.flower.TestCases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.flower.base.TestBase;
import com.google.common.base.CharMatcher;

public class CakeSpecificPage extends TestBase {
	//Locator for Filter element on Page
	
		
		//WebElement filterIcon = driver.findElement(By.xpath("//*[@class=\"listItemDesktopView\"]//h3"));
		
		//Locator  for Relationship button
		
		//WebElement relationshipBtn = driver.findElement(By.xpath("//*[contains(@class,'co_catgory catgory_index_1')]"));
		
		// Locator for Occassion field
		
		//WebElement occassionBtn = driver.findElement(By.xpath("//*[contains(@class,'co_catgory catgory_index_2')]"));
		
		//Locator for Age Group button
		
		//WebElement ageBtn = driver.findElement(By.xpath("//*[contains(@class,'co_catgory catgory_index_3')]"));
		
		//Locator for Buy Now button
		//WebElement buyNowBtn = driver.findElement(By.xpath("//*[@id=\"addToCart\"]/div[2]/a[1]"));
		
		
		
		//Window Handler for CakeSpecific page
		
		//String mainWindowHandle = driver.getWindowHandle();
		
		// Validate that filter icon is present
		@Test (priority=5)
		public void validateFilterIcon() {
			
			//Locator for Sell Price Button
			WebElement sellPriceBtn = driver.findElement(By.xpath("//*[contains(@class,'co_catgory catgory_index_0')]"));
			if(display(sellPriceBtn)==true) {
				
				System.out.println("User is on Cake Specific page");
			}
			
			else {
				System.out.println("User is on different page. Navigate to cake specific page");
			}
		}
			
			
			//Function for clicking on a page
			
			
		@SuppressWarnings("deprecation")
		@Test(priority=6)
		public void clickACake() throws InterruptedException {
			
			//Window Handler for CakeSpecific page
			
					
			
				List<WebElement> cakesPresent = driver.findElements(By.xpath("//*[contains(@class,'prod-detail-wrap')]//a"));
				System.out.println("Number of blackforest cakes are::"+cakesPresent.size());
				//System.out.println("Number of cakes specific to selected category are::"+cakesPresent);
				
				//clicking on first cake.  Check if this works????
			
				for ( WebElement client: cakesPresent) { 
					
					System.out.println("name of cakes present selected::: "+client.getText());
					String cakeName= client.getText();
					WebElement price = driver.findElement(By.xpath("//*[@class=\"flt price\"][1]"));
					
					String priceTag= price.getText();
					System.out.println("Price of the cake:::"+priceTag);
					String mainWindowHandle = driver.getWindowHandle();

			         client.click();
			         break;
			}
				Set<String> allWindowHandles = driver.getWindowHandles();
		        Iterator<String> iterator = allWindowHandles.iterator();
				
		        while (iterator.hasNext()) {
		            String ChildWindow = iterator.next();
		                //if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
		                driver.switchTo().window(ChildWindow);
		                Thread.sleep(5000);
		                addToCartPage();
		                
		                //validate cart page details are same
		                
		                validateCakeDetails();
		        }
		}
		                
		               
				
			
		
	               			
		 // Validate that on clicking a cake the new window tab is opened	
		
		
		public void addToCartPage() throws InterruptedException {
				
			//Get handles of all windows
				
			
	                
	              //Locator for Buy Now button
	                System.out.println("Add to cart page is displayed");
	                
	         
	                
	                WebElement buyNowBtn = driver.findElement(By.xpath("//*[@id=\"addToCart\"]/div[2]/a[1]"));
	                scrollToElement(buyNowBtn);
	                if(display(buyNowBtn)== true) {
	    				
	    				System.out.println("User is on AddToCart Page");
	    			}
	    			
	    			else {
	    				
	    				System.out.println("User is on some different page... try again");
	    			}
	            }
	        
	        
	        
	        //Write a function to validate cake name and price on CakeSpecificPage and AddToCart Page
	        
		
		public void validateCakeDetails() {
			
			 WebElement cakeHeader= driver.findElement(By.xpath("//*[@class=\"discription-head\"]//h1"));
             System.out.println("Name of cake on Add to cart page is:::"+cakeHeader.getText());
             WebElement priceHeader= driver.findElement(By.xpath("//*[@class=\"discription-head\"]//*[@class=\"priceNumber\"]"));
             String priceValue = priceHeader.getText();
             System.out.println("Price is:::"+priceValue);
             System.out.println(CharMatcher.digit().retainFrom(priceValue));
			
		}
	    
			}
		
		
		
	
