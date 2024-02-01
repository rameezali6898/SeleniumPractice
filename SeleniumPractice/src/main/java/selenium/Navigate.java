package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://letcode.in/buttons");
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		driver.findElement(By.id("home")).click();
		String homePageURL = driver.getCurrentUrl();
		System.out.println(homePageURL);

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.navigate().to("https://letcode.in/signin");
		String navigatedURL = driver.getCurrentUrl();
		System.out.println(navigatedURL);
		
		driver.quit();
		
		
		//windows authentication is not an alert its different (yes/no/put some inputs)
	}

}
