package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome", "C:\\Users\\rmohamedibrahim\\Eclipse_for_Selenium\\SeleniumPractice\\drivers\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
	}
}
