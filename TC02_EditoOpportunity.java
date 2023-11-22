package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC02_EditoOpportunity {

	public static void main(String[] args) throws InterruptedException {
		
//Setup the Driver
		
		ChromeOptions ch=new ChromeOptions();
		ch.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(ch);
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
//Step--1Login Credentials
		driver.findElement(By.xpath("//input[@id='username']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ponpandi97@zoho.com");
		driver.findElement(By.xpath("//input[@id='password']")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@1997");
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
		
//Step--5--Click on Opportunities
		
		WebElement Oppo = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", Oppo);
		
//setTimeout(function(){debugger;}, 5000)		
		
//Step--6--Select down Arrow
		
		driver.findElement(By.xpath("(//span[@class='slds-icon_container slds-icon-utility-down'])[1]")).click();
		
//Step--7-- Click on Edit
		
		Thread.sleep(3000);
	    WebElement edit = driver.findElement(By.xpath("(//div[@class='forceActionLink'])[1]"));
	    driver.executeScript("arguments[0].click();", edit);
	
//Step--8--Choose close date as Tomorrow date
	
	   driver.findElement(By.xpath("(//input[@class='slds-input'])[4]")).click();
		 Thread.sleep(3000);
	   driver.findElement(By.xpath("//span[text()='28']")).click();
	   
//Step--9--	 Select 'Stage' as Perception Analysis
	   driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]")).click();
	   WebElement perception = driver.findElement(By.xpath("//span[text()='Perception Analysis']"));
	   driver.executeScript("arguments[0].click();", perception);
	   
//Step--10--Select Deliver Status as In Progress
	 Thread.sleep(3000);
	   WebElement progress = driver.findElement(By.xpath("(//div[@class='slds-input__icon-group slds-input__icon-group_right'])[7]"));
	   driver.executeScript("arguments[0].click();", progress);
	   
	 Thread.sleep(3000);
	   WebElement in = driver.findElement(By.xpath("(//span[@class='slds-truncate'])[46]"));
	   driver.executeScript("arguments[0].click();", in);
	   
//Step--10--Enter Description as Sales Force
	   
	 WebElement description = driver.findElement(By.xpath("//textarea[@class='slds-textarea']"));
	 driver.executeScript("arguments[0].click();",  description);
		
		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys(" SalesForce", Keys.ENTER);
		
		
//Step--11--Click on Save 
		 
		 driver.findElement(By.xpath("//button[text()='Save']")).click();
	Thread.sleep(3000);  
		  driver.findElement(By.xpath("(//span[@class='slds-grid slds-grid--align-spread forceInlineEditCell'])[1]")).click();
		  
//Step--12--Verify Stage as Perception Analysis		  
		 String title = driver.findElement(By.xpath("//lightning-formatted-text[text()='Salesforce Automation by Ponpandi']")).getText(); 
			  
			  System.out.println(title);
			  
			  if(title.contains("Ponpandi"))
			  System.out.println("\n\nThe Oppurtunity is Edited Successfully"); else
			  System.out.println("This Opportunity is not Edited");
			  
			  
			//setTimeout(function(){debugger;}, 5000)			 
		

	}

}
