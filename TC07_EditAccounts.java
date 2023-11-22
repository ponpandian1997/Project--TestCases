package project;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNg.ProjectSpecificMethod;

public class TC07_EditAccounts  extends ProjectSpecificMethod{
	
	
	
	
@Test
	

	public  void runEditAccounts() throws InterruptedException {
		

				  
//Step--1-- Click on Accounts
				
				  WebElement accounts =
				  driver.findElement(By.xpath("(//span[@class='slds-truncate'])[7]"));
				  driver.executeScript("arguments[0].click();", accounts);
				 	
//Step--2--	Search for the Account Using the unique account name created by you 	
				  
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='slds-input']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("ponpandi" , Keys.ENTER);
		
		
//Step--3--	Click on the displayed Account Drop-down icon and select Edit	
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='slds-icon_container slds-icon-utility-down'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='uiMenuItem'])[1]")).click();
		
		
//Step--4-- Select Type as Technology Partner	
		
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[2]")).click();
		driver.findElement(By.xpath("(//span[@class='slds-truncate'])[32]")).click();
		
		
//Step--5--Select Industry as Health care	
		
		
		WebElement health = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[4]"));
	    driver.executeScript("arguments[0].click();", health);	
		WebElement care = driver.findElement(By.xpath("(//span[@class='slds-truncate'])[54]"));
		driver.executeScript("arguments[0].click();", care);
		
	
//Step--6--Enter Billing Address 		
		
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[1]")).click();
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[1]")).clear();
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[1]")).sendKeys("cheyyur /n paramankeni /n chnegalpattu district");
		
		
//Step--7--Enter Shipping Address		
		
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).click();
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).clear();
		driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("zoho pvt ltd /n chennai/n software solutions");
		
		
//Step--8--Select Customer Priority as Low
		
		WebElement customer = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[5]"));
		driver.executeScript("arguments[0].click();", customer);
		driver.findElement(By.xpath("//span[text()='Low']")).click();
		
//Step--9--Select SLA as Silver
		
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[6]")).click();
		driver.findElement(By.xpath("(//span[@class='slds-truncate'])[76]")).click();
		
//Step--10--Select Active as NO 
		
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[8]")).click();
		driver.findElement(By.xpath("(//span[@class='slds-truncate'])[82]")).click();
		

//Step--11-- Enter Unique Number in Phone Field 
		WebElement phone = driver.findElement(By.xpath("(//input[@class='slds-input'])[3]"));
		driver.executeScript("arguments[0].click();", phone);
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("883838615");
		
//Step--12--Select Up sell Opportunity as No	
		
		WebElement opportunity = driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[7]"));
		driver.executeScript("arguments[0].click();", opportunity);
		driver.findElement(By.xpath("(//span[@class='slds-truncate'])[82]")).click();
		
//Step--13--Click on save 
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
	
//Step--14--verify Phone number		
		
		Thread.sleep(4000);
		
		String pnum = driver.findElement(By.xpath("(//span[text()='883838615'])[2]")).getText();
		
		System.out.println(pnum);
		
	if(pnum=="883838615")
			
			System.out.println("phone Number is Verified");
		
		else 
			System.out.println("phone Number is Not Verified");
		
		
		
			
		}

}
