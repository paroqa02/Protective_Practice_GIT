package Tes1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTest {

	public static void main(String[] args) {
		String A="abcd";
		//System.setProperty("Webdriver.chrome.driver", "C:\\Users\\proy\\Desktop\\Chro\\chromedriver.exe");
		System.setProperty("WebDriver.Firefox.driver", "C:\\Users\\proy\\Desktop\\FirstProject\\FirstTest\\geckodriver-v0.27.0-win64 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("6823006222");
		driver.findElement(By.id("pass")).sendKeys(A);
		driver.findElement(By.id("u_0_b")).click();
		//WebElement P=driver.findElement(By.className("9ay7"));
		System.out.println("Password is incorrect");
		
		
		String AT = driver.getTitle();
		String ET ="Facebook - Log In or Sign Up";
		
/*		if
				(AT.equalsIgnoreCase(ET)) {
			System.out.println("Test case is passed");
		}
		else
			System.out.println("Test case is failed");
	}*/

}
}

