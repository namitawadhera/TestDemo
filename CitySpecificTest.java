package com.flower.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.flower.base.TestBase;

public class CitySpecificTest extends TestBase {
	//@FindBy(xpath="//*[text()=\"Express Delivery\"]")
	  //WebElement expreddDelivery = driver.findElement(By.xpath("//*[text()=\"Express Delivery\"]"));
	  
	 //Locator for clocking on Express Delivery --->  Cakes.
	 //Chk with Saurabh, as result below is displaying 2 options:-  cakes and all cakes
	 
	 
	  
	  ////*[contains(@class,'mega-dropdown-inner')]//a[@href='/cakes']
	  
	  //Locator for validating text print on cakes page
	  
	 // @FindBy (xpath="//*[@class=\"js-page-banner\"]/h1")
	 // WebElement cakesHeader = driver.findElement(By.xpath("//*[@class=\"js-page-banner\"]/h1"));
	  
	  //Locator for element "browse by cake" header on Cakes page
	  
	 // @FindBy (xpath="//*[@class=\"slideupdown-category birthday-gifts\"]/h2")
	  //WebElement cakeflavour= driver.findElement(By.xpath("//*[@class=\"slideupdown-category birthday-gifts\"]/h2"));
	  
	 // String textvalidate = cakeflavour.getText();
	  
	  //Locator for Blackforest cake
	  
	  @FindBy (xpath="//*[@class=\"slideupdown-category birthday-gifts\"]//../a")
	  WebElement blackForestCake;
	  
	 // String cakeFlavourSelect = "Black Forest";
	  
	//Locator for Filter element on Page
		
	  
	//@FindBy (xpath="//*[@class=\"listItemDesktopView\"]//h3")
	//WebElement filterIcon = driver.findElement(By.xpath("//*[@class=\"listItemDesktopView\"]//h3"));
	  
	  
	  //Function to click on Cakes (Blackforest cake
	  
	 @Test(priority=3) 
	public void navigateToCakes() {
	
		Actions actions = new Actions(driver);
		
		WebElement expressDelivery = driver.findElement(By.xpath("//*[text()=\"Express Delivery\"]"));
		actions.moveToElement(expressDelivery).build().perform();
		
		System.out.println("pass1");
		
	// WebElement cakes = driver.findElement(By.xpath("//div[@class='mega-dropdown-inner'])[6]//ul//li//a[text()='Cakes']"));
	//WebElement cakes = driver.findElement(By.xpath("//div[@class='mega-dropdown-inner']//a[text()=\"Cakes\"][1]"));
		WebElement cakes = driver.findElement(By.xpath("//a[@href=\"/cakes\"][1]"));
	System.out.println("pass2");
	setExplicitWait(cakes);
	cakes.click();
	
	System.out.println("pass3");
		  
		  
		  WebElement cakesHeader = driver.findElement(By.xpath("//*[@class=\"js-page-banner\"]/h1"));
		  
		  System.out.println("pass4");
		  setExplicitWait(cakesHeader);
		  String text= cakesHeader.getText();
		  System.out.println("pass5");
		  
		  //assertEqualValidation("Online Cake Delivery In India", text);
			 
		  //boolean result= Assert.assertEquals(text, "Online Cake Delivery In India");
		  Assert.assertEquals("Online Cake Delivery In India", text);
				 System.out.println("Message is displayed correctly");
			
			
				 
				 
				 
				 WebElement cakeflavour= driver.findElement(By.xpath("//*[@class=\"slideupdown-category birthday-gifts\"]/h2"));
				 scrollToElement(cakeflavour);
				 
				 String textvalidate = cakeflavour.getText();
				 System.out.println(textvalidate);
				 
	  
	  }
      
	@Test(priority=4)
	  public void clickOnCake() throws InterruptedException {
		  
		 // navigateToCakes();
		  
		  //Locator for finding list of number of cakes present by flavour
		  
		  List<WebElement> cakeList = driver.findElements(By.xpath("//*[@class=\"slideupdown\"]//a"));
		 
		  
		  String cakeFlavourSelect = "Black Forest";
		  
          for (WebElement we : cakeList) {
        	  System.out.println("name of cakes present on same page::: "+we.getText());
			  if(we.getText().equalsIgnoreCase(cakeFlavourSelect)) {
				  
				  //If Blackforest cake is found then click on it
			    clickElement(we);
			    
			    System.out.println("pass6");
			    Thread.sleep(1000);
			    
			    WebElement filterIcon = driver.findElement(By.xpath("//*[@class=\"listItemDesktopView\"]//h3"));
			    setExplicitWait(filterIcon);
			    System.out.println("User is navigated to cake specific page");
		          break;
			  }
			  else {
				  System.out.println("No blackforest cake found.. Please try again");
			  }
          }
	
			 
          System.out.println("finished tc");    
          
	  }
	
	
}

