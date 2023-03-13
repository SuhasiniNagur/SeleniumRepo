package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestClass {

     public static void main(String[] args) throws InterruptedException {

		    System.setProperty("webdriver.chrome.driver", "E://Sami2/USERS/SUHASINI/Desktop/chrome file/chromedriver.exe");
		    ChromeOptions options = new ChromeOptions();
		    options.addArguments("--remote-allow-origins=*");
		
	    	WebDriver driver = new ChromeDriver(options);
			driver.get("https://www.google.co.in/");
			driver.manage().window().maximize();	
			Thread.sleep(2000);
			
			Demo1  pom = new Demo1(driver);
			pom.search();
			
			Thread.sleep(2000);
			
			Demo2  pom1 = new Demo2(driver);
			pom1.gmail();
             
			Thread.sleep(1000);
			driver.close();
	}

}
