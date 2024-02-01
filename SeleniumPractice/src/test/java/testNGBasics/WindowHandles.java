package testNGBasics;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {

	@Test
	public void handling() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		driver.get("https://letcode.in/windows");
		driver.findElement(By.xpath("//button[@id='home']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		//We use list for get function then only we naviate to the particular window
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		list.clear();
		list.addAll(windowHandles1);
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}
