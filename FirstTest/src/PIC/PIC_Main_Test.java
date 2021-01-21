package PIC;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PIC_Main_Test {
	public WebDriver driver;
	
//Launch Protective Insurance Home screen
	
	@Test
	public void LaunchPICBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\proy\\Desktop\\Chro\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.protectiveinsurance.com/");
		System.out.println("The Title is : " + driver.getTitle());
		Thread.sleep(4000);
	}
	@Test
	public void TitleTest()
	{

		String expectedTitle = "Protective Insurance Login";
		String actualTitle;
		actualTitle= driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);

	}
//Navigate to My Account screen & click claim link
		@Test
		public void MyAccount() throws InterruptedException
		{
			driver.findElement(By.linkText("MY ACCOUNT")).click();
			Thread.sleep(4000);
			//creating new object:  newWindow
			Set<String> newWindow = driver.getWindowHandles();
			//Iterate using Iterator 
			Iterator<String> tab =  newWindow.iterator();
			//create object on main window1
			String parent=tab.next();
			String child= tab.next();
			driver.switchTo().window(child);
			System.out.println("Current URL : " + driver.getCurrentUrl());
			Thread.sleep(1000);
			driver.findElement(By.linkText("Claims")).click();
			Thread.sleep(1000);
		}
//Login  and select any account
		@Test
		public void loginClaim() throws InterruptedException
		{
			driver.findElement(By.id("ctl00_PlaceHolderMain_signInControl_UserName")).sendKeys("proy@protectiveinsurance.com");
			driver.findElement(By.id("ctl00_PlaceHolderMain_signInControl_password")).sendKeys("3XpkZd54rK");
			driver.findElement(By.id("ctl00_PlaceHolderMain_signInControl_login")).click();
			System.out.println("CurrentURL : " + driver.getCurrentUrl());   
			Thread.sleep(4000);
			Select s= new Select(driver.findElement(By.id("AccountSelect")));
			s.selectByVisibleText("Canyon Transportation, Inc.");
			Thread.sleep(4000);
			WebElement radio1= driver.findElement(By.name("InsuranceType"));
			radio1.click();
			Thread.sleep(4000);
			WebElement checkbox= driver.findElement(By.name("PolicySelector"));
			checkbox.click();
			Thread.sleep(4000);
			WebElement c2= driver.findElement(By.id("SearchByClaim"));
			c2.click();
			Thread.sleep(4000);
			driver.findElement(By.id("SearchBtn")).click();
			Thread.sleep(4000);
			WebElement c3 = driver.findElement(By.name("ClaimSelector"));
			c3.click();
			driver.findElement(By.id("ViewBtn")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("DetailsHeader")).click();
			Thread.sleep(4000);
			driver.findElement(By.id("TransactionsHeaderText")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(100,30000)");
			Thread.sleep(25000);

		}


//Close the all window
		@Test
		public void quit() {
			
			driver.quit();
			
		}
	}
