package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC21_DELETE_Dashboard {

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
			        				+ "input uiInput uiInputText uiInput--default uiInput--input']")).sendKeys("PONPANDIAN BOSE" ,Keys.ENTER);
			        
			        
//Step--06--Click on the Drop down icon and Select Delete	
			    	Thread.sleep(3000);
			        
			        driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small']")).click();
			        
			        driver.findElement(By.xpath("//span[text()='Delete']")).click();
			        
			        
			        
 //Step--07--7.Click on the Delete option in the displayed pop up window.
			        
			        driver.findElement(By.xpath("(//span[@class=' label bBody'])[2]")).click();
			        
			        
//Step--08--Verify Whether Dash board is Deleted using Dashboard Name
			        
			        driver.findElement(By.
			        		xpath("//input[@class='search-text-field slds-input "
			        				+ "input uiInput uiInputText uiInput--default uiInput--input']")).clear();
			        
			        
			        
			        driver.findElement(By.
			        		xpath("//input[@class='search-text-field slds-input "
			        				+ "input uiInput uiInputText uiInput--default uiInput--input']")).click();
			        
			        driver.findElement(By.
			        		xpath("//input[@class='search-text-field slds-input "
			        				+ "input uiInput uiInputText uiInput--default uiInput--input']")).sendKeys("PONPANDIAN BOSE" ,Keys.ENTER);
			        
			         

			        String text = driver.findElement(By.xpath(" //span[text()='No results found']")).getText();
			        
			        System.out.println(text);
			        
			        if(text.contains("No results found"))
			        	System.out.println("Dashboard Name Verified is Deletd");
			        else
			        	System.out.println("Dash board Name Not Deleted");
			        
	
		
		
		}

}
