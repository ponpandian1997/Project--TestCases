package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificMethod {
	
	
public ChromeDriver driver;	
	
	
	
@BeforeMethod	

	public  void preCondition() throws InterruptedException {
		
		
		
		
		
		
//Setup the Driver		
				ChromeOptions ch=new ChromeOptions();
				ch.addArguments("--disable-notifications");
				 driver=new ChromeDriver(ch);
				driver.get("https://login.salesforce.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
					
				
//Step--1: Login
				
				driver.findElement(By.xpath("//input[@id=\"username\"]")).click();
				driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("ponpandi97@zoho.com");
				driver.findElement(By.xpath("//input[@id=\"password\"]")).click();
				driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Password@1997");
				driver.findElement(By.xpath("//input[@id='Login']")).click();

//Step--2--Click on the App Launcher toggle button.
								
		Thread.sleep(3000);
				WebElement app = driver.findElement(By.xpath("//span[text()='App Launcher']"));
				driver.executeScript("arguments[0].click();", app);
								
//Step--3--Click on the View All link.
							
				WebElement ViewAll = driver.findElement(By.xpath("//button[text()='View All']"));
				driver.executeScript("arguments[0].click();", ViewAll);
								
								
//Step--4--Click on Sales
								
				driver.findElement(By.xpath("//p[text()='Sales']")).click();
								
				 System.out.println("done");
		
	}

@AfterMethod

              public void postCondition() { 
	          driver.close(); 
	}
 		



}
