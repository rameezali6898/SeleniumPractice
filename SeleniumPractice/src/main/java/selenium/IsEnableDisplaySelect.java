package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnableDisplaySelect {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.driver", "./drivers.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
//		driver.get("https://letcode.in/");
//		WebElement isEnabled = driver.findElement(By.linkText("Log in"));
//		System.out.println(isEnabled.isEnabled());
		
//		driver.get("https://letcode.in/edit");
//		WebElement isDisabled = driver.findElement(By.id("noEdit"));
//		System.out.println(isDisabled.isEnabled());

		driver.get("https://letcode.in/radio");
		WebElement isSelected = driver.findElement(By.id("notfoo"));
		System.out.println(isSelected.isSelected());
		
		
		
	}
}
