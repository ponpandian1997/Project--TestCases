package project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNg.ProjectSpecificMethod;

public class TC06_CreateAccounts extends ProjectSpecificMethod {
	
	
	
@Test	

	public  void runCreateAccounts() throws InterruptedException {
	
	
	

//Step--1--Select down Arrow
		
	driver.findElement(By.xpath("(//a[@class='slds-button slds-button_reset'])[5]")).click();
				
//Step--2--	Click on New button
		
	Thread.sleep(2000);
	
	WebElement newbutton = driver.findElement(By.xpath("(//span[@class='slds-truncate'])[8]"));
	driver.executeScript("arguments[0].click();", newbutton);
	//setTimeout(function(){debugger;}, 5000)
	
	

	
//Step--3--	Enter 'your name' as account name
		
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@name='Name']")).click();
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("ponpandian");
	
//Step--4--Select Ownership as Public
	
	WebElement ownership = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]"));
	driver.executeScript("arguments[0].click();",ownership );
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class='slds-media__body'])[2]")).click();
	
//Step--5--Click Save
	
	driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	
//Step--6--verify Account name by get Title
	
	Thread.sleep(5000);
	
	String title = driver.findElement(By.xpath("//lightning-formatted-text[text()='ponpandian']")).getText();
	
	 System.out.println(title);
	 
	 if(title.contains("ponpandian"))
		 System.out.println("\n\nAccount Verified");
	 else
		 System.out.println("Account Not Verified");
	 
	 
	
		
		
		
		
		
	}

}
