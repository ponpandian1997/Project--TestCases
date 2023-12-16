package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC29_Create_New_Case {

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
		
//Step--07--Click on New Button
		 driver.findElement(By.xpath("//div[text()='New']")).click();
		
//Step--08--Click on Input Box
		 
		 driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[1]")).click();
		 
//Step--09--Click on New Contact button
		 WebElement New = driver.findElement(By.xpath("//span[text()='New Contact']"));
		 driver.executeScript("arguments[0].click();", New);
//step--10--Enter Last & First Name
		 driver.findElement(By.xpath("//input[@class='firstName compoundBorderBottom "
		 		+ "form-element__row input']")).click();
		 driver.findElement(By.xpath("//input[@class='firstName "
		 		+ "compoundBorderBottom form-element__row input']")).sendKeys("Bose");
		 
		 //Last NAme
		 driver.findElement(By.xpath("//input[@class='lastName compoundBLRadius "
		 		+ "compoundBRRadius form-element__row input']")).click();
		 driver.findElement(By.xpath("//input[@class='lastName compoundBLRadius "
			 		+ "compoundBRRadius form-element__row input']")).sendKeys("Pandian");
		 
//Step--11--Click Save Button
		 driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		 
		 
//Step--11--Click on Status and Choose Escaleted
		 
		 driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]")).click();
		 WebElement escalate = driver.findElement(By.xpath("//span[text()='Escalated']"));
		 driver.executeScript("arguments[0].click();", escalate);
		 
//Step--12--Click on Case Origin and Choose Email		 
		 
		 driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]")).click();
		 WebElement Email = driver.findElement(By.xpath("//span[text()='Email']"));
		 driver.executeScript("arguments[0].click();", Email);
		 
//Step--13--Enter Subject as 'Testing' 
		 
		 WebElement testing = driver.findElement(By.xpath("(//input[@class='slds-input'])[7]"));
		 driver.executeScript("arguments[0].click();", testing);
		 driver.findElement(By.xpath("(//input[@class='slds-input'])[7]")).sendKeys("Testing");
		 
//Step--14--Enter description as 'Dummy'
		 WebElement dummy = driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[1]"));
		 driver.executeScript("arguments[0].click();", dummy);
		 driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[1]")).sendKeys("Dummy");
		 
//Step--15--Click on Save Button		 
		 
		 driver.findElement(By.xpath("//button[text()='Save']")).click();
		 
		 
//Step--16--Verify the Case IS Created Or Not
		 
		 String text = driver.findElement(By.xpath("(//span[text()='Case created'])[1]")).getText();
		
		   System.out.println(text);
		
		    if(text.contains("Case created"))
		    	System.out.println("The Case is Created ");
		    else System.out.println("The case Is Not Created");
		
		

	}

}
