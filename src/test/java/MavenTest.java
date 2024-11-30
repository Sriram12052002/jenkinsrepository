import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenTest {
WebDriver driver;
	@Test(priority = 1)
	public void openChrome() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		System.out.println("chrome  opened");
	}
	
	
	@Test(priority = 2)
	void closeChrome() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
		System.out.println("chrome  closed");
	}
}
