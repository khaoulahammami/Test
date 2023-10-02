package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class english_page extends BasePage {

	public english_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
    private By buttonBootcamp =By.cssSelector("#el_1662548420536_423");
    private By buttonTrainning =By.linkText("Trainings");
    private By buttonMeeting =By.linkText("Meetups");
    private By imageplayriter= By.xpath("//h3[contains(text(),'Mastering Playwright: Building a Robust Production')]");
    
    public void click_on_Bootcamp( ) 
	{
		
		navigate_to("https://qacart.com/en");
		Actions a = new Actions(base_page_driver);
	    a.moveToElement(base_page_driver.findElement(buttonBootcamp)).click().build().perform();
	}
    public void click_on_Trainning( ) 
   	{
   		BasePage.wait_for_element(base_page_driver,100,buttonTrainning);
   		Actions a = new Actions(base_page_driver);
   	    a.moveToElement(base_page_driver.findElement(buttonTrainning)).click().build().perform();
   	}
    public void click_on_Meeting( ) 
   	{
   		BasePage.wait_for_element(base_page_driver,100,buttonMeeting);
   		Actions a = new Actions(base_page_driver);
   	    a.moveToElement(base_page_driver.findElement(buttonMeeting)).click().build().perform();
   	}
    public void click_on_Playriter( ) {
    	Actions a = new Actions(base_page_driver);
    	BasePage.wait_for_element(base_page_driver,100,imageplayriter);
   	    a.moveToElement(base_page_driver.findElement(imageplayriter)).click().build().perform();
   	}
}
