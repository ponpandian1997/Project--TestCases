package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC22_View_dashboard_Subscribe {

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

								
				
//Step--04--click Dash-boards from App Launcher 
			
			
			        WebElement dashboard = driver.findElement(By.xpath("//p[text()='Dashboards']"));
			        driver.executeScript("arguments[0].click();", dashboard );
			        
			        
//Step--05-- Search the Dash board 'Sales force Automation by *PONPANDIAN*'
			        
			        
			        driver.findElement(By.
			        		xpath("//input[@class='search-text-field slds-input "
			        				+ "input uiInput uiInputText uiInput--default uiInput--input']")).click();
			        
			        driver.findElement(By.
			        		xpath("//input[@class='search-text-field slds-input "
			        				+ "input uiInput uiInputText uiInput--default uiInput--input']")).sendKeys("ponpandian" ,Keys.ENTER);
			        
			        
//Step--06--Click on the Drop down icon and Select Delete	
			    	Thread.sleep(3000);
			        
			        driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small']")).click();
			        		
		            driver.findElement(By.xpath("//span[text()='Subscribe']")).click();
		          
//Step--07-- Select frequency as 'Daily' 		
		
		            driver.findElement(By.xpath("//span[text()='Daily']")).click();
		            
		            
		
		
//Step--08--Click on Save in the Edit Subscription pop up window.
		            
		            
		            driver.findElement(By.xpath("//span[text()='Save']")).click();
		            
		            
		            
		
//Step--09--Verify Whether the dash board is subscribed.		
		
		        
		            String text = driver.findElement(By.xpath("(//div[@class='slds-truncate'])[1]")).getText();
		            
		            System.out.println(text);
		            
		      if(text.equalsIgnoreCase("true"))
		    	  System.out.println("dash board is subscribed");
		      else
		    	  System.out.println("Dash board is Not Subscribed");
		            
		            
		            
		            
		            
		            
		            
		            
		            
		
		
		

	}

}
