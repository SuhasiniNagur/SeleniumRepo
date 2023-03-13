package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo2 {

	@FindBy(xpath = "//a[@class='gb_f'][1]")
	private WebElement GMAIL;

	public Demo2(WebDriver driver)
	{
	    PageFactory.initElements(driver,this) ;
	}

	public void gmail() {
		
		GMAIL.click();

}
}