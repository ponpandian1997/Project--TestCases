package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TC16_Edit_Individuals {

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



//Step--04-- click Individuals from App Launcher



      driver.findElement(By.xpath("//input[@class='slds-input']")).click();
      driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Individuals" ,Keys.ENTER);
      driver.findElement(By.xpath("//mark[text()='Individuals']")).click();
		
		
//Step--05--Search the Individuals ' BosePandi'	
     
      
		driver.findElement(By.xpath("//input[@class='slds-input']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("BosePandi" ,Keys.ENTER);
		
		
//Step--06-- Click on the Drop-down icon and Select Edit		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='slds-icon_container slds-icon-utility-down'])[1]")).click();

		driver.findElement(By.xpath("//a[@title='Edit']")).click();
		
		
//Step--07--Select Salutation as 'Mr'
		
		
		driver.findElement(By.xpath("//div[@class='salutation compoundTLRadius compoundTRRadius compoundBorderBottom form-element__row uiMenu']")).click();
		driver.findElement(By.xpath("(//li[@class='uiMenuItem uiRadioMenuItem'])[2]")).click();
		
//Step--08--Enter the first name as 'pon'
		driver.findElement(By.xpath("//input[@class='firstName compoundBorderBottom form-element__row input']")).click();
		driver.findElement(By.xpath("//input[@class='firstName compoundBorderBottom form-element__row input']")).sendKeys("Leo Doss");
		
		
//STep--09--Click on Save
		
		
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--brand uiButton forceActionButton']")).click();
		
//Step--10--Verify the first name as 'pon'		
		
		String text = driver.findElement(By.xpath("//a[text()='Leo Doss BosePandi']")).getText();
	
		System.out.println(text);
		
		if(text.contains("Leo Doss"))
			System.out.println("Name Verified");
		else
			System.out.println("Name not Verified");
		
		
		
		
		
		
		
		
		
		
		

	}

}
