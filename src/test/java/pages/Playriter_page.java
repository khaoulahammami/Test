package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Playriter_page extends BasePage{

	public Playriter_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	private By titrepage= By.xpath("//h1[@id='el_1656370108878_569']");
	
	
	public String verifier_msg() 
	{      
		BasePage.wait_for_element(base_page_driver,20,titrepage);
		String msg =base_page_driver.findElement(titrepage).getText();
	    return msg;
	}

}
