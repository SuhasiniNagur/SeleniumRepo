package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://Sami2/USERS/SUHASINI/Desktop/chrome file/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://techcanvass.com/Examples/multi-select.html");

		WebElement a  = driver.findElement(By.xpath("/html/body/div/form/fieldset/select"));
		Select s = new Select(a);

		s.selectByVisibleText("Maruti Suzuki");
        Thread.sleep(3000);
        driver.close();
	}

}
