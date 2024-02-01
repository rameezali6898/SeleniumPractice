package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LetCodeLogin {
	
	@Parameters({"emailId","password"})
	@Test
	public  void parameters() {
		
		System.out.println();
//		System.setProperty("webdriver.chrome", "./drivers/chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		
//		driver.get("https://letcode.in/");
//		
//		driver.findElement(By.linkText("Log in")).click();
//		
//		driver.findElement(By.name("email")).sendKeys("koushik350@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Pass123$");
//		driver.findElement(By.xpath("//button[.='LOGIN']")).click();
	}

}
