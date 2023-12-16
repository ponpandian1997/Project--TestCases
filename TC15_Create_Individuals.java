package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class TC15_Create_Individuals {
	
	
	
	

public  static void main(String[] args) {
		
		

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
				
		
//Step-05-- Click on New Individual		
			        driver.findElement(By.xpath("//div[text()='New']")).click();
		
		
//Step--06-- Enter the Last Name as 'Pandi'
			       
			        driver.findElement(By.xpath("//input[@class='lastName compoundBLRadius compoundBRRadius form-element__row input']")).click();
			        driver.findElement(By.xpath("//input[@class='lastName compoundBLRadius compoundBRRadius form-element__row input']")).sendKeys("BosePandi" ,Keys.ENTER);
			       
		
//Step--07--Click save 	
			        driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
			       
//Step--08--verify Individuals Name	
			       
			  String text = driver.findElement(By.xpath("(//span[@class='uiOutputText'])[1]")).getText();
			        System.out.println(text);
		
		if (text.equalsIgnoreCase("BosePAndI"))
			            System.out.println("Name Verified");
		else
			                   System.out.println("Name Does Not Verified");
		
		
		

	}

}
