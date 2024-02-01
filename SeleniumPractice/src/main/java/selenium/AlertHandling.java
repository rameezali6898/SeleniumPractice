package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/alert");
		
		//Simple Alert
		driver.findElement(By.id("accept")).click();
		Alert alert = driver.switchTo().alert();
		String alertMessage = alert.getText();
		System.out.println(alertMessage);
		alert.accept();
		
		//Confirm alert
		driver.findElement(By.id("confirm")).click();
		Alert alert1 = driver.switchTo().alert();
		String alertMessage1 = alert1.getText();
		System.out.println(alertMessage1);
		alert1.dismiss();
		
		//Prompt Alert
		driver.findElement(By.id("prompt")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		driver.switchTo().alert().sendKeys("This is Testing");
		alert.accept();
		String text = driver.findElement(By.id("myName")).getText();
		System.out.println(text);
		
		driver.quit();
	}
}
