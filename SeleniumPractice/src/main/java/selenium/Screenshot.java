package selenium;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {
		
		//System.setProperty("webdriver.chrome", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/buttons");
		
		//Take screenshot for entire visible page
		File firstScr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   //we typecasting takesscreenshot class for driver
		File destination = new File("./screenshots/img1.png");
		FileHandler.copy(firstScr, destination);
		
		//Take screenshot for particular element
		WebElement element = driver.findElement(By.id("color"));
		//File elementScr = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		
		WebElement element2 = driver.findElement(By.id("property"));
		File elementScr = element2.getScreenshotAs(OutputType.FILE);
		File elementDest = new File("./screenshots/img3.png");
		FileHandler.copy(elementScr, elementDest);
		
		//Screenshot for certain part 
		WebElement element3 = driver.findElement(By.xpath("//div[@class='content']"));
		File element2scr = element3.getScreenshotAs(OutputType.FILE);
		File ele2Dest = new File("./screenshots/img4.png");
		FileHandler.copy(element2scr, ele2Dest);
		
		driver.quit();
	}
}
