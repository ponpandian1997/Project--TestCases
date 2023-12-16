package project;

import java.time.Duration;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class TC20_Create_New_Dashboard   {
	
	
	


	public  static void main(String[] args) throws InterruptedException {
		
		
		
		
		
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

						
		
//Step--04--click Dash-boards from App Launcher 
	
	
	        WebElement dashboard = driver.findElement(By.xpath("//p[text()='Dashboards']"));
	        driver.executeScript("arguments[0].click();", dashboard );
	        
	        
//Step--05--Click on the New Dash-board option
	        
	        
	        driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
	
		
//Step--06--Create New Enter Name as 'Sales-force Automation by *Your Name* 
	        
	        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='dashboard']")));
	        driver.findElement(By.id("dashboardNameInput")).sendKeys("ponpandian");
	        
//Step--07--Click on Create.
	       
	        driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand submitBtn']")).click();
		
	        
//Step--08--Click on Save	        
	        
	        driver.findElement(By.xpath("//button[@class='slds-button slds-button_neutral save']")).click();
	        
//Step--09--Verify Dash-board name.
	        driver.switchTo().defaultContent();
	        
	        WebElement dashboard1 = driver.findElement(By.xpath("//a[@title='Dashboards']"));
	        driver.executeScript("arguments[0].click();", dashboard1);
	        
	        
	        String text = driver.findElement(By.xpath("(//div[@class='slds-hyphenate'])[1]")).getText();
	        
	        System.out.println(text);
	        
	        if(text.equalsIgnoreCase("pOnPanDian "))
	        	System.out.println("Dashboard Name Verified");
	        else
	        	System.out.println("Dash board Name Not Present");
	        
	        
	       
	   }

}
