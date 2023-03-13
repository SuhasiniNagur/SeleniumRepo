package FunctionOFWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://Sami2/USERS/SUHASINI/Desktop/chrome file/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://demo.guru99.com/test/radio.html ");
		driver.manage().window().maximize();
		Thread.sleep(2000);
						
		driver.findElement(By.id("vfb-7-1")).click();
						
		Thread.sleep(2000);

		Boolean abc = driver.findElement(By.id("vfb-7-1")).isSelected();
		System.out.println(abc);
	}

}
