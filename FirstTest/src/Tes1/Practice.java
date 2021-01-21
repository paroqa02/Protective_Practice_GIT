package Tes1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\proy\\\\Desktop\\\\Chro\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.id("email")).sendKeys("paroqa02@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("ABCD");
		driver.findElement(By.name("login")).click();

	}

}
