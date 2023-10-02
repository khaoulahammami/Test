package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class verification_login_page extends BasePage{

	public verification_login_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By button_Language= By.linkText("English Language");
	
	
	
	public String verifier_msg() 
	{      
		BasePage.wait_for_element(base_page_driver,20,button_Language);
		String msg =base_page_driver.findElement(button_Language).getText();
	    return msg;
	}
	public void click_on_english_button( ) 
	{
		BasePage.wait_for_element(base_page_driver,100,button_Language);
		Actions a = new Actions(base_page_driver);
	    a.moveToElement(base_page_driver.findElement(button_Language)).click().build().perform();
	}
}
