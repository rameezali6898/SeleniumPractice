package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThrowVsThrows {

	public void code() throws InterruptedException {
		Thread.sleep(3000);
	}
	
	public void codes() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThrowVsThrows tt = new ThrowVsThrows();
		tt.code();
		tt.codes();
	}
	
}
