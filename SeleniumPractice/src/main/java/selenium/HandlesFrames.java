package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlesFrames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://letcode.in/frame");

		//get into the 1st frame
		driver.switchTo().frame(0);    //=> we can also use frame indexno, id, name
		driver.findElement(By.name("fname")).sendKeys("Rameez");
		//frame is used to place a html file inside a html file or place some adv inside the site
		//also change design/style pattern of some topics

		//switchto.frame => switch in to the frame
		//switchto.parentframe => one step back
		//switchto.defaultcontent => instant back to main page

		
		//get into the next frame
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.name("email")).sendKeys("rj@yahoo.com");
		
		//return to the 1st frame
		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).sendKeys("zeemar");
		
		//return to the main page
		//driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@class='card-footer-item']")).click();
	}
}
