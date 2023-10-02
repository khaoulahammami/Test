package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class register_page extends BasePage{
	

	
	public register_page(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	private By registerButton =By.xpath("//*[@id='menuItem_1634342075350_13']");
	private By prenom =By.id("username");
	private By mail =By.id("email");
	private By Password=By.xpath("(//div[@class='form-control-wrapper']//input[@name='password'])[2]");
	private By ville =By.xpath("//input[@data-key='cf_country' and @name='extralogin-cf_country']");
	private By cocheButton=By.cssSelector(".lnd-checkmark-lbl");
	private By validationButton=By.xpath("//span[contains(text(),'Start your learning journey')]");
	
	
	
	private By login_button = By.xpath("//ul[contains(@class,'lw-topbar-option')]/li[7]/a/span");
	private By mail_Login =By.xpath("//div[@class='mb-10 email-input-wrapper']//input[@type='email']");
	private By motDePasse_login =By.xpath("//div[@class='mb-20 pass-input-wrapper']//input[@type='password']");
	private By valider_login =By.id("submitLogin");

	
	public void click_on_register( ) 
	{
		BasePage.wait_for_element(base_page_driver,100,registerButton);
		Actions a = new Actions(base_page_driver);
	    a.moveToElement(base_page_driver.findElement(registerButton)).click().build().perform();
	}
	
	public void remplir_prenom(String prenomm) 
	{   BasePage.wait_for_element(base_page_driver,20,prenom);
		base_page_driver.findElement(prenom).sendKeys(prenomm);
	}
	public void remplir_mail(String email) 
	{
		BasePage.wait_for_element(base_page_driver,20,mail );
		base_page_driver.findElement(mail).sendKeys(email);
	}
	public void remplir_motDePasse (String nomm) 
	{
		BasePage.wait_for_element(base_page_driver,20,Password );
		base_page_driver.findElement(Password).sendKeys(nomm);
		
	}
	public void remplir_ville(String country) 
	{
		BasePage.wait_for_element(base_page_driver,20,ville );
		base_page_driver.findElement(ville).sendKeys(country);
		
	}
	public void cocher_case_a_cocher() 
	{
		BasePage.wait_for_element(base_page_driver,20,cocheButton );
		base_page_driver.findElement(cocheButton).click();
		
	}
	public void valider_formulaire() 
	{
		BasePage.wait_for_element(base_page_driver,20,validationButton );
		base_page_driver.findElement(validationButton).click();
		
	}
	
	public void click_on_login( ) 
	{
		BasePage.wait_for_element(base_page_driver,100,login_button);
		Actions a = new Actions(base_page_driver);
	    a.moveToElement(base_page_driver.findElement(login_button)).click().build().perform();
	}
	public void remplir_mail_login(String email) 
	{
		BasePage.wait_for_element(base_page_driver,20,mail_Login );
		base_page_driver.findElement(mail_Login).sendKeys(email);
	}
	public void remplir_pasword_login(String pass) 
	{
		BasePage.wait_for_element(base_page_driver,20,motDePasse_login );
		base_page_driver.findElement(motDePasse_login).sendKeys(pass);
	}
	public void valider_login( ) 
	{
		
		Actions a = new Actions(base_page_driver);
	    a.moveToElement(base_page_driver.findElement(valider_login)).click().build().perform();
	}
}

