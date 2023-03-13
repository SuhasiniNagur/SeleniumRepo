package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demo1 {
	
		@FindBy(xpath="//input[@name='q']")  
		   private WebElement SEARCH;
			
			public Demo1(WebDriver driver)
			{
			    PageFactory.initElements(driver,this) ;
			}
			
			
			public void search() {
				
				SEARCH.sendKeys("Selenium");
		
	}

}
