package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC04_VerifyOpportunitiessortorderbyClosedate {

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
				
//Step--6--Select the Table view
				
				
				driver.findElement(By.xpath("//div[@title='Select list display']")).click();
				//Thread.sleep(3000);
				WebElement tableview = driver.findElement(By.xpath("(//span[@class='slds-truncate'])[26]"));
				driver.executeScript("arguments[0].click(); ", tableview);
				
//Step--7--Sort the Opportunities by Close Date in ascending order
				
				driver.findElement(By.xpath("(//div[@class='slds-cell-fixed'])[6]")).click();
		
		
//Step--8-- Verify the  Opportunities displayed in ascending order by Close date	
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
				WebElement title=driver.findElement(By.xpath("(//span[text()='26/10/2023'])[1]"));
				wait1.until(ExpectedConditions.stalenessOf(title));
				driver.findElement(By.xpath("(//span[text()='26/10/2023'])[1]")).click();
				String text = driver.findElement(By.xpath("(//span[text()='26/10/2023'])[1]")).getText();
		
				System.out.println(text);

				String replaceAll = text.replaceAll("[^0-9]", "");
				int parseInt1 = Integer.parseInt(replaceAll);
				
				//Thread.sleep(3000);
//				WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));
//				WebElement title1=driver.findElement(By.xpath("(//span[text()='28/11/2023'])[1]"));
//				wait2.until(ExpectedConditions.stalenessOf(title1));
				driver.findElement(By.xpath("(//span[@class='uiOutputDate'])[6]")).click();
				String text1 = driver.findElement(By.xpath("(//span[@class='uiOutputDate'])[6]")).getText();
				
				System.out.println(text1);

				String replaceAll1 = text1.replaceAll("[^0-9]", "");
				int parseInt2 = Integer.parseInt(replaceAll1);
				
				if (parseInt1>parseInt2) {
					System.out.println("Opportunities displayed in ascending order its verified");
				}
				else {
					System.out.println("Opportunities displayed is Not in ascending order");
				}
				
				
				//setTimeout(function(){debugger;}, 5000)			
				
				
				//9176075741 dhanapal 
				
				//poNPANDI AKAK
				
				
	}

}
