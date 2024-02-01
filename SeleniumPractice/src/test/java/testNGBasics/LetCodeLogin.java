package testNGBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCodeLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/");
		
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.name("email")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("");
		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
	}

}
