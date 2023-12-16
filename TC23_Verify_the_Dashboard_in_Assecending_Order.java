package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC23_Verify_the_Dashboard_in_Assecending_Order {

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
						//Thread.sleep(3000);
					    driver.findElement(By.xpath("//button[text()='View All']")).click();

								
				
//Step--04--click Dash-boards from App Launcher 
			
			
			            WebElement dashboard = driver.findElement(By.xpath("//p[text()='Dashboards']"));
			            driver.executeScript("arguments[0].click();", dashboard );
			        		
		
//Step--05 -- Click on the Dashboard icon
			        
			        
			            WebElement click = driver.findElement(By.xpath("(//span[text()='Dashboards'])[1]"));
			            driver.executeScript("arguments[0].click();", click);
			        
			        
			        
//Step--06--Click the sort arrow in the Dashboard Name.			        
		               driver.findElement(By.xpath("//span[text()='Created On']")).click();
			        

//Step--07--Verify the Dash board displayed in ascending order by Dashboard name.		
		
		

			           String text1 = driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid_align-spread'])[5]")).getText();
							
						System.out.println(text1);	
						
							
						 String text2 = driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid_align-spread'])[41]")).getText();
						
							System.out.println(text2);	
							
							
									
						if(text1.equals(text2))
							System.out.println("Displayed in Not ascending order");
						else
							System.out.println("Displayed in ascending order");
		          
		          
		          
		          

	}

}
