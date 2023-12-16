package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC27_Create_Work_Type_Group_without_mandatory_fields {

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
//Step--04--ENter Work Type Groups from App Launcher 
												
												
							 driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Work Type Groups" ,Keys.ENTER);
							     
//Step--05-- click Work Type Groups from App Launcher
							     
							 driver.findElement(By.xpath("//mark[text()='Work Type Groups']")).click();		
				
				
//Step--06--Click on New 				
                       driver.findElement(By.xpath("//div[text()='New']")).click();
				              
//Step--09--.Enter Description as 'Automation'	
				              //.driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).clear();
				              driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys("Automation " );
				              
				              
//Step--10-- Select Group Type as 'Capacity'
				              driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
				              
				              driver.findElement(By.xpath("//span[text()='Capacity']")).click();
				              
//Step--11--Click on Save
				              driver.findElement(By.xpath("//button[text()='Save']")).click();		
		
//Step--12--Verify the Alert message (Complete this field) displayed for Work Type Group Name
				              
		   String text = driver.findElement(By.xpath("//div[text()='Complete this field.']")).getText();
		
		              System.out.println(text);
		              if(text.contains("Complete this field."))
		            	  System.out.println("Alert Messege is Arrived");
		              else 
		            	  System.out.println("Alert Messege is Not Arrived");
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
