package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC13_Verify_Legal_Entities_sort_order_by_Last_Modified_Date {

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
				
				
//Step--02-- Click App Launcher
						
						driver.findElement(By.xpath("(//div[@class='tooltipTrigger tooltip-trigger uiTooltip'])[6]")).click();
						
//Step--03-- Click on View All
						driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();		
		
						
//Step--04--Search the Input Box
						driver.findElement(By.xpath("//input[@class='slds-input']")).click();
						driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Legal Entities" ,Keys.ENTER);
						
//Step--05--Click ON Legal ENtities
						driver.findElement(By.xpath("//mark[text()='Legal Entities']")).click();
								
		
//Step--06--Click the sort arrow in the Last Modified Date
						
						driver.findElement(By.xpath("(//div[@class='slds-cell-fixed'])[3]")).click();
		
//Step--07-- Verify the Legal Entities displayed in ascending order by Last Modified Date.		
		
		
		           String text1 = driver.findElement(By.xpath("(//span[@class='slds-truncate uiOutputDateTime'])[1]")).getText();
						
					System.out.println(text1);	
					
						
					 String text2 = driver.findElement(By.xpath("(//span[@class='slds-truncate uiOutputDateTime'])[3]")).getText();
						
						System.out.println(text2);	
						
						
								
					if(text1.equals(text2))
						System.out.println("Displayed in Not ascending order");
					else
						System.out.println("Displayed in ascending order");

	}

}
