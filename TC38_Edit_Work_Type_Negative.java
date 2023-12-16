package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC38_Edit_Work_Type_Negative {

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
               
//Step--06--Click on Edit button
               driver.findElement(By.xpath("//a[@title='Edit']")).click();
               
//Step--07--Enter Time Frame Start as '9'
               
               driver.findElement(By.xpath("(//input[@type='text'])[6]")).click();
               driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("9");
               
		
//Step--08--Enter Time Frame End as '6'
               driver.findElement(By.xpath("(//input[@type='text'])[7]")).click();
               driver.findElement(By.xpath("(//input[@type='text'])[7]")).sendKeys("6");
               
               
 //Step--09--Click ON Save              
               
               driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		
//Step--10--Verify the Error Messege is Displayed or Not		
		WebElement TimeShouldGreater = driver.findElement(By.xpath("//li[text()='Enter a Timeframe End number that is greater "
				+ "than the Timeframe Start number.: Timeframe Start']"));
		
		System.out.println(TimeShouldGreater);
		
		if(TimeShouldGreater.isDisplayed())
			System.out.println("Error Messege is Displayed");
		
		else 
			System.out.println("Error Messege is Not Displayed");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
