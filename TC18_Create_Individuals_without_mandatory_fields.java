package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC18_Create_Individuals_without_mandatory_fields {

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



//Step--04-- click Individuals from App Launcher



		      driver.findElement(By.xpath("//input[@class='slds-input']")).click();
		      driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Individuals" ,Keys.ENTER);
		      driver.findElement(By.xpath("//mark[text()='Individuals']")).click();		
				
		
		
//Step--05-- Click on New Individual		
		       driver.findElement(By.xpath("//div[text()='New']")).click();
		
		

 //Step--06--Select Salutation as 'Mr'
		   		
		   		
		   		driver.findElement(By.xpath("//div[@class='salutation compoundTLRadius compoundTRRadius compoundBorderBottom form-element__row uiMenu']")).click();
		   		driver.findElement(By.xpath("(//li[@class='uiMenuItem uiRadioMenuItem'])[2]")).click();		

		   		
//Step--07--Enter the first name as 'pon pandi'
		   		
		   		
		   		driver.findElement(By.xpath("//input[@class='firstName compoundBorderBottom form-element__row input']")).sendKeys("ponpandi");
	
//Step--08--Click On Save
		   		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		   		
		   		
		   		
//Step--09-- Verify the Alert message (Complete this field) displayed for the Last Name	
		   		
		   		String text = driver.findElement(By.xpath("//li[text()='Complete this field.']")).getText();
		   		System.out.println(text);
		   		
		   		if(text.contains("Complete this field."))
		   			System.out.println("ALert Messege is Displayed");
		   		else 
		   			System.out.println("Alert Messege is Not Displayed");
		
			
		

	}

}
