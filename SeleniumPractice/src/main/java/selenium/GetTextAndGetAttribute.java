package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome", "./drivers.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		//GetAttribute
		WebElement text = driver.findElement(By.id("join"));
		System.out.println(text.getAttribute("value"));
		
		//GetText
		WebElement text2 = driver.findElement(By.className("field"));
		System.out.println(text2.getText());
		
		Thread.sleep(2000);
		driver.quit();
	}
}
