package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetCodeEdit {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/edit");
		
		driver.findElement(By.id("fullName")).sendKeys("Rameez");
		driver.findElement(By.id("join")).sendKeys(" person",Keys.TAB);
		
		String myValue = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(myValue);
		
		driver.findElement(By.id("clearMe")).clear();
		
		boolean isEdit = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(isEdit);
		
				
		String isReadOnly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(isReadOnly);
		//For Check
		String isEditt = driver.findElement(By.id("noEdit")).getAttribute("readonly");
		System.out.println(isEdit);
		
		driver.quit();
	}

}
