package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC40_Verify_the_mandatory_field_alert_message_for_WorkType {

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
																
				
// Step --02-- Click on the App Launcher Icon left to Setup
				WebElement appLauncher = driver.findElement(By.className("slds-icon-waffle"));
			  appLauncher.click();
				        
// Step--03-- Click on View All
				WebElement viewAll = driver.findElement(By.xpath("//button[text()='View All']"));
			viewAll.click();

// Step--04--Click on Work Types
			 WebElement workTypes = driver.findElement(By.xpath("//p[text()='Work Types']"));
		        driver.executeScript("arguments[0].click();", workTypes);

// Step--05--Click on New
			 WebElement newButton = driver.findElement(By.xpath("//div[text()='New']"));
				newButton.click();

// Step--06-- Enter Work Type Name as 'Bootcamp'
			WebElement workTypeName = driver.findElement(By.xpath("//input[@class=' input']"));
			workTypeName.sendKeys("BootCamp");		
		
		
//Step--07--Click on Save		
		
			driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
				        
				        
		
//Step--08--Verify the Mandatory fields Need fill POPUP arrived
				        
	  WebElement mandatoryField = driver.findElement(By.xpath("//li[text()='These required fields must be completed: Estimated Duration']"));
		
		if(mandatoryField.isDisplayed())
			System.out.println("Mandatory Field POPUP is Showing");
		else
			System.out.println("Mandatory Field POPUP is Not Showing");
		
		
		
	}

}
