package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC11_Edit_Legal_Enities {

	public static void main(String[] args) throws InterruptedException {
		
		
		
//Setup the Driver		
						ChromeOptions ch=new ChromeOptions();
						ch.addArguments("--disable-notifications");
						ChromeDriver driver=new ChromeDriver(ch);
						driver.get("https://login.salesforce.com");
						driver.manage().window().maximize();
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
						
							
						
//Step--1: Login driver
						
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
						
		
		
//Step-06--Search the created legal Entities By your Name
						
		 driver.findElement(By.xpath("//input[@class='slds-input']")).click();
		 driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Ponpandi" , Keys.ENTER);
		 
		
//Step--07--Click on the Dropdown icon and Select Edit
		
		Thread.sleep(3000); 
		 driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid--align-spread'])[3]")).click();
		 driver.findElement(By.xpath("//li[@class='uiMenuItem']")).click();
		
//Step--08-- Enter the Company name as 'Zoho pvt Ltd'	
		 
		 driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
		 driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).clear();
		 driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("Zoho pvt Ltd" );
		
//Step--09--	Enter Description as 'To be a Software Engineer'
		 
		 
		 driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).click();
		 driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).clear();
		 driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("To be a Software Engineer");
		 
		 
//Step--10-- Select Status as 'Active' 	
		
		 
		 WebElement status = driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']"));
		  driver.executeScript("arguments[0].click();", status);
		  driver.findElement(By.xpath("(//span[@class='slds-media__body'])[2]")).click();
		  
		 
		  
		  
//Step--11--Verify Status as Active			  

			String active = driver.findElement(By.xpath("//span[text()='Active']")).getText();
			
			System.out.println(active);
			
			if (active.contains("Active"))
				  System.out.println("Status is Active Verified Succesfully");
			else 
				  System.out.println("Status is not Active ");
			
			
		  
		  
		 
//Step--12-- Click on Save
		 
		 driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();	
		 
		 
	 
		
 
		
		
		
		
		
		
		
		
		
		
		

	}

}
