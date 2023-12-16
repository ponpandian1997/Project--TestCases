package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC31_Delete_Cases {

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
						//Thread.sleep(3000);
		            driver.findElement(By.xpath("//button[text()='View All']")).click();	
				
//Step--04--Click on Sales
			
			      driver.findElement(By.xpath("//p[text()='Sales']")).click();
							
			      System.out.println("done");
//Step--05--Click on More
			      
			      Thread.sleep(1500);
			       driver.findElement(By.xpath("//span[text()='More']")).click();
			       
//Step--06--Click on Cases
			       Thread.sleep(1500);
				 WebElement cases = driver.findElement(By.xpath("(//span[text()='Cases'])[2]"));
				 driver.executeScript("arguments[0].click();", cases);		
		
//Step--07--Click on the Drop-down icon
				 
				 
				 driver.findElement(By.xpath("(//span[@class='slds-icon_container slds-icon-utility-down'])[1]")).click();
				 		
		
//Step--08--select Delete		
		
		         WebElement delete = driver.findElement(By.xpath("//div[text()='Delete']"));
		         driver.executeScript("arguments[0].click();", delete);
		  
		         WebElement dele = driver.findElement(By.xpath("//span[text()='Delete']"));
		         driver.executeScript("arguments[0].click();", dele);
		
//Step--09--Verify the case is deleted or Not by Using Case Number
		         
		         
		         driver.findElement(By.xpath("//input[@class='slds-input']")).click();
		         driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("00001031" , Keys.ENTER);
		         
		         
		         String text = driver.findElement(By.xpath("//span[text()='No items to display.']")).getText();
					System.out.println(text);
					
					
					if(text.contains("No items to display."))
						System.out.println("The Case Is Deleted");
					else
						System.out.println("The Case is not Deleted");
		

	}

}
