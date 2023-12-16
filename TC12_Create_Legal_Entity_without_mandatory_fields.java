package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC12_Create_Legal_Entity_without_mandatory_fields {

	public static void main(String[] args) {
		
		
		
		
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
						driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
						
//Step--04--Search the Input Box
						driver.findElement(By.xpath("//input[@class='slds-input']")).click();
						driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities" ,Keys.ENTER);
						
//Step--05--Click ON Legal ENtities
						driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
						
//Step--06--Click on New Legal Entity
						driver.findElement(By.xpath("//div[text()='New']")).click();
							
		

//Step--07-- Enter the Company name as 'Zoho pvt Ltd'	
								 
						 driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
						 driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).clear();
						 driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("Zoho pvt Ltd" );
								
//Step--10--	Enter Description as 'To be a Software Engineer'
								 
								 
					   driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).click();
					   driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).clear();
				       driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("To be a Software Engineer");
						    
							 
//Step--11-- Click on Save
						  		 
					driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();							    
						    
						    
						
//Step--12--Verify the Alert message -(Complete this field) displayed for Name
							 				
		
		
		          String text = driver.findElement(By.xpath("//div[text()='Complete this field.']")).getText();
		           System.out.println(text);
		
		
		if(text.contains("Complete this field."))
			System.out.println("Verified Succesfully");
		else
			System.out.println("Not Verified");
		
		
		
		
		
		
		
		
		

	}

}
