package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://Sami2/USERS/SUHASINI/Desktop/chrome file/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("http://demo.guru99.com/test/upload/");

		driver.manage().window().maximize();

		Thread.sleep(2000);


		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

		// enter the file path onto the file-selection input field

		uploadElement.sendKeys("E://Sami2//USERS//SUHASINI//Desktop//abc.bmp");


		// check the "I accept the terms of service" check box

		driver.findElement(By.id("terms")).click();

		// click the "UploadFile" button

		driver.findElement(By.name("send")).click();

	}

}
