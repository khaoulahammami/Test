package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class verif_page extends BasePage{

	public verif_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		}
		private By button_resend_mail = By.xpath("//*[@id='el_1674578472928_430']");
		private By button_return_to_site=By.xpath("//*[@id='el_1676988964088_480']");
		
		
		public String verifier_msg() 
		{      
			BasePage.wait_for_element(base_page_driver,20,button_resend_mail);
			String msg =base_page_driver.findElement(button_resend_mail).getText();
		    return msg;
		}
		public void retourner_register()
		{
			Actions a = new Actions(base_page_driver);
			a.moveToElement(base_page_driver.findElement(button_return_to_site)).click().build().perform();  
		    
		}
		
}
