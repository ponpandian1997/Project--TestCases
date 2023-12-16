package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC33_Craete_Task {

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
		
//Step--04--Type task and select task 	
					driver.findElement(By.xpath("//input[@class='slds-input']")).click();
					driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Task");
					
					driver.findElement(By.xpath("//mark[text()='Task']")).click();
					
//Step--05-- Click New Task under drop-down icon					
					driver.findElement(By.xpath("(//div[@class='slds-context-bar__label-action slds-p-left--none'])[3]")).click();
					Thread.sleep(1500);
					WebElement newtask = driver.findElement(By.xpath("//span[text()='New Task']"));
					driver.executeScript("arguments[0].click();", newtask);
					
//Step--06--Enter subject as "Boot-camp " 					
					 driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).click();
					 driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("BootCamp12");
					 
//Step--07--Select status as 'Waiting on someone else'					 
					driver.findElement(By.xpath("(//a[text()='Not Started'])[1]")).click();
					driver.findElement(By.xpath("//a[text()='Waiting on someone else']")).click();

//Step--08--Save and verify the 'Task created'message
					driver.findElement(By.xpath("//span[text()='Save']")).click();
					String text = driver.findElement(By.xpath("//div[@class='toastContent slds-notify__content']")).getText();
					System.out.println(text);
		
		if(text.contains("Task \"BootCamp1\" was created."))
			System.out.println("task Is Verified");
		else
			System.out.println("Task is Not Verified");
		
		}

}
