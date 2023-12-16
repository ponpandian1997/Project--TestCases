package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC36_Create_task_without_mandatory_fields {

	public static void main(String[] args) throws InterruptedException {
		
		
		

//Setup the Driver		
				ChromeOptions ch=new ChromeOptions();
				ch.addArguments("--disable-notifications");
				ChromeDriver driver=new ChromeDriver(ch);
				driver.get("https://login.salesforce.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
																
																	
//Step--1: Login
																
				driver.findElement(By.xpath("//input[@id=\"username\"]")).click();
				driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("ponpandi97@zoho.com");
				driver.findElement(By.xpath("//input[@id=\"password\"]")).click();
				driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Password@1997");
				driver.findElement(By.xpath("//input[@id='Login']")).click();
														
														
//Step--02-- Click App Launcher
																
				driver.findElement(By.xpath("(//div[@class='tooltipTrigger tooltip-trigger uiTooltip'])[6]")).click();
																
//Step--03-- Click on View All
				Thread.sleep(3000);	
				driver.findElement(By.xpath("//button[text()='View All']")).click();		
				
//Step--04--Type task and select task 	
				driver.findElement(By.xpath("//input[@class='slds-input']")).click();
				driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Task");
							
				driver.findElement(By.xpath("//mark[text()='Task']")).click();
							
//Step--05-- Click New Task under drop-down icon					
				driver.findElement(By.xpath("(//div[@class='slds-context-bar__label-action slds-p-left--none'])[3]")).click();
				Thread.sleep(1500);
				WebElement newtask = driver.findElement(By.xpath("//span[text()='New Task']"));
				driver.executeScript("arguments[0].click();", newtask);		
		
		
		
//Step--06--Select Name from Drop-down 
							
				driver.findElement(By.xpath("//input[@title='Search Contacts']")).click();
				driver.findElement(By.xpath("(//div[@title='Bose Pandian'])[1]")).click();
		
		
//Step--07-- Enter Comments as SALES  Automation Using Selenium		
		
				 driver.findElement(By.xpath("//textarea[@role='textbox']")).click();
				 driver.findElement(By.xpath("//textarea[@role='textbox']")).sendKeys("SALES  Automation Using Selenium	" ,Keys.ENTER);
				 
//Step--08--Click on Save				 
		      
				 driver.findElement(By.xpath("//span[text()='Save']")).click();
		
//Step--09--Get the text of Error message Displayed and Verify the message		
		       
				 
				  WebElement errormessege = driver.findElement(By.xpath("//span[text()='Review the errors on this page.']"));
			    	
	              System.out.println(errormessege);

	              if(errormessege.isDisplayed())
	            	  
	            	  System.out.println("The error Messege is Displayed");
	              else 
	            	  System.out.println("The Error Messege is Not Displayed");
		
		
		
		
		
		
		
		
		
	}

}
