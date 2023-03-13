package Programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckboxAndRadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://Sami2/USERS/SUHASINI/Desktop/chrome file/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();	
		Thread.sleep(2000);
		
		List<WebElement> a = driver.findElements(By.name("webform"));
		int num =  a.size();
		
		for(int i=0;i<num;i++) {
			a.get(i).click();
			
			Thread.sleep(2000);
			}

	}

}
