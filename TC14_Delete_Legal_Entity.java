package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC14_Delete_Legal_Entity {

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
								
		
//Step-06--Search the created legal Entities By your Name
												
						 driver.findElement(By.xpath("//input[@class='slds-input']")).click();
						 driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("ponpandian" , Keys.ENTER);
								 
								
//Step--07--Click on the Delete option in the displayed popup window
								
					Thread.sleep(3000); 
						 driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid--align-spread'])[3]")).click();
						 WebElement delete = driver.findElement(By.xpath("//div[text()='Delete']"));
						 driver.executeScript("arguments[0].click();", delete);
													
//Step--08--CLick on delete button
						 driver.findElement(By.xpath("(//span[@class=' label bBody'])[5]")).click();
		
		
//Step--09-- Verify Whether Legal Entity is Deleted using Legal Entity Name		
		
		
		String text = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
		
		System.out.println(text);
		
		if(text.contains("No items to display."))
			System.out.println("Legal Entities is Deleted using Entity Name");
		else
			System.out.println("Legal Entity is Not Deleted");
		
		
		
		
		
		

	}

}
