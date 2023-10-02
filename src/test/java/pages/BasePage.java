package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected static WebDriver base_page_driver ;
	
	


	public BasePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		base_page_driver=driver;
		
	}
	public static void wait_for_element(WebDriver driver,int time,By prenom  )
	{
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(prenom));
	}
	public static void navigate_to( String url ) 
	{
		base_page_driver.navigate().to(url);
	}
}
