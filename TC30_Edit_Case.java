package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC30_Edit_Case {

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
				 
//Step--08-- select Edit 
				 
				 //Thread.sleep(1500);
				 WebElement edit = driver.findElement(By.xpath("(//div[text()='Edit'])[1]"));
				 driver.executeScript("arguments[0].click();", edit);
				 
//Step--09--Update Status as Working
				 
				 driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds"
				 		+ "-combobox__input-value'])[1]")).click();
				 
				 WebElement status = driver.findElement(By.xpath("//span[text()='Working']"));
				 driver.executeScript("arguments[0].click();", status);
				 
				 
				 
//Step--10--Update Priority to "Low"
				 driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux "
				 		+ "slds-combobox__input-value'])[2]")).click();
				 
				 
				WebElement low = driver.findElement(By.xpath("//span[text()='Low']"));	
				driver.executeScript("arguments[0].click();", low);
				
				 
//Step--11--Update Case Origin as Phone
				
				
				driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux "
						+ "slds-combobox__input-value'])[4]")).click();
				
				
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				
				
//Step--12--Update SLA violation to No 	
				
				
				
				WebElement sla = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[8]"));
				driver.executeScript("arguments[0].click();", sla);
				
				WebElement no = driver.findElement(By.xpath("//span[text()='No']"));
				driver.executeScript("arguments[0].click();", no);
				
//Step--13--Click on Save	
				
				driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
				
				
//Step--14-- Verify Status as Working
				
				String text = driver.findElement(By.xpath("//span[text()='Working']")).getText();
				 
				System.out.println(text);
		
		if(text.contains("Working"))
			System.out.println("Status Verified as Working");
		else
			System.out.println("Status is Not as Working");
		
		
		
		
		
			
		

	}

}
