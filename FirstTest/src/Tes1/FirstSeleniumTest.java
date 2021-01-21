package Tes1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSeleniumTest {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.firefox.driver", "C:\\Users\\proy\\Desktop\\FirstProject\\FirstTest\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");	
		System.out.println(driver.getTitle()); //validate if the page title is correct
		System.out.println(driver.getCurrentUrl()); //validate if you landed on correct URL
		//System.out.println(driver.getPageSource());//validate if page source is returned 
		
		driver.get("http://www.google.com");
		Thread.sleep(4000);
		driver.navigate().back();
		//driver.navigate().forward();
		

	} 

}
