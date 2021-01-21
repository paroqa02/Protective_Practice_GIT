package Tes1;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Validationcheck {

	public WebDriver driver;

	@Test
	public void LaunchBrowser() throws InterruptedException
	{
		String baseURL ="https://protective-nonprod-protectiveapideveloperportal.apigee.io/";
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\proy\\\\Desktop\\\\Chro\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id='nav-header-link-apis']")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("username")).sendKeys("proy@protectiveinsurance.com");
		driver.findElement(By.name("password")).sendKeys("abcd");
		driver.findElement(By.id("login-button")).click();
		System.out.println("Launching Protective new API " + driver.getCurrentUrl());

	}
	@Test
	public void verifyHomePageTitle()
	{

		String expectedTitle ="protective-nonprod-protectiveapideveloperportal";
		String actualTitle = driver.getTitle();
		System.out.println("The screenTitle is " + actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);

	}

}

