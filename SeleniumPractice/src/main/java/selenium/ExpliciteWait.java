package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//Alert is present condition
		driver.get("https://letcode.in/waits");
		
		WebElement button = driver.findElement(By.xpath("//button[@id='accept']"));
		button.click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		Alert until = wait.until(ExpectedConditions.alertIsPresent());
		//These two conditions are learning purpose only
		wait.until(ExpectedConditions.invisibilityOf(button));
		wait.until(ExpectedConditions.invisibilityOf(button));
		
		System.out.println(until.getText());
		until.accept();
		//driver.switchTo().alert().accept();            ---->we can done by this type also
		
		//driver.get("https://letcode.in/signin");
		//driver.findElement(By.)
		
	}
}
