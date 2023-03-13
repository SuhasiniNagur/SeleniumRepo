package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IframeSwithframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://Sami2/USERS/SUHASINI/Desktop/chrome file/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		
		Thread.sleep(2000);

		driver.findElement(By.linkText("org.openqa.selenium.cli")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
                     //driver.switchTo().defaultContent();
		
		Thread.sleep(1000);

		driver.switchTo().frame(2);

     	driver.findElement(By.linkText("By.Remotable")).click();

	}

}
