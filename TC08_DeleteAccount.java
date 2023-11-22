package project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNg.ProjectSpecificMethod;

public class TC08_DeleteAccount extends ProjectSpecificMethod {

	
	
	
	
@Test	
	public void runDeleteAccount() throws InterruptedException {
		
		
	
	
//Step--1--Click on Accounts tab
	
	          WebElement accounts = driver.findElement(By.xpath("//span[text()='Accounts']"));
	       driver.executeScript("arguments[0].click();", accounts);
	
//Step--2--	Search the account 'Your Name'
	Thread.sleep(3000);
	
	          driver.findElement(By.xpath("//input[@class='slds-input']")).click();
	          driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("ponpandian" , Keys.ENTER);
	
//Step--3--	Click on the Drop-down icon
	Thread.sleep(5000);
	
	  		 driver.findElement(By.xpath("(//span[@class='slds-icon_container slds-icon-utility-down'])[2]")).click();
	  		 
//Step--4--Select Delete 	  		 
	  		
	 Thread.sleep(3000);
	
	          driver.findElement(By.xpath("(//li[@class='uiMenuItem'])[2]")).click();
	        
//Step--5--	    Verify Whether account is Deleted account Name     
	
	
	
		String result = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
	
	System.out.println(result);
	
	if(result.equalsIgnoreCase("No items to display."))
		System.out.println("Account Succesfully Deleted");
	
	else 
		System.out.println("Account Succesfully Deleted");
	
	
	
	
	
	
	    }
	
	}
