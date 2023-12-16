package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC24_Create_Work_Type_Group {

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
			     
//Step--06--Click on New Work Type Group
			     
			     driver.findElement(By.xpath("//div[text()='New']")).click();
			     
//Step--07--Enter Work Type Group Name as 'Sales force Automation by *Your Name*'
			     Thread.sleep(2000);
			     
			     driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Ponpandian12" ,Keys.ENTER); 
		
		
//Step--08--.Click  Save 		
		
		         driver.findElement(By.xpath("//button[text()='Save']")).click();
		
//Step--09--verify Work Type Group Name		
		          String text = driver.findElement(By.xpath("(//lightning-formatted-text[text()='Ponpandian12'])[1]")).getText();
	            System.out.println(text);
	            if(text.contains("Ponpandian12"))
	            	System.out.println("Group Name is Created");
	            else 
	            	System.out.println("Group Name is Not Created");
		
		
		
	}

}
