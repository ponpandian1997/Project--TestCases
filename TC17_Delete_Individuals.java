package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC17_Delete_Individuals {

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
		        driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();		



//Step--04-- click Individuals from App Launcher



		      driver.findElement(By.xpath("//input[@class='slds-input']")).click();
		      driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Individuals" ,Keys.ENTER);
		      driver.findElement(By.xpath("//mark[text()='Individuals']")).click();		
		
		
//Step--05--Search the Individuals ' BosePandi'	
		      
		      
				driver.findElement(By.xpath("//input[@class='slds-input']")).click();
				driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("LEO DOSS BOSEPANDI" ,Keys.ENTER);
				
				
//Step--06-- Click on the Drop-down icon and  Select Delete		
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//span[@class='slds-icon_container slds-icon-utility-down'])[1]")).click();  
		      
			    WebElement delete = driver.findElement(By.xpath("//div[text()='Delete']"));
			           driver.executeScript("arguments[0].click();", delete);
			
			
//Step--07--Click on the Delete option in the displayed pop up window.		      
		      
		         driver.findElement(By.xpath("//span[text()='Delete']")).click();   
		      
		      
//Step--08--Verify Whether Individual is Deleted using Individual last name		
			      
					driver.findElement(By.xpath("//input[@class='slds-input']")).click();
					driver.findElement(By.xpath("//input[@class='slds-input']")).clear();
					driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("LEO DOSS BOSEPANDI" ,Keys.ENTER);
		
		         
		         String text = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
		     	
		 		System.out.println(text);
		 		
		 		if(text.contains("No items to display"))
		 			System.out.println("Individual is Deleted");
		 		else
		 			System.out.println("Individual is Not Deleted");
		 		  
		         
		
		
		
		
		
		
		

	}

}
