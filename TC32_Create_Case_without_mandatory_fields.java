package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC32_Create_Case_without_mandatory_fields {

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
		
//Step--07--Click on New Button
		 driver.findElement(By.xpath("//div[text()='New']")).click();
				
		
//Step--08--Choose Contact Name from DropDown
		 
		 driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[1]")).click();
		
		driver.findElement(By.xpath("(//span[text()='Bose Pandian'])[1]")).click();
		
		
//Step--09--Select status as None		
		
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]")).click();
		
		WebElement none = driver.findElement(By.xpath("(//span[@class='slds-truncate'])[39]"));
		driver.executeScript("arguments[0].click();", none);
		
//Step--10--Enter Subject as 'Testing'
		 
		WebElement subject = driver.findElement(By.xpath("(//input[@class='slds-input'])[7]"));
		driver.executeScript("arguments[0].click();", subject);
		driver.findElement(By.xpath("(//input[@class='slds-input'])[7]")).sendKeys("Testing" ,Keys.ENTER);
		
//Step--11-- description as 'Automation testing'
		 
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[1]")).click();
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[1]")).sendKeys("Automation Testing" ,Keys.ENTER);
		
//Step--12--Click 'Save' 
		
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
//Step--13-- Get the text of Error message Displayed and Verify the message		
		
		String text = driver.findElement(By.xpath("(//div[text()='Complete this field.'])[1]")).getText();
		
		    System.out.println(text);
		if(text.contains("Complete this field."))
			System.out.println("Error Messege is displayed");
		else 
			System.out.println("error messege is Not Displayed");
		
		
		
		

	}

}
