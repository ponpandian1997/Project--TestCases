package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC10_Create_LeagalEntities {

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
				
//Step--04--Search the Input Box
				driver.findElement(By.xpath("//input[@class='slds-input']")).click();
				driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities" ,Keys.ENTER);
				
//Step--05--Click ON Legal ENtities
				driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
				
//Step--06--Click on New Legal Entity
				driver.findElement(By.xpath("//div[text()='New']")).click();
				
//Step--07-- Enter Your Name
				Thread.sleep(3000);
				driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).click();
				driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Salesforce Automation by Ponpandi");


//Step--08--Click save 
				
			driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();	
				
				
//Step--09--verify Legal Entity Name					
				
			String text = driver.findElement(By.xpath("(//lightning-formatted-text[text()='Salesforce Automation by Ponpandi'])[1]")).getText();
				
			System.out.println(text);	
				
			if(text.contains("Salesforce Automation by Ponpandi"))
				System.out.println("Legal ENtities is Created Succesfully");
			else 
				System.out.println("Legal ENtities is Not Created");
				
				
				
				
		
		

	}

}
