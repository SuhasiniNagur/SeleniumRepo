package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class GetOptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E://Sami2/USERS/SUHASINI/Desktop/chrome file/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://techcanvass.com/Examples/multi-select.html");

		WebElement a  = driver.findElement(By.xpath("/html/body/div/form/fieldset/select"));

		Select s = new Select(a);
		List<WebElement> b = s.getOptions();
		int c =b.size();//6
		System.out.println(c);

		for(int i=0;i<=c-1;i++) {//0,1,2,3,4,5,
		String d =b.get(i).getText();
		System.out.println(d);//volvo
		Thread.sleep(2000);
		}
		driver.close();
	}

}
