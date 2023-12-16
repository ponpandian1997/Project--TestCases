package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC39_Delete_Work_Type {

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
																
				
//Step --02-- Click on the App Launcher Icon left to Setup
		   WebElement appLauncher = driver.findElement(By.className("slds-icon-waffle"));
		    appLauncher.click();
				        
//Step--03-- Click on View All
		     WebElement viewAll = driver.findElement(By.xpath("//button[text()='View All']"));
			 viewAll.click();

//Step--04--Click on Work Types
			WebElement workTypes = driver.findElement(By.xpath("//p[text()='Work Types']"));
		     driver.executeScript("arguments[0].click();", workTypes);
		               
		               
//Step--05--Click On Down Arrow
		               
		    driver.findElement(By.xpath("(//span[@class='slds-icon_container slds-icon-utility-down'])[1]")).click();	
		
		
		
//Step--06--Click on Delete 
		    
		   driver.findElement(By.xpath("//a[@title='Delete']")).click();
		   driver.findElement(By.xpath("//span[text()='Delete']")).click();
		
//Step--07--Verify the message		
		
	
		   WebElement SuccesfullyDeleted = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		
		if(SuccesfullyDeleted.isDisplayed())
    System.out.println("Deleted Messege IS Displayed");	
		
		else 
			System.out.println("Deleted Messege is Not Displayed");
		
		

	}

}
