package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TC01_CreateNewOpportunity {

	
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
		
//Step--6--Click on down arrow
		
		driver.findElement(By.xpath("(//div[@class='slds-context-bar__label-action slds-p-left--none'])[1]")).click();
		
//Step--7--Click on New button
		
	
		WebElement New = driver.findElement(By.xpath("//span[text()='New Opportunity']"));
		driver.executeScript("arguments[0].click();", New);
		
// Step--8--Enter Opportunity name as 'Sales force Automation by *Your Name*,Get the text and Store it 
		//Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow'])[3]")).click();
		driver.findElement(By.xpath("(//div[@class='slds-form-element__control slds-grow'])[3]")).sendKeys("Salesforce Automation by Ponpandi", Keys.ENTER);
		
//Step--9--CHosee date
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='27']")).click();
		
//Step--10--Choose as ANalysis
		
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[1]")).click();
		WebElement Analysis = driver.findElement(By.xpath("(//span[@class='slds-media__body'])[4]"));
		driver.executeScript("arguments[0].click();", Analysis);
		
//Step--11--Save the inputs
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
//Step--12--get title
		
		Thread.sleep(5000);
		String title = driver.findElement(By.xpath("//lightning-formatted-text[text()='Salesforce Automation by Ponpandi']")).getText();
		   System.out.println(title);
		
		if(title.contains("Ponpandi"))
			System.out.println("\n\nOpportunity is converted successfully");
		else
			System.out.println("Opportunity is not created");
		
		
	}

}
