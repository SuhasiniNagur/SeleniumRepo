package Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TotalNumberOfLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://Sami2/USERS/SUHASINI/Desktop/chrome file/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();	
		Thread.sleep(2000);
		
		List<WebElement> abc = driver.findElements(By.tagName("a"));
		int num = abc.size();
		System.out.println(num);
		
		for(int i=0;i<=num-1;i++) {
			String c = abc.get(i).getText();
			Thread.sleep(1000);
			System.out.println(c);
		}

	}

}
