package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC26_Delete_Work_Type_Group {

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
											//Thread.sleep(3000);	
				       driver.findElement(By.xpath("//button[text()='View All']")).click();
//Step--04--ENter Work Type Groups from App Launcher 
												
												
				      driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Work Type Groups" ,Keys.ENTER);
							     
//Step--05-- click Work Type Groups from App Launcher
							     
				      driver.findElement(By.xpath("//mark[text()='Work Type Groups']")).click();		
				
				
//Step--06--Search the Work Type Group 'Sales force Automation by *Your Name*'	
					Thread.sleep(3000);
							     
				      driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Bosepandian" ,Keys.ENTER);
				
				      Thread.sleep(3000);
//Step--07--Click on the Drop-down icon		
				      WebElement drop = driver.findElement(By.xpath("//span[@class='slds-icon_container slds-icon-utility-down']"));
				      driver.executeScript("arguments[0].click();", drop);
				             
				             		
//Step--08--Select Delete
				      //Thread.sleep(3000);
				       driver.findElement(By.xpath("(//a[@title='Delete'])[1]")).click();
				       driver.findElement(By.xpath("//span[text()='Delete']")).click();
				       
				       
		
	//Step--09-- Verify Whether Work Type group is Deleted using Work Type Group Name
				       Thread.sleep(3000);
				       driver.findElement(By.xpath("//input[@class='slds-input']")).clear();
					    driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Bosepandian12" ,Keys.ENTER);
					  
				       
		           String text = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
		              System.out.println(text);
		              if(text.contains("No items to display."))
		            	  System.out.println("Work Type group is Deleted");
		              else
		            	  System.out.println("Work Type group is Not Deleted");
		
		
		
		
		/*
		 *  \ 8.
		 * 
		 * 
		 */
		
		
		
		
		

	}

}
