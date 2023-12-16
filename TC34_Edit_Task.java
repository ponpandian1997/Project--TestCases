package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC34_Edit_Task {

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
						
		
//Step--04--click Sales from App Launcher
							
			driver.findElement(By.xpath("//p[text()='Sales']")).click();
		
//Step--05--Click on Tasks tab
			Thread.sleep(1500);
			WebElement tasks = driver.findElement(By.xpath("//span[text()='Tasks']"));
			driver.executeScript("arguments[0].click();", tasks);
			
			WebElement task2 = driver.findElement(By.xpath("(//span[text()='BootCamp1'])[1]"));
			driver.executeScript("arguments[0].click();", task2);
		
//Step--06--select Edit
			//Thread.sleep(1500);
			
		  WebElement drop = driver.findElement(By.xpath("//a[@class='slds-grid slds-grid--vertical-align-center slds-grid--align-center sldsButtonHeightFix']"));
		  driver.executeScript("arguments[0].click();", drop);
		  
		  driver.findElement(By.xpath("//a[@title='Edit']")).click();
		  System.out.println("done");
		  
//Step--07--Select todays date as Due date
		  
		  driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).click();
		  driver.findElement(By.xpath("(//span[@class='slds-day'])[20]")).click();
		  
//Step--08--Select Priority as low 	  
		  //Thread.sleep(1500);
           driver.findElement(By.xpath("(//a[text()='Normal'])[1]")).click();
           driver.findElement(By.xpath("//a[@title='Low']")).click();
		  
		
//Step--09--Click save and verify Subject			
		  driver.findElement(By.xpath("//span[text()='Save']")).click();
		  
		  String text = driver.findElement(By.xpath("(//span[text()='BootCamp1'])[7]")).getText();
		  System.out.println(text);
		  
		  if (text.contains("BootCamp1"))
			  System.out.println("Subject is Verified");
		  else
			  System.out.println("Subject is not Verified");
		
		
		
		
	}

}
