package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "E://Sami2/USERS/SUHASINI/Desktop/chrome file/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://demo.guru99.com/test/delete_customer.php ");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.name("cusid")).sendKeys("53920");

		Thread.sleep(2000);

		driver.findElement(By.name("submit")).click();

		Thread.sleep(2000);


		//driver.switchTo().alert().accept();//for click on OK button

		//driver.switchTo().alert().dismiss();//for click on cancel button

		//Thread.sleep(2000);

		//driver.switchTo().alert().accept();

		String abc = driver.switchTo().alert().getText();
		System.out.println(abc);


	}

}
