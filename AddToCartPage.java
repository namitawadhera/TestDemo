package com.flower.TestCases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.flower.base.TestBase;

public class AddToCartPage extends TestBase{
	
	
	
	//Validate Gurgaon city is displayed on location field on Add To Cart Page
  
  public void validateCity() {
	  
	  WebElement locationDisplayField = driver.findElement(By.xpath("//*[@class=\"pro-city-search\"]//input[1]"));
	  String locationValue = locationDisplayField.getAttribute("value");
	  
	  System.out.println("Location displayed on Add To Cart Page is:::"+locationValue);
	  
	  if(locationValue.equalsIgnoreCase("Gurgaon")) {
		  System.out.println("City is displayed correctly as:::"+locationValue);
	  }
	  
	  else {
		  System.out.println("Incorrect city is displayed... Kindly validate");
	  }
  }
  
      //Click on 1 kg weight
  
   @Test(priority=7)
     public void selectcakeWeight() throws InterruptedException {
    	 
    	 //Thread.sleep(3000);
	   
	   	WebElement closeBtn = driver.findElement(By.xpath("//*[@class=\"overlay jx_ui_Widget\"][2]"));
	   	closeBtn.click();
    	 System.out.println("hello1");
    	 
    	 //Locator for 1 kg weight
    	 //WebElement cakeWeight = driver.findElement(By.xpath("//*[text()='1 Kg']"));
    	//WebElement cakeWeight = driver.findElement(By.xpath("//*[@id=\"15\"]"));
    	 
    	 
    	 driver.findElement(By.xpath("(//ul[@id='edit-product-attribute-10']/li)[2]")).click();
    	 
    	 System.out.println("hello2");
    	 
    	 //scrollToElement(cakeWeight);
    	 
    	  
    	 System.out.println("1 kg weight is selected");
    	 
    	
    	 //Locator for checkbox
    	 
    	 driver.findElement(By.xpath("//span[@class='checkmark'][1]")).click();
    	 //setExplicitWait(egglessBox);
    	 //egglessBox.click();
 		System.out.println("Checkbox is clicked");
 		
 		//Locator for msg print
 		WebElement Message = driver.findElement(By.xpath("(//*[@id='edit-product-attribute-16'])[1]"));
 		Message.click();
 		Message.sendKeys("Happy birthday....");
 		
 		//Locator for Buy now button
 		
 		WebElement buttonClick= driver.findElement(By.xpath("//*[text()=\"BUY NOW\"]"));
  	  System.out.println("Selecting buy now option");
  	  buttonClick.click();
 	
    	 }
    	 
     //Click on checkbox for making cake eggless
    	 
     
      
    /*  public void clickBox() throws InterruptedException {
    	 
    	// WebElement egglessBox= driver.findElement(By.xpath("//*[@class=\"form-checkbox\"]"));
    	  WebElement egglessBox= driver.findElement(By.xpath("//span[@class='checkmark'][1]"));
    	 scrollToElement(egglessBox);
    	 setExplicitWait(egglessBox);
    	 Thread.sleep(1000);

    		 egglessBox.click();
    		System.out.println("Checkbox is clicked");
    	
    	 
    	 
     }*/

	
     //Validate View More functionality of reviews
     
      
      public void displayViewMore() throws InterruptedException {
    	 
    	 WebElement viewMore = driver.findElement(By.xpath("//a[text()='View More'][1]"));
    	 Thread.sleep(2000);
    	 scrollToElement(viewMore);
    	 setExplicitWait(viewMore);
    	 Thread.sleep(2000);
    	 
    	if(viewMore.isDisplayed()) {
    		
    		viewMore.click();
    		
    		Thread.sleep(3000);
    		WebElement giftCityHeader= driver.findElement(By.xpath("//*[@class=\"popular-cities\"]//h2[1]"));
    		
    		  /* if(giftCityHeader.isDisplayed()) {
    			   WebElement closeBtn= driver.findElement(By.xpath("//*[@class=\"close-btn\"]"));
    			   closeBtn.click();
    			   System.out.println("City popup msg is closed");
    		   }
    		   else {
    			   
    			   System.out.println("No popup msg present");
    		   }*/
    		
    		   WebElement ratings = driver.findElement(By.xpath("//*[@class=\"rating-recommends-result\"][1]"));
    		   
    		   String ratingsValue= ratings.getText();
    		   System.out.println("Ratings of the cake are:::"+ratingsValue);
    		   Thread.sleep(3000);
    		   driver.navigate().back();
    		   Thread.sleep(2000);
    	}
    	
    	else {
    		
    		System.out.println("No reviews are there for the cake.");
    		
    	}
     }
      
     
     
      //@Test (priority=7)
          public void clickOnBuyButton() throws InterruptedException {
        	  
        	  Thread.sleep(3000);
        	  //WebElement buyNowButton = driver.findElement(By.xpath("//*[@id=\"addToCart\"]/div[2]/a[1]"));
        	  
        	  String mainWindow = driver.getWindowHandle();
        	  
        	  Alert a1 = driver.switchTo().alert();
              a1.dismiss();
              
              driver.switchTo().window(mainWindow);
        	  WebElement buyNowButton = driver.findElement(By.xpath("//*[text()=\"BUY NOW\"]"));
        	  System.out.println("Selecting buy now option");
        	 
              scrollToElement(buyNowButton);
              setExplicitWait(buyNowButton);
              buyNowButton.click();
              Thread.sleep(2000);
              
          }
     
     
}
