package Tes1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nonprod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\proy\\Desktop\\Chro\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://protective-nonprod-protectiveapideveloperportal.apigee.io/");
        System.out.println(driver.getTitle());
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='nav-header-link-apis']")).click();
        Thread.sleep(4000);
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.name("username")).sendKeys("proy@protectiveinsurance.com");
        driver.findElement(By.name("password")).sendKeys("abcd");
        driver.findElement(By.id("login-button")).click();
        

	}

}
