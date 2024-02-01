package selenium;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteracteWithActiveElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.get("https://www.facebook.com/login/");

		WebElement activeElement = driver.switchTo().activeElement();
		activeElement.sendKeys("google@yahoo.com",Keys.TAB,"87654321",Keys.ENTER);
		driver.quit();
	}

}
