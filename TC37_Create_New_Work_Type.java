package project;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC37_Create_New_Work_Type {

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

// Step--06-- Enter Work Type details
		        WebElement workTypeName = driver.findElement(By.xpath("//input[@class=' input']"));
		        workTypeName.sendKeys("Salesforce Project");
		        
//Step--07--Enter Description as Specimen
		        WebElement description = driver.findElement(By.xpath("//textarea[@class=' textarea']"));
		        description.sendKeys("Specimen");
		        
//Step--08--Click ON Uk Shift
		        
		        driver.findElement(By.xpath("//input[@class=' default input uiInput"
		        		+ " uiInputTextForAutocomplete uiInput--default "
		        		+ "uiInput--input uiInput uiAutocomplete uiInput--default uiInput--lookup']")).click();
		        
		        WebElement operatingHoursName = driver.findElement(By.xpath("//div[@class='primaryLabel slds-truncate slds-lookup__result-text']"));
		        operatingHoursName.click();
//Step--09--Enter estimatedDuration as "7"
		        WebElement estimatedDuration = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		        estimatedDuration.sendKeys("7");

// Step--10-- Click on Save
		        WebElement saveButton = driver.findElement(By.xpath("//button[@title='Save']"));
		        saveButton.click();

// Step--11-- Verify the Created message (you can implement your verification logic here)

		        WebElement CreateMessege = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']"));
		        
		        if(CreateMessege.isDisplayed())
		        	System.out.println("Created Messege Is displayed");
		        else 
		        	System.out.println("Created Messege is Not Displayed");
		        
		        
		        
		        
		        
		        
		        
		        
		        
		    }
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
