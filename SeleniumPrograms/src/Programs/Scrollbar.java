package Programs;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scrollbar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://Sami2/USERS/SUHASINI/Desktop/chrome file/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.flipkart.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		JavascriptExecutor   j  =  (JavascriptExecutor)driver;

		j.executeScript("window.scrollBy(0,1000)");

		Thread.sleep(2000);

		j.executeScript("window.scrollBy(0,-1000)");

	}

}
