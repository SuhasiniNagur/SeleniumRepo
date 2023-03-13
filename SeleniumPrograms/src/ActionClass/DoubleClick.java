package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://Sami2/USERS/SUHASINI/Desktop/chrome file/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);

		driver.get("http://www.uitestpractice.com/Students/Actions");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.name("dblClick"));
		Actions a = new Actions(driver);
		a.doubleClick(e).build().perform();
		driver.close();

	}

}
