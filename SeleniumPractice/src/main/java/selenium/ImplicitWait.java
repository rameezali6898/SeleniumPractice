package selenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	//normal fetching time is 500ms
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		//industry std 20 to 30 seconds only
		//its a one time declaration
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.name("email")).sendKeys("rrrrr@yahoo.com");
		driver.findElement(By.name("password")).sendKeys("qwer123");
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
	}

}
