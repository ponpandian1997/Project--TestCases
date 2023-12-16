package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import testNg.ProjectSpecificMethod;




public class TC09_VerifySortingAccounts extends ProjectSpecificMethod {
	
	
	
@Test	

	public  void runVerifySorting() {

//Step--1--Click on Sales
	
	driver.findElement(By.xpath("//p[text()='Sales']")).click();
					
	 System.out.println("done");	
	
		
//Step--2--Click on Accounts tab
		
		       WebElement accounts = driver.findElement(By.xpath("//span[text()='Accounts']"));
		       driver.executeScript("arguments[0].click();", accounts);
	
//Step--3-- Click sort arrow in the Account Name to sort in ascending order
				 		
		
		
		driver.findElement(By.xpath("(//div[@class='slds-cell-fixed'])[2]")).click();

		System.out.println("Sorted Succesfully ");
		
	}

}
