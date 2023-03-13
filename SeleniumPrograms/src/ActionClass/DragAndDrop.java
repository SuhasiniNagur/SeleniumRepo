package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://Sami2/USERS/SUHASINI/Desktop/chrome file/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.id("mongo"));
		WebElement target = driver.findElement(By.id("droparea"));
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
		
		Thread.sleep(3000);
//		driver.close();
	}

}
